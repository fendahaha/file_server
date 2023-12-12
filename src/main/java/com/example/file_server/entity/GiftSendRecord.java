package com.example.file_server.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class GiftSendRecord {
    private Integer id;

    private String giftSendUuid;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date giftSendDate;

    private String clientUuid;

    private String anchorUuid;

    private String clientName;

    private String anchorName;

    private String giftUuid;

    private String giftName;

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

    public String getClientUuid() {
        return clientUuid;
    }

    public void setClientUuid(String clientUuid) {
        this.clientUuid = clientUuid;
    }

    public String getAnchorUuid() {
        return anchorUuid;
    }

    public void setAnchorUuid(String anchorUuid) {
        this.anchorUuid = anchorUuid;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAnchorName() {
        return anchorName;
    }

    public void setAnchorName(String anchorName) {
        this.anchorName = anchorName;
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
}