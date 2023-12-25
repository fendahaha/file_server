package com.example.file_server.controller;

import com.example.file_server.service.impl.UserServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/client")
@RestController
public class ClientController {
    private UserServiceImpl userService;

    @Autowired
    public ClientController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/{uuid}")
    public Object get_client(@PathVariable String uuid) {
        return ResponseUtil.ok(userService.get_client_with_user(uuid));
    }
}
