package com.example.file_server.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;

import java.util.Date;
import java.util.HashMap;

public class JwtUtil {
    private static final String SECRET = "fenda@secret.com";
    private static final long DEFAULT_EXPIRATION_TIME = 1000 * 3600 * 24;//1day

    public static String generateToken(String subject) {
        return JWT.create()
                .withSubject(subject)
                .withExpiresAt(new Date(System.currentTimeMillis() + DEFAULT_EXPIRATION_TIME))
                .sign(Algorithm.HMAC512(SECRET.getBytes()));
    }

    public static String generateToken(String subject, Date expiresAt) {
        return JWT.create()
                .withSubject(subject)
                .withExpiresAt(expiresAt)
                .sign(Algorithm.HMAC512(SECRET.getBytes()));
    }

    public static String generateTokenSecond(String username, long time) {
        return generateToken(username, new Date(System.currentTimeMillis() + time * 1000));
    }

    public static String generateTokenMinute(String username, long time) {
        return generateToken(username, new Date(System.currentTimeMillis() + time * 60 * 1000));
    }

    public static String generateTokenHour(String username, long time) {
        return generateToken(username, new Date(System.currentTimeMillis() + time * 60 * 60 * 1000));
    }

    public static String generateTokenDay(String username, long time) {
        return generateToken(username, new Date(System.currentTimeMillis() + time * 24 * 60 * 60 * 1000));
    }

    public static String generateTokenMonth(String username, long time) {
        return generateToken(username, new Date(System.currentTimeMillis() + time * 30 * 24 * 60 * 60 * 1000));
    }

    public static String generateTokenYear(String username, long time) {
        return generateToken(username, new Date(System.currentTimeMillis() + time * 12 * 30 * 24 * 60 * 60 * 1000));
    }

    public static HashMap<String, Object> validateTokenAndGetUsername(String token) {
        HashMap<String, Object> resultMap = new HashMap<>();
        try {
            String subject = JWT.require(Algorithm.HMAC512(SECRET.getBytes()))
                    .build()
                    .verify(token)
                    .getSubject();
            resultMap.put("code", JwtVerifyResultType.OK);
            resultMap.put("data", subject);
        } catch (TokenExpiredException e) {
            resultMap.put("code", JwtVerifyResultType.TokenExpired);
        } catch (SignatureVerificationException e) {
            resultMap.put("code", JwtVerifyResultType.IllegalJwt);
        }
        return resultMap;
    }

    public enum JwtVerifyResultType {
        OK("Jwt验证通过"),
        TokenExpired("Jwt过期"),
        IllegalJwt("非法的Jwt");
        private String name;

        JwtVerifyResultType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
