package com.example.file_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileUploadController {
    @GetMapping("/upload_page")
    public String index() {
        return "upload_page";
    }

    @GetMapping("/upload")
    public String upload(){




        return "";
    }
}
