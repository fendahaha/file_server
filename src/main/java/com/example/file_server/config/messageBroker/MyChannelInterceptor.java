package com.example.file_server.config.messageBroker;

import com.example.file_server.dictionary.MessageType;
import com.example.file_server.entity.User;
import com.example.file_server.service.impl.UserServiceImpl;
import com.example.file_server.utils.OnlineUserManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.stereotype.Component;

import java.security.Principal;
import java.util.Map;

@Component
public class MyChannelInterceptor implements ChannelInterceptor {
    private UserServiceImpl userService;
    private OnlineUserManager onlineUserManager;
    private SimpMessagingTemplate template;

    @Autowired
    public MyChannelInterceptor(UserServiceImpl userService, OnlineUserManager onlineUserManager, @Lazy SimpMessagingTemplate template) {
        this.userService = userService;
        this.onlineUserManager = onlineUserManager;
        this.template = template;
    }

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        SimpMessageHeaderAccessor headerAccessor = MessageHeaderAccessor.getAccessor(message, SimpMessageHeaderAccessor.class);
        String sessionId = headerAccessor.getSessionId();
        if (headerAccessor != null) {
            Map<String, Object> sessionAttributes = headerAccessor.getSessionAttributes();
            String userUuid = (String) sessionAttributes.get("userUuid");
            String roomUuid = (String) sessionAttributes.get("roomUuid");
            if (SimpMessageType.CONNECT.equals(headerAccessor.getMessageType())) {
                onlineUserManager.user_increment(roomUuid, sessionId);
                // 设置用户信息
                if (!userUuid.equals("undefined") && !userUuid.equals("null")) {
                    User user = userService.getUser(userUuid);
                    if (user != null) {
                        User user1 = new User();
                        user1.setUserUuid(user.getUserUuid());
                        user1.setUserName(user.getUserName());
                        user1.setUserType(user.getUserType());
                        user1.setUserDisplayName(user.getUserDisplayName());
                        user1.setUserAvatar(user.getUserAvatar());
                        user1.setUserCountry(user.getUserCountry());
                        user1.setUserRole(user.getUserRole());
                        try {
                            onlineUserManager.put_login_user(roomUuid, userUuid, user1);
                        } catch (JsonProcessingException e) {
                            e.printStackTrace();
                        }
                        headerAccessor.setUser(new Principal() {
                            @Override
                            public String getName() {
                                return user.getUserUuid();
                            }
                        });
                    }
                }
            }

            if (SimpMessageType.SUBSCRIBE.equals(headerAccessor.getMessageType())) {
            }

            if (SimpMessageType.MESSAGE.equals(headerAccessor.getMessageType())) {
                Principal user = headerAccessor.getUser();
                if (user == null) {
                    throw new RuntimeException("未登录用户");
                }
            }

            if (SimpMessageType.HEARTBEAT.equals(headerAccessor.getMessageType())) {

            }

            if (SimpMessageType.DISCONNECT.equals(headerAccessor.getMessageType())) {
                onlineUserManager.user_decrement(roomUuid, sessionId);
                Principal user = headerAccessor.getUser();
                if (user != null) {
                    onlineUserManager.remove_login_user(roomUuid, userUuid);
                }
            }
        }
        return message;
    }


    @Override
    public void postSend(Message<?> message, MessageChannel channel, boolean sent) {

    }

    @Override
    public void afterSendCompletion(Message<?> message, MessageChannel channel, boolean sent, Exception ex) {
        StompHeaderAccessor headerAccessor = MessageHeaderAccessor.getAccessor(message, StompHeaderAccessor.class);
        String destination = headerAccessor.getDestination();
        if (headerAccessor != null) {
            Map<String, Object> sessionAttributes = headerAccessor.getSessionAttributes();
            String userUuid = (String) sessionAttributes.get("userUuid");
            String roomUuid = (String) sessionAttributes.get("roomUuid");
            String topic = "/topic/" + roomUuid;
            try {
                if (SimpMessageType.CONNECT.equals(headerAccessor.getMessageType())) {
                    this.template.convertAndSend(topic, MessageType.Room.createMessage("OnlineUserAdd"));
                }
                if (SimpMessageType.DISCONNECT.equals(headerAccessor.getMessageType())) {
                    this.template.convertAndSend(topic, MessageType.Room.createMessage("OnlineUserDel"));
                }
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
