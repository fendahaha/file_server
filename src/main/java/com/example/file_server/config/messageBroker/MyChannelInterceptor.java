package com.example.file_server.config.messageBroker;

import com.example.file_server.entity.User;
import com.example.file_server.service.impl.UserServiceImpl;
import com.example.file_server.utils.OnlineUserManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.stereotype.Component;

import java.security.Principal;
import java.util.Map;

@Component
public class MyChannelInterceptor implements ChannelInterceptor {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private OnlineUserManager onlineUserManager;

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        SimpMessageHeaderAccessor headerAccessor = MessageHeaderAccessor.getAccessor(message, SimpMessageHeaderAccessor.class);
        String sessionId = headerAccessor.getSessionId();
        if (headerAccessor != null) {
            Map<String, Object> sessionAttributes = headerAccessor.getSessionAttributes();
            String userUuid = (String) sessionAttributes.get("userUuid");
            String roomUuid = (String) sessionAttributes.get("roomUuid");
//            MessageHeaders messageHeaders = headerAccessor.getMessageHeaders();
//            LinkedMultiValueMap nativeHeaders = messageHeaders.get("nativeHeaders", LinkedMultiValueMap.class);
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
}
