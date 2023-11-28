package com.example.file_server.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController {

    @PostMapping("/{room_id}")
    public Object index(@PathVariable String room_id) {
        return "";
    }

    @PostMapping("/list")
    public Object list() {
        return "";
    }

    @PostMapping("/create")
    public Object create() {
        return "";
    }

    @PostMapping("/update")
    public Object update() {
        return "";
    }

    @PostMapping("/delete{room_id}")
    public Object delete(@PathVariable String room_id) {
        return "";
    }
}
