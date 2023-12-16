package com.example.file_server.controller;

import com.example.file_server.dictionary.Role;
import com.example.file_server.entity.Room;
import com.example.file_server.form.RoomCreateFrom;
import com.example.file_server.form.RoomQueryForm;
import com.example.file_server.interceptor.AuthenticateRequire;
import com.example.file_server.service.impl.RoomServiceImpl;
import com.example.file_server.utils.OnlineStreamManager;
import com.example.file_server.utils.ResponseUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController extends BaseController {
    @Autowired
    private RoomServiceImpl roomService;
    @Autowired
    private OnlineStreamManager onlineStreamManager;

    @AuthenticateRequire(Role.Administrator)
    @PostMapping("/list")
    public Object list(@Validated RoomQueryForm roomQueryForm) {
        PageHelper.startPage(roomQueryForm.getPageNum(), roomQueryForm.getPageSize());
        List<Room> list = roomService.list();
        PageInfo<Room> pageInfo = new PageInfo<>(list);
        return ResponseUtil.ok(pageInfo);
    }
    @AuthenticateRequire(Role.Administrator)
    @PostMapping("/create")
    public Object create(@RequestBody RoomCreateFrom roomCreateFrom) throws Exception {
        Room room = roomService.create();
        return ResponseUtil.ok(room);
    }
    @AuthenticateRequire(Role.Administrator)
    @PostMapping("/update")
    public Object update() {
        return "";
    }
    @AuthenticateRequire(Role.Administrator)
    @PostMapping("/delete{room_uuid}")
    public Object delete(@PathVariable String room_uuid) {
        return "";
    }

    @PostMapping("/is_online")
    public Object is_online(@Size(min = 1) @RequestParam("room_uuid") String room_uuid) {
        return ResponseUtil.ok(onlineStreamManager.is_online(room_uuid));
    }
}
