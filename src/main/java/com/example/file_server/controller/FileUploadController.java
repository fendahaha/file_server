package com.example.file_server.controller;

import com.example.file_server.entity.UploadFile;
import com.example.file_server.form.UploadFileForm;
import com.example.file_server.service.impl.UploadFileServiceImpl;
import com.example.file_server.utils.ApiResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RequestMapping("/file")
@RestController
public class FileUploadController {

    @Autowired
    private UploadFileServiceImpl uploadFileService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @GetMapping("/list")
    public Object list(Date date) {
        List<UploadFile> list = uploadFileService.list();
        return ApiResponseUtil.ok(list);
    }

    @PostMapping("/upload")
    public Object upload(@ModelAttribute UploadFileForm uploadFileForm) {
        try {
            HashMap<String, Object> resultMap = uploadFileService.upload(uploadFileForm);
            return ApiResponseUtil.ok(resultMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ApiResponseUtil.internal_server_error(null);
    }

    @GetMapping("/delete")
    public Object delete(String[] file_unique_names) {
        int i = uploadFileService.deleteByUniqueNames(file_unique_names);
        return ApiResponseUtil.no_content(i);
    }

}
