package com.example.file_server.dictionary;

public enum RoomType {
    Anchor("主播", "anchor"),
    Event("赛事", "event"),
    TV("电视", "tv"),
    Other("其他", "other");


    private String name;
    private String value;

    RoomType(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
