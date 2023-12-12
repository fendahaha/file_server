package com.example.file_server.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Anchor {
    private Integer id;

    private String userUuid;

    private String anchorUuid;

    private String anchorSanwei;

    private String anchorHeight;

    private String anchorWieght;

    private String anchorRemark;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date anchorCreateAt;

    private String anchorConfig;

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

    public String getAnchorSanwei() {
        return anchorSanwei;
    }

    public void setAnchorSanwei(String anchorSanwei) {
        this.anchorSanwei = anchorSanwei;
    }

    public String getAnchorHeight() {
        return anchorHeight;
    }

    public void setAnchorHeight(String anchorHeight) {
        this.anchorHeight = anchorHeight;
    }

    public String getAnchorWieght() {
        return anchorWieght;
    }

    public void setAnchorWieght(String anchorWieght) {
        this.anchorWieght = anchorWieght;
    }

    public String getAnchorRemark() {
        return anchorRemark;
    }

    public void setAnchorRemark(String anchorRemark) {
        this.anchorRemark = anchorRemark;
    }

    public Date getAnchorCreateAt() {
        return anchorCreateAt;
    }

    public void setAnchorCreateAt(Date anchorCreateAt) {
        this.anchorCreateAt = anchorCreateAt;
    }

    public String getAnchorConfig() {
        return anchorConfig;
    }

    public void setAnchorConfig(String anchorConfig) {
        this.anchorConfig = anchorConfig;
    }
}