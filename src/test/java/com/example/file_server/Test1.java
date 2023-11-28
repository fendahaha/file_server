package com.example.file_server;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class Test1 {
    private static final String SECRET = "your_secret_key";
    private static final long EXPIRATION_TIME = 1000 * 1; // 10 days

    public static String generateToken(String username) {
        return JWT.create()
                .withSubject(username)
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .sign(Algorithm.HMAC512(SECRET.getBytes()));
    }

    public static String validateTokenAndGetUsername(String token) {
        return JWT.require(Algorithm.HMAC512(SECRET.getBytes()))
                .build()
                .verify(token)
                .getSubject();
    }

//        TokenExpiredException
//    SignatureVerificationException
    public static void main(String[] args) throws IOException {
        String s = generateToken("fenda");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String s1 = validateTokenAndGetUsername(s + 1);
        System.out.println(s1);
    }
}
