package com.example.file_server.config;

import com.example.file_server.dictionary.AuthenticateType;
import com.example.file_server.exception.AuthenticateException;
import com.example.file_server.utils.ResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AuthenticateException.class)
    public ResponseEntity<HashMap<String, Object>> handleCustomException(AuthenticateException ex) {
        AuthenticateType authenticateType = ex.getAuthenticateType();
        return ResponseUtil.unauthorized(authenticateType.getValue());
    }

}
