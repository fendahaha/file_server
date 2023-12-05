package com.example.file_server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public Object index(String p, @CookieValue String theme) {
        System.out.println(p);
        System.out.println(theme);
        return ResponseEntity.badRequest().body("bad");
    }

    @PostMapping("/post")
    public Object index1(String p, @RequestBody String b) {
        System.out.println(p);
        System.out.println(b);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("asd", "sadadada");
        hashMap.put("aa", true);
        hashMap.put("age", 12);
        return hashMap;
    }

    @PostMapping("/post2")
    public Object index2(String p, @RequestBody String b, String id) {
        System.out.println(p);
        System.out.println(b);
        System.out.println(id);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("asd", "sadadada");
        hashMap.put("aa", true);
        hashMap.put("age", 12);
        return hashMap;
    }
}
