package com.example.file_server.form;

import jakarta.validation.constraints.Min;

public class AnchorListForm {
    @Min(1)
    private int pageNum = 1;
    @Min(1)
    private int pageSize = 10;
    private String orderByClause;
    @Min(0)
    private Integer roomEnable;
    private String streamType;
    private String userName;

    public AnchorListForm() {
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getRoomEnable() {
        return roomEnable;
    }

    public void setRoomEnable(Integer roomEnable) {
        this.roomEnable = roomEnable;
    }

    public String getStreamType() {
        return streamType;
    }

    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
