package com.example.file_server.controller;

import com.example.file_server.dictionary.Role;
import com.example.file_server.form.ClientListForm;
import com.example.file_server.interceptor.AuthenticateRequire;
import com.example.file_server.service.impl.ClientServiceImpl;
import com.example.file_server.service.impl.UserServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RequestMapping("/client")
@RestController
public class ClientController {
    private UserServiceImpl userService;
    private ClientServiceImpl clientService;

    @Autowired
    public ClientController(UserServiceImpl userService, ClientServiceImpl clientService) {
        this.userService = userService;
        this.clientService = clientService;
    }

    @AuthenticateRequire
    @GetMapping("/{uuid}")
    public Object get_client(@PathVariable String uuid) {
        return ResponseUtil.ok(userService.get_client_with_user(uuid));
    }

    @AuthenticateRequire(Role.Administrator)
    @PostMapping("/list")
    public Object list(@RequestBody @Validated ClientListForm form) {
        HashMap<String, Object> map = clientService.list_clients_with_user(form);
        return ResponseUtil.ok(map);
    }

    @GetMapping("/delete/{userUuid}")
    public Object delete(@PathVariable String userUuid) {
        return ResponseUtil.ok(clientService.deleteClient(userUuid));
    }
}
