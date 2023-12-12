package com.example.file_server.form;

import jakarta.validation.constraints.Min;

import java.util.Date;

public class AnchorForm {
    /*分页*/
    @Min(1)
    private int pageNum = 1;
    @Min(1)
    private int pageSize = 10;

    /*anchor*/
    private Integer id;

    private String userUuid;

    private String anchorUuid;

    private String anchorSanwei;

    private String anchorHeight;

    private String anchorWieght;

    private String anchorRemark;

    private Date anchorCreateAt;

    private String anchorConfig;

    /*user*/
    private String userName;

    private String userPassword;

    private String userDisplayName;

    private String userEmail;

    private String userPhone;

    private String userCountry;

    private String userAvatar;

    public AnchorForm() {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }
}
