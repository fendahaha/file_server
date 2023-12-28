package com.example.file_server.dictionary;

import com.example.file_server.config.messageBroker.MessageEntity;
import com.example.file_server.utils.JsonUtil;
import com.example.file_server.utils.UUIDUtil;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Date;
import java.util.HashMap;

public enum MessageType {
    System(1),
    Gift(2),
    chat(3),
    Room(4),
    Page(5);

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

    public MessageEntity createMessage(Object data) throws JsonProcessingException {
        MessageEntity messageEntity = new MessageEntity(UUIDUtil.generateUUID(), this.value, JsonUtil.object2Json(data), new Date());
        return messageEntity;
    }
}
