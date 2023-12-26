package com.example.file_server.controller;

import com.example.file_server.config.messageBroker.MessageEntity;
import com.example.file_server.dictionary.MessageType;
import com.example.file_server.entity.Gift;
import com.example.file_server.service.impl.AnchorServiceImpl;
import com.example.file_server.utils.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.config.WebSocketMessageBrokerStats;

import java.security.Principal;
import java.util.Date;
import java.util.HashMap;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RequestMapping("/chat")
@Controller
public class ChatController {
    @Autowired
    private WebSocketMessageBrokerStats webSocketMessageBrokerStats;
    private SimpMessagingTemplate template;

    @Autowired
    private AnchorServiceImpl anchorService;
    private String getTimestamp() {
        long time = new Date().getTime();
        return "" + time;
    }

    @RequestMapping("/getStats")
    @ResponseBody
    public String getStats() {
        return webSocketMessageBrokerStats.getWebSocketSessionStatsInfo();
    }

    @Autowired
    public ChatController(SimpMessagingTemplate template) {
        this.template = template;
    }

    @RequestMapping(path = "/greetings", method = POST)
    @ResponseBody
    public String greet(String greeting) {
        String text = "[" + getTimestamp() + "]:" + greeting;
        this.template.convertAndSend("/topic/greetings", text);
        return "ok";
    }

    @MessageMapping("/greeting")
    @SendTo({"/topic/greeting", "/queue/greeting"})
    public String handle(String greeting) {
        return "[" + getTimestamp() + "]: " + greeting;
    }

    @MessageMapping("/greeting2")
    public void handle2(@Payload String greeting,
                        MessageHeaderAccessor messageHeaderAccessor,
                        SimpMessageHeaderAccessor simpMessageHeaderAccessor,
                        StompHeaderAccessor stompHeaderAccessor) {
        this.template.convertAndSend("/topic/greeting2", greeting);
    }

    @MessageMapping("/greeting3")
    public void touser(@Payload String username) {
        this.template.convertAndSendToUser(username, "/queue/position-updates", "hello-payload");
    }

    @GetMapping("/user")
    @ResponseBody
    public Object index(String name) {
        this.template.convertAndSendToUser(name, "/queue/person", "hello-payload");
        return "ok";
    }

    @MessageMapping("/gift")
    public void giftSend(@Payload String messageBody, SimpMessageHeaderAccessor headerAccessor) {
        Principal user = headerAccessor.getUser();
        MessageHeaders messageHeaders = headerAccessor.getMessageHeaders();
        LinkedMultiValueMap nativeHeaders = messageHeaders.get("nativeHeaders", LinkedMultiValueMap.class);
        try {
            MessageEntity messageEntity = JsonUtil.json2Object(messageBody, new TypeReference<MessageEntity>() {
            });
            if (MessageType.Gift.equals(messageEntity.getType())) {
                Gift gift = JsonUtil.json2Object(messageEntity.getData(), new TypeReference<Gift>() {
                });
                String anchorUserUuid = (String) nativeHeaders.get("anchorUserUuid").get(0);
                String anchorUserName = (String) nativeHeaders.get("anchorUserName").get(0);
                String room_topic = (String) nativeHeaders.get("room_topic").get(0);
                String clientUserUuid = (String) nativeHeaders.get("clientUserUuid").get(0);
                String clientUsername = (String) nativeHeaders.get("clientUserName").get(0);
                try {
                    anchorService.receiveGift(clientUserUuid, clientUsername, anchorUserUuid, anchorUserName,
                            gift.getGiftUuid(), gift.getGiftName(), gift.getGiftValue());
                    this.template.convertAndSend(room_topic, messageBody);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("type", "error");
                    map.put("msg", ex.getMessage());
                    this.template.convertAndSendToUser(user.getName(), "/queue/person", JsonUtil.map2Json(map));
                }
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            this.template.convertAndSendToUser(user.getName(), "/queue/person", e.getMessage());
        }

    }

}
