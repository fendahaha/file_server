package com.example.file_server.interceptor;

import com.example.file_server.dictionary.AuthenticateType;
import com.example.file_server.dictionary.UserType;
import com.example.file_server.entity.User;
import com.example.file_server.exception.AuthenticateException;
import com.example.file_server.utils.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.HashMap;

@Component
public class AuthenticateInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(true);
        Object user = session.getAttribute("user");
        if (user != null) {
            if (((User) user).getUserType() == UserType.UnverifiedUser.getValue()) {
                throw new AuthenticateException(AuthenticateType.Unauthenticated);
            }
        }

        String header = request.getHeader("Authorization");
        if (header != null) {
            String token = header.replace("Bearer ", "");
            HashMap<String, Object> map = JwtUtil.validateTokenAndGetUsername(token);
            JwtUtil.JwtVerifyResultType code = (JwtUtil.JwtVerifyResultType) map.get("code");
            if (code == JwtUtil.JwtVerifyResultType.OK) {
                return true;
            } else if (code == JwtUtil.JwtVerifyResultType.TokenExpired) {
                throw new AuthenticateException(AuthenticateType.JwtTokenExpired);
            } else if (code == JwtUtil.JwtVerifyResultType.IllegalJwt) {
                throw new AuthenticateException(AuthenticateType.IllegalJwt);
            }
        }
        throw new AuthenticateException(AuthenticateType.Unauthenticated);
    }
}
