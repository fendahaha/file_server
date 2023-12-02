package com.example.file_server.entity;

public class RoomStatus {
    private String roomUuid;

    private Integer roomIsOnline;

    private String roomStreamId;

    public String getRoomUuid() {
        return roomUuid;
    }

    public void setRoomUuid(String roomUuid) {
        this.roomUuid = roomUuid;
    }

    public Integer getRoomIsOnline() {
        return roomIsOnline;
    }

    public void setRoomIsOnline(Integer roomIsOnline) {
        this.roomIsOnline = roomIsOnline;
    }

    public String getRoomStreamId() {
        return roomStreamId;
    }

    public void setRoomStreamId(String roomStreamId) {
        this.roomStreamId = roomStreamId;
    }
}