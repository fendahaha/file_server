package com.example.file_server.dictionary;

public enum RoomType {
    Anchor("主播", 1),
    Event("赛事", 2),
    TV("电视", 3),
    Other("其他", 4);


    private String name;
    private int value;

    RoomType(String name, int value) {
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
