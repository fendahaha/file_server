package com.example.file_server.dictionary;

public enum AuthenticateType {
    Success("用户认证成功"),
    JwtTokenExpired("jwt过期"),
    IllegalJwt("jwt非法"),
    Unauthenticated("未登录");
    private String value;

    AuthenticateType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
