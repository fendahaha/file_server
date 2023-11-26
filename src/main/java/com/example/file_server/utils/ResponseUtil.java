package com.example.file_server.utils;

import jakarta.annotation.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

public class ResponseUtil {
    public static HashMap<String, Object> map(int code, String message, Object data) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("code", code);
        hashMap.put("message", message);
        hashMap.put("data", data);
        return hashMap;
    }

    public static <T> ResponseEntity<HashMap<String, Object>> response(T data, HttpStatus httpStatus) {
        return new ResponseEntity<>(ResponseUtil.map(httpStatus.value(), httpStatus.getReasonPhrase(), data), httpStatus);
    }

    public static <T> ResponseEntity<HashMap<String, Object>> ok(T data) {
        return ResponseUtil.response(data, HttpStatus.OK);
    }

    public static <T> ResponseEntity<HashMap<String, Object>> badRequest(T data) {
        return ResponseUtil.response(data, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<HashMap<String, Object>> noContent(T data) {
        return ResponseUtil.response(data, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<HashMap<String, Object>> notFound(T data) {
        return ResponseUtil.response(data, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<HashMap<String, Object>> internalServerError(T data) {
        return ResponseUtil.response(data, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
