package com.example.file_server.dictionary;

public enum Role {
    Administrator("管理员", 1),

    Anchor("主播", 2),

    Client("用户", 3),

    Base("已登录", 0);

    private String name;
    private int value;

    Role(String name, int value) {
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
