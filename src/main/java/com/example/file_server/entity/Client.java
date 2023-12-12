package com.example.file_server.entity;

import java.util.Date;

public class Client {
    private Integer id;

    private String userUuid;

    private String clientUuid;

    private Double clientMoney;

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

    public Double getClientMoney() {
        return clientMoney;
    }

    public void setClientMoney(Double clientMoney) {
        this.clientMoney = clientMoney;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}