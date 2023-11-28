package com.example.file_server.form;

import jakarta.validation.constraints.NotBlank;

public class UserRegisterForm {
    @NotBlank
    private String userName;
    @NotBlank
    private String userPassword;
    private String userEmail;
    private String userPhone;

    public UserRegisterForm() {
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
}
