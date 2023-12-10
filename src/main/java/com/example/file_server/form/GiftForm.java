package com.example.file_server.form;

import jakarta.validation.constraints.Min;

public class GiftForm {
    private String giftUuid;
    private String giftName;

    @Min(0)
    private Integer giftValue;

    private String giftImage;

    @Min(0)
    private Integer giftOrder;

    public GiftForm() {
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
}
