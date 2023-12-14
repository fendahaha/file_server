package com.example.file_server.controller;

import com.example.file_server.form.AnchorForm;
import com.example.file_server.service.impl.GiftSendRecordServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@RequestMapping("/gift_send_record")
@RestController
public class GiftSendRecordController extends BaseController {

    @Autowired
    private GiftSendRecordServiceImpl service;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @PostMapping("/list")
    public Object list(@RequestBody @Validated AnchorForm form) {
        HashMap<String, Object> map = service.list(form);
        return ResponseUtil.ok(map);
    }

    @PostMapping("/delete")
    public Object delete(@RequestBody @Validated AnchorForm form) {
        service.delete(form);
        return ResponseUtil.ok(true);
    }

}
