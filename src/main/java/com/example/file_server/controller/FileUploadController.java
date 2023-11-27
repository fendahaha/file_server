package com.example.file_server.controller;

import com.example.file_server.entity.UploadFile;
import com.example.file_server.form.FileDeleteForm;
import com.example.file_server.form.FileQueryForm;
import com.example.file_server.form.FileUploadForm;
import com.example.file_server.service.UploadFileService;
import com.example.file_server.utils.ResponseUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 上传文件处理操作
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
     * @param date     文件上传时间
     * @param pageNum
     * @param pageSize
     */
    @GetMapping("/list")
    public Object list(@Validated FileQueryForm fileQueryForm, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            HashMap<String, Object> hashMap = new HashMap<>();
            fieldErrors.stream().forEach(e -> {
                hashMap.put(e.getField(), e.getDefaultMessage());
            });
            return ResponseUtil.badRequest(hashMap);
        }
        PageHelper.startPage(fileQueryForm.getPageNum(), fileQueryForm.getPageSize());
        List<UploadFile> list = uploadFileService.list();
        PageInfo<UploadFile> pageInfo = new PageInfo<>(list);
        return ResponseUtil.ok(pageInfo);
    }

    /**
     * 上传文件
     *
     * @param category 目录
     * @param tags     标签
     * @param file     文件名称
     */
    @PostMapping("/upload")
    public Object upload(@Validated FileUploadForm fileUploadForm, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            HashMap<String, Object> hashMap = new HashMap<>();
            fieldErrors.stream().forEach(e -> {
                hashMap.put(e.getField(), e.getDefaultMessage());
            });
            return ResponseUtil.badRequest(hashMap);
        }
        return ResponseUtil.ok(uploadFileService.upload(fileUploadForm));
    }

    /**
     * 删除上传的文件
     *
     * @param fileUniqueNames 文件名称
     * @param fileTags        标签
     * @param fileCategorys   目录
     */
    @PostMapping("/deleteByUniqueNames")
    public Object deleteByUniqueNames(@RequestBody @Validated FileDeleteForm fileDeleteForm) {
        int i = uploadFileService.delete_auto(fileDeleteForm);
        return ResponseUtil.ok(i);
    }
}
