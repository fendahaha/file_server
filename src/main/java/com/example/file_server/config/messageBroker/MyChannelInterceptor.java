package com.example.file_server.config.messageBroker;

import com.example.file_server.dictionary.MessageType;
import com.example.file_server.utils.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageHeaderAccessor;

import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.util.HashMap;

public class MyChannelInterceptor implements ChannelInterceptor {
    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        SimpMessageHeaderAccessor headerAccessor = MessageHeaderAccessor.getAccessor(message, SimpMessageHeaderAccessor.class);

        if (headerAccessor != null && SimpMessageType.CONNECT.equals(headerAccessor.getMessageType())) {
            // 设置用户信息
            headerAccessor.setUser(new Principal() {
                @Override
                public String getName() {
                    return "fffkk";
                }
            });
        }

        if (headerAccessor != null && SimpMessageType.SUBSCRIBE.equals(headerAccessor.getMessageType())) {
            System.out.println("SUBSCRIBE");
        }

        if (headerAccessor != null && SimpMessageType.MESSAGE.equals(headerAccessor.getMessageType())) {
            System.out.println("MESSAGE");
            byte[] payload = (byte[]) message.getPayload();
            String s = new String(payload, StandardCharsets.UTF_8);
            try {
                MessageEntity messageEntity = JsonUtil.json2Object(s, new TypeReference<MessageEntity>() {
                });
                if (MessageType.Gift.equals(messageEntity.getType())) {
                    System.out.println(messageEntity.getData());
                    System.out.println(messageEntity.getTime());
                }
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }

        if (headerAccessor != null && SimpMessageType.HEARTBEAT.equals(headerAccessor.getMessageType())) {
            System.out.println("HEARTBEAT");
        }

        return message;
    }
}
