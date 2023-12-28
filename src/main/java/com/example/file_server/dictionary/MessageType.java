package com.example.file_server.dictionary;

import com.example.file_server.utils.JsonUtil;
import com.example.file_server.utils.UUIDUtil;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Date;
import java.util.HashMap;

public enum MessageType {
    System(1),
    Gift(2),
    chat(3),
    Room(4);

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

    public HashMap<String, Object> createMessage(Object data) throws JsonProcessingException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", UUIDUtil.generateUUID());
        map.put("type", this.value);
        map.put("data", JsonUtil.object2Json(data));
        map.put("time", new Date().getTime());
        return map;
    }
}
