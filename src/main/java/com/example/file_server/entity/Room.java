package com.example.file_server.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Room {
    private Integer id;

    private String roomUuid;

    private String streamAddress;

    private String streamApp;

    private String streamName;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date roomCreateAt;

    private Integer streamOnline;

    private String streamId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomUuid() {
        return roomUuid;
    }

    public void setRoomUuid(String roomUuid) {
        this.roomUuid = roomUuid;
    }

    public String getStreamAddress() {
        return streamAddress;
    }

    public void setStreamAddress(String streamAddress) {
        this.streamAddress = streamAddress;
    }

    public String getStreamApp() {
        return streamApp;
    }

    public void setStreamApp(String streamApp) {
        this.streamApp = streamApp;
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public Date getRoomCreateAt() {
        return roomCreateAt;
    }

    public void setRoomCreateAt(Date roomCreateAt) {
        this.roomCreateAt = roomCreateAt;
    }

    public Integer getStreamOnline() {
        return streamOnline;
    }

    public void setStreamOnline(Integer streamOnline) {
        this.streamOnline = streamOnline;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }
}