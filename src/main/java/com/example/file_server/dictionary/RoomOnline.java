package com.example.file_server.dictionary;

public enum RoomOnline {

    Online("在线", 1),
    Offline("不在线", 0);

    private String name;
    private int value;

    RoomOnline(String name, int value) {
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
