package com.example.file_server.dictionary;

public enum StreamApp {
    Common("通用的", "live");

    private String name;
    private String value;

    StreamApp(String name, String value) {
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
