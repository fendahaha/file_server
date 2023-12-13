package com.example.file_server.dictionary;

public enum StreamType {
    Live("直播流", "live"),
    Static("视频", "static");

    private String name;
    private String value;

    StreamType(String name, String value) {
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
