package com.example.file_server.utils;

import jakarta.servlet.http.HttpSession;

public class UserSessionUtil {
    private static final Integer sessionMaxInactiveInterval = 3600 * 2;
    public static final String sessionAttributeName = "userInfo";

    public static void setAttribute(HttpSession session, Object o) {
        session.setAttribute(sessionAttributeName, o);
        session.setMaxInactiveInterval(sessionMaxInactiveInterval);
    }
}
