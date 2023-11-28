package com.example.file_server.entity;

import java.util.Date;

public class Room {
    private Integer id;

    private String roomName;

    private String roomUuid;

    private String roomStreamApp;

    private Integer roomStreamEnable;

    private Integer roomType;

    private String roomCategory;

    private String roomCover;

    private Date roomCreateAt;

    private Integer roomIsOnline;

    private Integer roomOnlineUsers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomUuid() {
        return roomUuid;
    }

    public void setRoomUuid(String roomUuid) {
        this.roomUuid = roomUuid;
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

    public Integer getRoomIsOnline() {
        return roomIsOnline;
    }

    public void setRoomIsOnline(Integer roomIsOnline) {
        this.roomIsOnline = roomIsOnline;
    }

    public Integer getRoomOnlineUsers() {
        return roomOnlineUsers;
    }

    public void setRoomOnlineUsers(Integer roomOnlineUsers) {
        this.roomOnlineUsers = roomOnlineUsers;
    }
}