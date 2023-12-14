package com.example.file_server.exception;

public class DbActionExcetion extends RuntimeException {
    public DbActionExcetion(String message) {
        super(message);
    }
}
