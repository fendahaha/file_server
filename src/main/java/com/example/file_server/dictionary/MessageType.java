package com.example.file_server.dictionary;

public enum MessageType {
    System(1),
    Gift(2),
    chat(3);

    private final int value;

    MessageType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
