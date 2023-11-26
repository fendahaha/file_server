package com.example.file_server.controller;

import com.example.file_server.form.UploadFileForm;
import com.example.file_server.service.UploadFileService;
import com.example.file_server.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * 上传文件处理操作
 *
 */
@RequestMapping("/file")
@RestController
public class FileUploadController {

    @Autowired
    private UploadFileService uploadFileService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    /**
     * 查询文件列表
     *
     * @param date 文件上传时间
     */
    @GetMapping("/list")
    public Object list(Date date) {
        return ResponseUtil.ok(uploadFileService.list());
    }

    /**
     * 上传文件
     *
     * @param category 文件名称
     * @param tags 标签
     * @param file 目录
     */
    @PostMapping("/upload")
    public Object upload(UploadFileForm uploadFileForm) {
        return ResponseUtil.ok(uploadFileService.upload(uploadFileForm));
    }

    /**
     * 删除上传的文件
     *
     * @param fileUniqueNames 文件名称
     * @param fileTags 标签
     * @param fileCategorys 目录
     */
    @PostMapping("/deleteByUniqueNames")
    public Object deleteByUniqueNames(@RequestBody HashMap<String, Object> map) {
        int i = uploadFileService.delete_auto(map);
        return ResponseUtil.ok(i);
    }

}
