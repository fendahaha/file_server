package com.example.file_server.controller;

import com.example.file_server.entity.File;
import com.example.file_server.mapper.FileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private FileMapper fileMapper;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "hello";
    }

    @GetMapping("/file_list")
    @ResponseBody
    public List<File> list() {
        List<File> files = fileMapper.selectByExample(null);
        return files;
    }
}
