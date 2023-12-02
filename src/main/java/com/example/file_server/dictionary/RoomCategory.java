package com.example.file_server.dictionary;

public enum RoomCategory {
    Football("足球", 1),
    Basketball("篮球", 2),
    Tennis("网球", 3);
    private String name;
    private int value;

    RoomCategory(String name, int value) {
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
