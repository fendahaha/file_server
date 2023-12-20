package com.example.file_server.controller;

import com.example.file_server.utils.OnlineStreamManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Autowired
    public RedisController(RedisTemplate redisTemplate, OnlineStreamManager onlineStreamManager) {
        this.redisTemplate = redisTemplate;
        this.onlineStreamManager = onlineStreamManager;
    }

    @GetMapping("/streams")
    public Object index() {
        List anchorUuids = redisTemplate.opsForHash().values(onlineStreamManager.anchorStreamsKeyHash);
        Set members = redisTemplate.opsForSet().members(onlineStreamManager.onlineRoomKeySet);
        HashMap<String, Object> map = new HashMap<>();
        map.put("anchors", anchorUuids);
        map.put("rooms", members);
        return map;
    }

    @GetMapping("/clean")
    public Object clean() {
        Long delete = redisTemplate.delete(Arrays.asList(onlineStreamManager.anchorStreamsKeyHash, onlineStreamManager.onlineRoomKeySet));
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
        Boolean b = redisTemplate.hasKey(onlineStreamManager.onlineRoomKeySet);
        Boolean b1 = redisTemplate.hasKey(onlineStreamManager.anchorStreamsKeyHash);
        return Arrays.asList(b, b1);
    }

}
