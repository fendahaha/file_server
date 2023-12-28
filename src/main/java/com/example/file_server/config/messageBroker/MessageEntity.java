package com.example.file_server.config.messageBroker;

import com.example.file_server.dictionary.MessageType;

import java.util.Date;

public class MessageEntity {
    private String id;
    private Integer type;
    private String data;
    private Date time;

    public MessageEntity() {
    }

    public MessageEntity(String id, Integer type, String data, Date time) {
        this.id = id;
        this.type = type;
        this.data = data;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
