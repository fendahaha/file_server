package com.example.file_server.utils;

import java.util.UUID;

public class UUIDUtil {
    public static String generateUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-","");
    }

    public static String generateStreamUniqueName() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "");
    }
}
