package com.example.file_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/file/upload")
    public String upload_page() {
        return "upload_page";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
