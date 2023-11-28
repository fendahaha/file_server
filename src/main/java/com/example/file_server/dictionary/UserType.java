package com.example.file_server.dictionary;

public enum UserType {
    Administrator("管理员", 1),
    Anchor("主播", 2),
    Client("用户", 3),
    UnverifiedUser("未验证用户", 4);
    private String name;
    private int value;

    UserType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
