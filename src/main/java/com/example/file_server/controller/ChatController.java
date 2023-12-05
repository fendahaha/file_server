package com.example.file_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.config.WebSocketMessageBrokerStats;

import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RequestMapping("/chat")
@Controller
public class ChatController {
    @Autowired
    private WebSocketMessageBrokerStats webSocketMessageBrokerStats;
    private SimpMessagingTemplate template;

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

}
