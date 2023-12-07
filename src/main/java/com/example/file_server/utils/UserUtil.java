package com.example.file_server.utils;

import java.util.Random;

public class UserUtil {
    private static final String[] ADJECTIVES = {
            "Quick", "Lazy", "Funny", "Serious", "Clever", "Dull", "Friendly", "Rude"
    };

    private static final String[] NOUNS = {
            "Bear", "Lion", "Tiger", "Rabbit", "Dragon", "Snake", "Eagle", "Wolf"
    };

    private static final Random RANDOM = new Random();

    public static String generateUsername() {
        String adjective = ADJECTIVES[RANDOM.nextInt(ADJECTIVES.length)];
        String noun = NOUNS[RANDOM.nextInt(NOUNS.length)];
        int number = RANDOM.nextInt(100); // 生成一个 0 到 99 之间的数字
        return adjective + noun + number;
    }
}
