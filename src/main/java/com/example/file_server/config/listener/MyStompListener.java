package com.example.file_server.config.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import java.security.Principal;

//@Component
public class MyStompListener implements ApplicationListener {
//    @Autowired
    private SimpMessagingTemplate template;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof SessionConnectedEvent sessionConnectedEvent) {
            Message<byte[]> message = sessionConnectedEvent.getMessage();
            Principal user = sessionConnectedEvent.getUser();
            SimpMessageHeaderAccessor headerAccessor = MessageHeaderAccessor.getAccessor(message, SimpMessageHeaderAccessor.class);
            String sessionId = headerAccessor.getSessionId();
            System.out.println("---------------SessionConnectedEvent----------------");
            System.out.println(sessionId);
            if (user != null) {
                System.out.println(user.getName());
            }
        }
        if (event instanceof SessionDisconnectEvent sessionDisconnectEvent) {
            String sessionId = sessionDisconnectEvent.getSessionId();
            Message<byte[]> message = sessionDisconnectEvent.getMessage();
            Principal user = sessionDisconnectEvent.getUser();
            SimpMessageHeaderAccessor headerAccessor = MessageHeaderAccessor.getAccessor(message, SimpMessageHeaderAccessor.class);
            System.out.println("---------------SessionDisconnectEvent----------------");
            System.out.println(sessionId);
            if (user != null) {
                System.out.println(user.getName());
            }
        }
    }
}
