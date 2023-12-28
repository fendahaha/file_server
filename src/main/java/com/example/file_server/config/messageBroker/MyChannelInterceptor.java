package com.example.file_server.config.messageBroker;

import com.example.file_server.dictionary.MessageType;
import com.example.file_server.dictionary.PageType;
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
            String pageType = (String) sessionAttributes.get("pageType");
            if (SimpMessageType.CONNECT.equals(headerAccessor.getMessageType())) {
                User user = null;
                if (userUuid != null) {
                    if (!userUuid.equals("undefined") && !userUuid.equals("null")) {
                        user = userService.getUser(userUuid);
                        if (user != null) {
                            User user1 = new User();
                            user1.setUserUuid(user.getUserUuid());
                            user1.setUserName(user.getUserName());
                            user1.setUserType(user.getUserType());
                            user1.setUserDisplayName(user.getUserDisplayName());
                            user1.setUserAvatar(user.getUserAvatar());
                            user1.setUserCountry(user.getUserCountry());
                            user1.setUserRole(user.getUserRole());
                            headerAccessor.setUser(new MyStompPrincipal(user.getUserUuid()));
                        }
                    }
                }
                if (PageType.Room.equals(pageType)) {
                    String roomUuid = (String) sessionAttributes.get("roomUuid");
                    onlineUserManager.user_increment(roomUuid, sessionId);
                    if (userUuid != null && user != null) {
                        try {
                            onlineUserManager.put_login_user(roomUuid, userUuid, user);
                        } catch (JsonProcessingException e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (PageType.Home.equals(pageType)) {

                }
            }

            if (SimpMessageType.SUBSCRIBE.equals(headerAccessor.getMessageType())) {
            }

            if (SimpMessageType.MESSAGE.equals(headerAccessor.getMessageType())) {
                Principal user = headerAccessor.getUser();
                if (!(user instanceof MyStompPrincipal)) {
                    throw new RuntimeException("未登录用户");
                }
            }

            if (SimpMessageType.HEARTBEAT.equals(headerAccessor.getMessageType())) {

            }

            if (SimpMessageType.DISCONNECT.equals(headerAccessor.getMessageType())) {
                if (PageType.Room.equals(pageType)) {
                    String roomUuid = (String) sessionAttributes.get("roomUuid");
                    onlineUserManager.user_decrement(roomUuid, sessionId);
                    Principal user = headerAccessor.getUser();
                    if (user != null) {
                        onlineUserManager.remove_login_user(roomUuid, userUuid);
                    }
                }
            }
        }
        return message;
    }


    @Override
    public void postSend(Message<?> message, MessageChannel channel, boolean sent) {
        StompHeaderAccessor headerAccessor = MessageHeaderAccessor.getAccessor(message, StompHeaderAccessor.class);
        if (headerAccessor != null) {
            try {
                Map<String, Object> sessionAttributes = headerAccessor.getSessionAttributes();
                String pageType = (String) sessionAttributes.get("pageType");
                if (PageType.Room.equals(pageType)) {
                    String roomUuid = (String) sessionAttributes.get("roomUuid");
                    String topic = "/topic/" + roomUuid;
                    if (SimpMessageType.CONNECT.equals(headerAccessor.getMessageType())) {
                        this.template.convertAndSend(topic, MessageType.Room.createMessage("OnlineUserAdd"));
                    }
                    if (SimpMessageType.DISCONNECT.equals(headerAccessor.getMessageType())) {
                        this.template.convertAndSend(topic, MessageType.Room.createMessage("OnlineUserDel"));
                    }
                }
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void afterSendCompletion(Message<?> message, MessageChannel channel, boolean sent, Exception ex) {

    }

}
