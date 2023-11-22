package com.example.file_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "hello";
    }

    @GetMapping("/upload_page")
    public String upload_page() {
        return "upload_page";
    }
}
