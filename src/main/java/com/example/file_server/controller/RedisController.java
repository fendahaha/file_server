package com.example.file_server.controller;

import com.example.file_server.utils.OnlineStreamManager;
import com.example.file_server.utils.OnlineUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@RequestMapping("/redis")
@RestController
public class RedisController {
    private RedisTemplate redisTemplate;
    private OnlineStreamManager onlineStreamManager;

    private OnlineUserManager onlineUserManager;

    @Autowired
    public RedisController(RedisTemplate redisTemplate, OnlineStreamManager onlineStreamManager, OnlineUserManager onlineUserManager) {
        this.redisTemplate = redisTemplate;
        this.onlineStreamManager = onlineStreamManager;
        this.onlineUserManager = onlineUserManager;
    }

    @GetMapping("/streams")
    public Object index() {
        List anchorUuids = redisTemplate.opsForHash().values(onlineStreamManager.anchors);
        Set members = redisTemplate.opsForSet().members(onlineStreamManager.rooms);
        HashMap<String, Object> map = new HashMap<>();
        map.put("anchors", anchorUuids);
        map.put("rooms", members);
        return map;
    }

    @GetMapping("/clean")
    public Object clean() {
        Long delete = redisTemplate.delete(Arrays.asList(onlineStreamManager.anchors, onlineStreamManager.rooms));
        return delete;
    }

    @GetMapping("/t1")
    public Object index1() {
        return onlineStreamManager.get_anchor_uuids();
    }

    @GetMapping("/t2")
    public Object index2() {
        return onlineStreamManager.is_online("aasd");
    }

    @GetMapping("/t3")
    public Object index3() {
        Boolean b = redisTemplate.hasKey(onlineStreamManager.rooms);
        Boolean b1 = redisTemplate.hasKey(onlineStreamManager.anchors);
        return Arrays.asList(b, b1);
    }

    @GetMapping("/users/{room_uuid}")
    public Object onlineUsers(@PathVariable String room_uuid) {
        List users = onlineUserManager.get_login_users(room_uuid);
        return users;
    }

    String key = "room_online_user_count-52360f8449a149fab46739a890d65a6b";
    @GetMapping("/a9")
    public Object a9(){
        Boolean delete = this.redisTemplate.delete(key);
        return delete;
    }
    @GetMapping("/a0")
    public Object a0(){
        Object o = this.redisTemplate.opsForValue().get(key);
        System.out.println(o);
        return o;
    }
    @GetMapping("/a1")
    public Object a1() {
        Long i = this.redisTemplate.opsForValue().increment(key,1);
        return i;
    }

    @GetMapping("/a2")
    public Object a2() {
        Long i = this.redisTemplate.opsForValue().decrement(key,1);
        return i;
    }

}
