package com.example.file_server.exception;

import com.example.file_server.dictionary.AuthenticateType;

public class AuthenticateException extends RuntimeException {

    private AuthenticateType authenticateType;

    public AuthenticateException(AuthenticateType authenticateType) {
        super();
        this.authenticateType = authenticateType;
    }

    public AuthenticateException(String message) {
        super(message);
    }

    public AuthenticateType getAuthenticateType() {
        return authenticateType;
    }
}
