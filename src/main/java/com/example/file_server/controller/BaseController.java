package com.example.file_server.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;

public class BaseController {

    public HashMap<String, Object> getBindingError(BindingResult bindingResult) {
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        HashMap<String, Object> hashMap = new HashMap<>();
        fieldErrors.forEach(e -> {
            hashMap.put(e.getField(), e.getDefaultMessage());
        });
        return hashMap;
    }
}
