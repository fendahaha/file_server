package com.example.file_server.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Gift {
    private Integer id;

    private String giftUuid;

    private String giftName;

    private Integer giftValue;

    private String giftImage;

    private Integer giftOrder;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date giftCreateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGiftUuid() {
        return giftUuid;
    }

    public void setGiftUuid(String giftUuid) {
        this.giftUuid = giftUuid;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public Integer getGiftValue() {
        return giftValue;
    }

    public void setGiftValue(Integer giftValue) {
        this.giftValue = giftValue;
    }

    public String getGiftImage() {
        return giftImage;
    }

    public void setGiftImage(String giftImage) {
        this.giftImage = giftImage;
    }

    public Integer getGiftOrder() {
        return giftOrder;
    }

    public void setGiftOrder(Integer giftOrder) {
        this.giftOrder = giftOrder;
    }

    public Date getGiftCreateAt() {
        return giftCreateAt;
    }

    public void setGiftCreateAt(Date giftCreateAt) {
        this.giftCreateAt = giftCreateAt;
    }
}