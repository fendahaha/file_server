package com.example.file_server.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public Object login() {
        return "";
    }

    @PostMapping("/logout")
    public Object logout() {
        return "";
    }

    @PostMapping("/register")
    public Object register() {
        return "";
    }

    @PostMapping("/list")
    public Object list() {
        return "";
    }

    @PostMapping("/delete")
    public Object delete() {
        return "";
    }

    @PostMapping("/update")
    public Object update() {
        return "";
    }

    @PostMapping("/create")
    public Object create() {
        return "";
    }

}
