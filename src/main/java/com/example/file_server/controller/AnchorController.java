package com.example.file_server.controller;

import com.example.file_server.dictionary.MessageType;
import com.example.file_server.dictionary.Role;
import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.Room;
import com.example.file_server.entity.SrsStreams;
import com.example.file_server.form.AnchorForm;
import com.example.file_server.form.AnchorListForm;
import com.example.file_server.interceptor.AuthenticateRequire;
import com.example.file_server.service.impl.AnchorServiceImpl;
import com.example.file_server.utils.OnlineStreamManager;
import com.example.file_server.utils.ResponseUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
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
    @Autowired
    private OnlineStreamManager onlineStreamManager;
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @AuthenticateRequire(Role.Administrator)
    @PostMapping("/list")
    public Object list(@RequestBody @Validated AnchorListForm form) {
        HashMap<String, Object> map = service.list(form);
        return ResponseUtil.ok(map);
    }

    @AuthenticateRequire(Role.Administrator)
    @PostMapping("/create")
    public Object create(@RequestBody @Validated AnchorForm form) throws Exception {
        return ResponseUtil.ok(service.create(form));
    }

    @AuthenticateRequire(Role.Administrator)
    @PostMapping("/update")
    public Object update(@RequestBody @Validated AnchorForm form) {
        service.update(form);
        return ResponseUtil.ok(true);
    }

    @AuthenticateRequire(Role.Anchor)
    @PostMapping("/update2")
    public Object update2(@RequestBody @Validated AnchorForm form) {
        service.update2(form);
        return ResponseUtil.ok(true);
    }

    @AuthenticateRequire(Role.Administrator)
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
        Anchor anchor = service.getByRoomUuid(room_uuid);
        return ResponseUtil.ok(anchor);
    }

    @PostMapping("/query_by_useruuid")
    public Object query_by_useruuid(@Size(min = 1) @RequestParam("user_uuid") String uuid) {
        Anchor anchor = service.getAnchorByUserUuid(uuid);
        return ResponseUtil.ok(anchor);
    }

    @PostMapping("/rank")
    public Object index() {
        List<HashMap<String, Object>> rank = service.rank();
        return ResponseUtil.ok(rank);
    }

    @AuthenticateRequire(Role.Anchor)
    @GetMapping("/setOnlineStatus")
    public Object setOnlineStatus(@Size(min = 1) @RequestParam("user_uuid") String uuid,
                                  @Min(0) @RequestParam("status") Integer status) {
        Anchor anchor = service.getAnchorByUserUuid(uuid);
        Room room = anchor.getRoom();
        if (status.equals(0)) {
            onlineStreamManager.del(new SrsStreams(), anchor, room);
            try {
                this.simpMessagingTemplate.convertAndSend("/topic/homePage",
                        MessageType.Page.createMessage("OnlineAnchorsUpdate"));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        } else if (status.equals(1)) {
            onlineStreamManager.put(new SrsStreams(), anchor, room);
            try {
                this.simpMessagingTemplate.convertAndSend("/topic/homePage",
                        MessageType.Page.createMessage("OnlineAnchorsUpdate"));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        } else {
            return ResponseUtil.ok(false);
        }
        return ResponseUtil.ok(true);
    }
}
