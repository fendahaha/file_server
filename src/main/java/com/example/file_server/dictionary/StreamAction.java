package com.example.file_server.dictionary;

public enum StreamAction {
    Publish("on_publish"),
    UnPublish("on_unpublish"),
    Play("on_play"),
    Stop("on_stop"),
    Hls("on_hls");
    private String value;

    StreamAction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
