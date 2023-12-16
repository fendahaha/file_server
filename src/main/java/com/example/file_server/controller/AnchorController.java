package com.example.file_server.controller;

import com.example.file_server.entity.Anchor;
import com.example.file_server.form.AnchorForm;
import com.example.file_server.interceptor.AuthenticateRequire;
import com.example.file_server.service.impl.AnchorServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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

    @AuthenticateRequire
    @PostMapping("/list")
    public Object list(@RequestBody @Validated AnchorForm form) {
        HashMap<String, Object> map = service.list(form);
        return ResponseUtil.ok(map);
    }
    @AuthenticateRequire
    @PostMapping("/create")
    public Object create(@RequestBody @Validated AnchorForm form) throws Exception {
        return ResponseUtil.ok(service.create(form));
    }
    @AuthenticateRequire
    @PostMapping("/update")
    public Object update(@RequestBody @Validated AnchorForm form) {
        service.update(form);
        return ResponseUtil.ok(true);
    }
    @AuthenticateRequire
    @PostMapping("/delete")
    public Object delete(@Min(0) Integer id) throws Exception {
        service.deleteById(id);
        return ResponseUtil.ok(true);
    }

    /**
     * 获取在线主播
     */
    @GetMapping("/online")
    public Object online() {
        List<Anchor> anchors = service.onlineAnchors();
        return ResponseUtil.ok(anchors);
    }

    /**
     * 获取所有主播(包括在线状态)
     */
    @PostMapping("/allAnchors")
    public Object allAnchors() {
        List<HashMap<String, Object>> hashMaps = service.allAnchors();
        return ResponseUtil.ok(hashMaps);
    }

    /**
     * 根据获取主播
     */
    @PostMapping("/query")
    public Object query(@Size(min = 1) @RequestParam("room_uuid") String room_uuid) {
        Anchor anchor = service.get(room_uuid);
        return ResponseUtil.ok(anchor);
    }
}
