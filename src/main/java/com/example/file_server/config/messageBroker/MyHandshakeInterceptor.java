package com.example.file_server.config.messageBroker;

import com.example.file_server.dictionary.PageType;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;

public class MyHandshakeInterceptor implements HandshakeInterceptor {
    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
        ServletServerHttpRequest request1 = (ServletServerHttpRequest) request;
        HttpServletRequest servletRequest = request1.getServletRequest();
        String userUuid = servletRequest.getParameter("userUuid");
        String pageType = servletRequest.getParameter("pageType");
        attributes.put("userUuid", userUuid);
        attributes.put("pageType", pageType);
        if (pageType == null) {
            return false;
        }

        if (PageType.Room.equals(pageType)) {
            String roomUuid = servletRequest.getParameter("roomUuid");
            attributes.put("roomUuid", roomUuid);
        }
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {

    }
}
