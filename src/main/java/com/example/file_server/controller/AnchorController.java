package com.example.file_server.controller;

import com.example.file_server.form.AnchorForm;
import com.example.file_server.service.impl.AnchorServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@Validated
@RequestMapping("/anchor")
@RestController
public class AnchorController extends BaseController {
    @Autowired
    private AnchorServiceImpl service;

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

    @PostMapping("/create")
    public Object create(@RequestBody @Validated AnchorForm form) throws Exception {
        return ResponseUtil.ok(service.create(form));
    }

    @PostMapping("/update")
    public Object update(@RequestBody @Validated AnchorForm form) {
        service.update(form);
        return ResponseUtil.ok(true);
    }

    @PostMapping("/delete")
    public Object delete(@Min(0) Integer id) throws Exception {
        service.deleteById(id);
        return ResponseUtil.ok(true);
    }
}
