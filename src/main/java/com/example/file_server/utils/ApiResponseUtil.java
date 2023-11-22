package com.example.file_server.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

public class ApiResponseUtil {

    public static HashMap<String, Object> map(boolean success, Object data, String message) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("success", success);
        hashMap.put("data", data);
        hashMap.put("message", message);
        return hashMap;
    }

    public static ResponseEntity<HashMap<String, Object>> ok(Object data) {
        return new ResponseEntity<>(ApiResponseUtil.map(true, data, "ok"), HttpStatus.OK);
    }

    public static ResponseEntity<HashMap<String, Object>> created(Object data) {
        return new ResponseEntity<>(ApiResponseUtil.map(true, data, "created"), HttpStatus.CREATED);
    }

    public static ResponseEntity<HashMap<String, Object>> no_content(Object data) {
        return new ResponseEntity<>(ApiResponseUtil.map(true, data, "no_content"), HttpStatus.NO_CONTENT);
    }

    public static ResponseEntity<HashMap<String, Object>> bad_request(Object data) {
        return new ResponseEntity<>(ApiResponseUtil.map(false, data, "bad_request"), HttpStatus.BAD_REQUEST);
    }

    public static ResponseEntity<HashMap<String, Object>> unauthorized(Object data) {
        return new ResponseEntity<>(ApiResponseUtil.map(false, data, "unauthorized"), HttpStatus.UNAUTHORIZED);
    }

    public static ResponseEntity<HashMap<String, Object>> forbidden(Object data) {
        return new ResponseEntity<>(ApiResponseUtil.map(false, data, "forbidden"), HttpStatus.FORBIDDEN);
    }

    public static ResponseEntity<HashMap<String, Object>> not_found(Object data) {
        return new ResponseEntity<>(ApiResponseUtil.map(false, data, "not_found"), HttpStatus.NOT_FOUND);
    }

    public static ResponseEntity<HashMap<String, Object>> internal_server_error(Object data) {
        return new ResponseEntity<>(ApiResponseUtil.map(false, data, "internal_server_error"), HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
