package com.example.file_server.form;

import jakarta.validation.constraints.Min;

public class GiftSendRecordForm {
    @Min(1)
    private int pageNum = 1;
    @Min(1)
    private int pageSize = 10;
    private String clientName;

    private String anchorName;
    private String anchorUuid;

    private String giftName;
    @Min(0)
    private Integer giftValue;

    public GiftSendRecordForm() {
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getAnchorUuid() {
        return anchorUuid;
    }

    public void setAnchorUuid(String anchorUuid) {
        this.anchorUuid = anchorUuid;
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
