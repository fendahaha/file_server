package com.example.file_server.dictionary;

public enum MessageType {
    System(1),
    Gift(2),
    chat(3);

    private final Integer value;

    MessageType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public boolean equals(Integer i) {
        return value.equals(i);
    }
}
