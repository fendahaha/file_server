package com.example.file_server.entity;

import java.util.Date;

public class Room {
    private Integer id;

    private String roomUuid;

    private String roomName;

    private String roomStreamName;

    private String roomStreamApp;

    private Integer roomStreamEnable;

    private Integer roomType;

    private String roomCategory;

    private String roomCover;

    private Date roomCreateAt;

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

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomStreamName() {
        return roomStreamName;
    }

    public void setRoomStreamName(String roomStreamName) {
        this.roomStreamName = roomStreamName;
    }

    public String getRoomStreamApp() {
        return roomStreamApp;
    }

    public void setRoomStreamApp(String roomStreamApp) {
        this.roomStreamApp = roomStreamApp;
    }

    public Integer getRoomStreamEnable() {
        return roomStreamEnable;
    }

    public void setRoomStreamEnable(Integer roomStreamEnable) {
        this.roomStreamEnable = roomStreamEnable;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public String getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    public String getRoomCover() {
        return roomCover;
    }

    public void setRoomCover(String roomCover) {
        this.roomCover = roomCover;
    }

    public Date getRoomCreateAt() {
        return roomCreateAt;
    }

    public void setRoomCreateAt(Date roomCreateAt) {
        this.roomCreateAt = roomCreateAt;
    }
}