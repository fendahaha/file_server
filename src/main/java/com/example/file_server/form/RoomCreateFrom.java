package com.example.file_server.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class RoomCreateFrom {
    private String roomName;

    @Min(1)
    @Max(2)
    private Integer roomStreamEnable;

    @Min(1)
    @Max(4)
    private Integer roomType;

    private String roomCategory;

    private String roomCover;

    public RoomCreateFrom() {
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
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
}
