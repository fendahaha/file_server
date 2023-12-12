package com.example.file_server.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Client {
    private Integer id;

    private String userUuid;

    private String clientUuid;

    private Integer clientLeavel;

    private Double clientMoney;

    private Double clientMoneySended;

    private Double clientMoneyRecharged;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date createAt;

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

    public String getClientUuid() {
        return clientUuid;
    }

    public void setClientUuid(String clientUuid) {
        this.clientUuid = clientUuid;
    }

    public Integer getClientLeavel() {
        return clientLeavel;
    }

    public void setClientLeavel(Integer clientLeavel) {
        this.clientLeavel = clientLeavel;
    }

    public Double getClientMoney() {
        return clientMoney;
    }

    public void setClientMoney(Double clientMoney) {
        this.clientMoney = clientMoney;
    }

    public Double getClientMoneySended() {
        return clientMoneySended;
    }

    public void setClientMoneySended(Double clientMoneySended) {
        this.clientMoneySended = clientMoneySended;
    }

    public Double getClientMoneyRecharged() {
        return clientMoneyRecharged;
    }

    public void setClientMoneyRecharged(Double clientMoneyRecharged) {
        this.clientMoneyRecharged = clientMoneyRecharged;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}