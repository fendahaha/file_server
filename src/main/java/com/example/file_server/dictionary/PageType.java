package com.example.file_server.dictionary;

public enum PageType {
    Home("home"),
    Room("room");

    private final String value;

    PageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean equals(String i) {
        return value.equals(i);
    }

}
