package com.example.file_server.controller;

import com.example.file_server.dictionary.Role;
import com.example.file_server.entity.Gift;
import com.example.file_server.form.GiftForm;
import com.example.file_server.form.GiftSearchForm;
import com.example.file_server.interceptor.AuthenticateRequire;
import com.example.file_server.service.impl.GiftServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

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

    @PostMapping("/all")
    public Object all() {
        return ResponseUtil.ok(giftService.all());
    }

    @PostMapping("/list")
    public Object list(@RequestBody @Validated GiftSearchForm searchForm) {
        HashMap<String, Object> map = giftService.list(searchForm);
        return ResponseUtil.ok(map);
    }

    @AuthenticateRequire(Role.Administrator)
    @PostMapping("/create")
    public Object create(@RequestBody @Validated GiftForm giftForm) {
        Gift gift = giftService.create(giftForm);
        if (gift != null) {
            return ResponseUtil.ok(gift);
        }
        return ResponseUtil.internalServerError(null);
    }

    @AuthenticateRequire(Role.Administrator)
    @PostMapping("/update")
    public Object update(@RequestBody @Validated GiftForm giftForm) {
        boolean update = giftService.update(giftForm);
        if (update) {
            return ResponseUtil.ok(true);
        }
        return ResponseUtil.internalServerError(null);
    }

    @AuthenticateRequire(Role.Administrator)
    @PostMapping("/delete")
    public Object delete(@RequestBody @Validated GiftForm giftForm) {
        giftService.delete(giftForm);
        return ResponseUtil.ok(true);
    }
}
