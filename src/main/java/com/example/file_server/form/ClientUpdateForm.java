package com.example.file_server.form;

import jakarta.validation.constraints.Min;

public class ClientUpdateForm {
    private String userDisplayName;

    private String userEmail;

    private String userPhone;

    private String userCountry;

    private String userAvatar;
    @Min(1)
    private Integer clientLeavel;
    @Min(0)
    private Integer clientMoney;
    @Min(0)
    private Integer clientMoneySended;
    @Min(0)
    private Integer clientMoneyRecharged;

    public ClientUpdateForm() {
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

    public Integer getClientLeavel() {
        return clientLeavel;
    }

    public void setClientLeavel(Integer clientLeavel) {
        this.clientLeavel = clientLeavel;
    }

    public Integer getClientMoney() {
        return clientMoney;
    }

    public void setClientMoney(Integer clientMoney) {
        this.clientMoney = clientMoney;
    }

    public Integer getClientMoneySended() {
        return clientMoneySended;
    }

    public void setClientMoneySended(Integer clientMoneySended) {
        this.clientMoneySended = clientMoneySended;
    }

    public Integer getClientMoneyRecharged() {
        return clientMoneyRecharged;
    }

    public void setClientMoneyRecharged(Integer clientMoneyRecharged) {
        this.clientMoneyRecharged = clientMoneyRecharged;
    }
}
