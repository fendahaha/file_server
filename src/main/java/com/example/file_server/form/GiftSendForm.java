package com.example.file_server.form;

import jakarta.validation.constraints.Min;

public class GiftSendForm {
    private String giftSendUuid;

    private String userUuid;

    private String anchorUuid;

    private String giftUuid;

    @Min(0)
    private Integer giftValue;


    public GiftSendForm() {
    }

    public String getGiftSendUuid() {
        return giftSendUuid;
    }

    public void setGiftSendUuid(String giftSendUuid) {
        this.giftSendUuid = giftSendUuid;
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
