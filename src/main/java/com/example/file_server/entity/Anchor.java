package com.example.file_server.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Anchor {
    private Integer id;

    private String userUuid;

    private String anchorUuid;

    private String anchorRemark;

    private Integer anchorMoney;

    private Integer anchorFollowers;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date anchorCreateAt;

    private String roomUuid;

    private String anchorConfig;

    private Room room;
    private User user;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getAnchorUuid() {
        return anchorUuid;
    }

    public void setAnchorUuid(String anchorUuid) {
        this.anchorUuid = anchorUuid;
    }

    public String getAnchorRemark() {
        return anchorRemark;
    }

    public void setAnchorRemark(String anchorRemark) {
        this.anchorRemark = anchorRemark;
    }

    public Integer getAnchorMoney() {
        return anchorMoney;
    }

    public void setAnchorMoney(Integer anchorMoney) {
        this.anchorMoney = anchorMoney;
    }

    public Integer getAnchorFollowers() {
        return anchorFollowers;
    }

    public void setAnchorFollowers(Integer anchorFollowers) {
        this.anchorFollowers = anchorFollowers;
    }

    public Date getAnchorCreateAt() {
        return anchorCreateAt;
    }

    public void setAnchorCreateAt(Date anchorCreateAt) {
        this.anchorCreateAt = anchorCreateAt;
    }

    public String getRoomUuid() {
        return roomUuid;
    }

    public void setRoomUuid(String roomUuid) {
        this.roomUuid = roomUuid;
    }

    public String getAnchorConfig() {
        return anchorConfig;
    }

    public void setAnchorConfig(String anchorConfig) {
        this.anchorConfig = anchorConfig;
    }
}