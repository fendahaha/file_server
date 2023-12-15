package com.example.file_server.controller;

import com.example.file_server.entity.Room;
import com.example.file_server.form.RoomCreateFrom;
import com.example.file_server.form.RoomQueryForm;
import com.example.file_server.service.impl.RoomServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.file_server.service.impl.SrsStreamsServiceImpl.onlineRoomKey;

@RestController
@RequestMapping("/room")
public class RoomController extends BaseController {
    @Autowired
    private RoomServiceImpl roomService;
    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/{room_uuid}")
    public Object index(@PathVariable String room_uuid) {
        return "";
    }

    @PostMapping("/list")
    public Object list(@Validated RoomQueryForm roomQueryForm) {
        PageHelper.startPage(roomQueryForm.getPageNum(), roomQueryForm.getPageSize());
        List<Room> list = roomService.list();
        PageInfo<Room> pageInfo = new PageInfo<>(list);
        return ResponseUtil.ok(pageInfo);
    }

    @PostMapping("/create")
    public Object create(@RequestBody RoomCreateFrom roomCreateFrom) {
        int i = roomService._create(roomCreateFrom);
        if (i > 0) {
            return ResponseUtil.ok(i);
        }
        return ResponseUtil.internalServerError(null);
    }

    @PostMapping("/update")
    public Object update() {
        return "";
    }

    @PostMapping("/delete{room_uuid}")
    public Object delete(@PathVariable String room_uuid) {
        return "";
    }

    @PostMapping("/is_online")
    public Object is_online(@Size(min = 1) @RequestParam("room_uuid") String room_uuid) {
        Boolean member = redisTemplate.opsForSet().isMember(onlineRoomKey, room_uuid);
        return ResponseUtil.ok(member);
    }
}
