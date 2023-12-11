package com.example.file_server.controller;

import com.example.file_server.entity.Gift;
import com.example.file_server.form.GiftForm;
import com.example.file_server.form.GiftSearchForm;
import com.example.file_server.service.impl.GiftServiceImpl;
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
import java.util.HashMap;
import java.util.List;

@RequestMapping("/gift")
@RestController
public class GiftController extends BaseController {
    @Autowired
    private GiftServiceImpl giftService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @PostMapping("/list")
    public Object list(@RequestBody @Validated GiftSearchForm searchForm, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
        HashMap<String, Object> map = giftService.list(searchForm);
        return ResponseUtil.ok(map);
    }

    @PostMapping("/create")
    public Object create(@RequestBody @Validated GiftForm giftForm, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
        Gift gift = giftService.create(giftForm);
        if (gift != null) {
            return ResponseUtil.ok(gift);
        }
        return ResponseUtil.internalServerError(null);
    }

    @PostMapping("/update")
    public Object update(@RequestBody @Validated GiftForm giftForm, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
        boolean update = giftService.update(giftForm);
        if (update) {
            return ResponseUtil.ok(true);
        }
        return ResponseUtil.internalServerError(null);
    }

    @PostMapping("/delete")
    public Object delete(@RequestBody @Validated GiftForm giftForm, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
        boolean delete = giftService.delete(giftForm);
        if (delete) {
            return ResponseUtil.ok(true);
        }
        return ResponseUtil.internalServerError(null);
    }
}
