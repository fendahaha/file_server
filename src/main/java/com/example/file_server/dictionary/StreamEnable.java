package com.example.file_server.dictionary;

public enum StreamEnable {
    Enable("可以直播", 1),
    Disable("不可以直播", 0);

    private String name;
    private int value;

    StreamEnable(String name, int value) {
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
