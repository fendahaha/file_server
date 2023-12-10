package com.example.file_server.controller;

import com.example.file_server.entity.Anchor;
import com.example.file_server.form.AnchorForm;
import com.example.file_server.form.ListForm;
import com.example.file_server.service.impl.AnchorServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/anchor")
@RestController
public class AnchorController extends BaseController{
    @Autowired
    private AnchorServiceImpl service;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @PostMapping("/list")
    public Object list(@RequestBody @Validated ListForm listForm, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
        PageHelper.startPage(listForm.getPageNum(), listForm.getPageSize());
        List<Anchor> list = service.list();
        PageInfo<Anchor> pageInfo = new PageInfo<>(list);
        return ResponseUtil.ok(pageInfo);
    }

    @PostMapping("/create")
    public Object create(@RequestBody @Validated AnchorForm form, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
        Anchor r = service.create(form);
        if (r != null) {
            return ResponseUtil.ok(r);
        }
        return ResponseUtil.internalServerError(null);
    }

    @PostMapping("/update")
    public Object update(@RequestBody @Validated AnchorForm form, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
        boolean r = service.update(form);
        if (r) {
            return ResponseUtil.ok(r);
        }
        return ResponseUtil.internalServerError(null);
    }

    @PostMapping("/delete")
    public Object delete(@RequestBody @Validated AnchorForm form, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
        boolean r = service.delete(form);
        if (r) {
            return ResponseUtil.ok(r);
        }
        return ResponseUtil.internalServerError(null);
    }
}
