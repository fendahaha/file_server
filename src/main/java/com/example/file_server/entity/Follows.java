package com.example.file_server.entity;

import java.util.Date;

public class Follows {
    private Integer id;

    private String clientUserUuid;

    private String anchorUserUuid;

    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientUserUuid() {
        return clientUserUuid;
    }

    public void setClientUserUuid(String clientUserUuid) {
        this.clientUserUuid = clientUserUuid;
    }

    public String getAnchorUserUuid() {
        return anchorUserUuid;
    }

    public void setAnchorUserUuid(String anchorUserUuid) {
        this.anchorUserUuid = anchorUserUuid;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}