package com.example.file_server.entity;

import java.util.Date;

public class GiftSendRecord {
    private Integer id;

    private String giftSendUuid;

    private Date giftSendDate;

    private String userUuid;

    private String anchorUuid;

    private String giftUuid;

    private Integer giftValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGiftSendUuid() {
        return giftSendUuid;
    }

    public void setGiftSendUuid(String giftSendUuid) {
        this.giftSendUuid = giftSendUuid;
    }

    public Date getGiftSendDate() {
        return giftSendDate;
    }

    public void setGiftSendDate(Date giftSendDate) {
        this.giftSendDate = giftSendDate;
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

    public String getGiftUuid() {
        return giftUuid;
    }

    public void setGiftUuid(String giftUuid) {
        this.giftUuid = giftUuid;
    }

    public Integer getGiftValue() {
        return giftValue;
    }

    public void setGiftValue(Integer giftValue) {
        this.giftValue = giftValue;
    }
}