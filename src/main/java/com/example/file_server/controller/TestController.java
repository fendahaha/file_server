package com.example.file_server.controller;

import com.example.file_server.entity.Gift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping("/test")
public class TestController {

    private RedisTemplate redisTemplate;

    @Autowired
    public TestController(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @GetMapping("/set")
    public Object set(String k, String v) {
        redisTemplate.opsForValue().set(k, v);
        return "ok";
    }

    @GetMapping("/get")
    public Object get(String k) {
        Object o = redisTemplate.opsForValue().get(k);
        return o;
    }

    @GetMapping("/del")
    public Object del(String k) {
        Boolean delete = redisTemplate.delete(k);
        return delete;
    }

    @GetMapping("/expire")
    public Object expire(String k, int second) {
        Boolean expire = redisTemplate.expire(k, Duration.ofSeconds(second));
        return expire;
    }

    @GetMapping("/set2")
    public Object set2() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", 1);
        map.put("k3", 0);
        map.put("k4", true);
        map.put("k5", false);
        map.put("k6", 100.12);
        map.put("k7", new Date());
        redisTemplate.opsForHash().putAll("map", map);
        return "ok";
    }

    @GetMapping("/get2")
    public Object get2(String k) {
        Object o = redisTemplate.opsForHash().get("map", k);
        System.out.println(o.getClass());
        return o;
    }

    @GetMapping("/set3")
    public Object set3() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", 1);
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("name", "fenda");
        map1.put("k4", true);
        map1.put("k5", false);
        map1.put("k6", 100.12);
        map1.put("k7", new Date());
        map.put("people", map1);
        redisTemplate.opsForValue().set("map3", map);
        return "ok";
    }

    @GetMapping("/get3")
    public Object get3() {
        HashMap<String, Object> map = (HashMap<String, Object>) redisTemplate.opsForValue().get("map3");
        return map;
    }

    @GetMapping("/set4")
    public Object set4() {
        Gift gift = new Gift();
//        gift.setId(10);
        gift.setGiftCreateAt(new Date());
        gift.setGiftName("adsad");
//        gift.setAge(0);
        redisTemplate.opsForValue().set("gift", gift);
        return "ok";
    }

    @GetMapping("/get4")
    public Object get4() {
//        Gift gift = (Gift) redisTemplate.opsForValue().get("gift");
        Object gift = redisTemplate.opsForValue().get("gift");
        return gift;
    }
}
