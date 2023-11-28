package com.example.file_server.form;

import jakarta.validation.constraints.NotBlank;

public class UserLoginForm {
    @NotBlank
    private String userName;

    @NotBlank
    private String userPassword;

    public UserLoginForm() {
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
}
