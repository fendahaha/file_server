package com.example.file_server.config.messageBroker;

import com.example.file_server.entity.User;
import com.example.file_server.service.impl.GiftSendRecordServiceImpl;
import com.example.file_server.service.impl.UserServiceImpl;
import com.example.file_server.utils.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;

import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.util.List;

@Component
public class MyChannelInterceptor implements ChannelInterceptor {
    @Autowired
    private UserServiceImpl userService;

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        SimpMessageHeaderAccessor headerAccessor = MessageHeaderAccessor.getAccessor(message, SimpMessageHeaderAccessor.class);
        MessageHeaders messageHeaders = headerAccessor.getMessageHeaders();
        LinkedMultiValueMap nativeHeaders = messageHeaders.get("nativeHeaders", LinkedMultiValueMap.class);
        if (headerAccessor != null && SimpMessageType.CONNECT.equals(headerAccessor.getMessageType())) {
            // 设置用户信息
            List users = nativeHeaders.get("user");
            if (!users.isEmpty()) {
                String userString = (String) users.get(0);
                try {
                    MyStompUserPrincipal user = JsonUtil.json2Object(userString, new TypeReference<>() {
                    });
                    if (user != null) {
                        User userByUUID = userService.getUserByUUID(user.getUserUuid());
                        if (userByUUID != null) {
                            headerAccessor.setUser(user);
                        }
                    }
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            }
        }

        if (headerAccessor != null && SimpMessageType.SUBSCRIBE.equals(headerAccessor.getMessageType())) {
            System.out.println("SUBSCRIBE");
        }

        if (headerAccessor != null && SimpMessageType.MESSAGE.equals(headerAccessor.getMessageType())) {
            System.out.println("MESSAGE");
            Principal user = headerAccessor.getUser();
            if (user != null && user.getClass().equals(MyStompUserPrincipal.class)) {
                MyStompUserPrincipal u = (MyStompUserPrincipal) user;
                byte[] payload = (byte[]) message.getPayload();
                String s = new String(payload, StandardCharsets.UTF_8);
            } else {
                throw new RuntimeException("未登录用户");
            }
        }

        if (headerAccessor != null && SimpMessageType.HEARTBEAT.equals(headerAccessor.getMessageType())) {
            System.out.println("HEARTBEAT");
        }

        return message;
    }
}
