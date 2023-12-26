package com.example.file_server.utils;

import com.example.file_server.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OnlineUserManager {
    private RedisTemplate redisTemplate;
    private OnlineStreamManager onlineStreamManager;
    private String keyPrefix = "onlineLoginUsers";
    private String room_online_user_session_key_prefix = "room_online_user_session";

    @Autowired
    public OnlineUserManager(RedisTemplate redisTemplate, OnlineStreamManager onlineStreamManager) {
        this.redisTemplate = redisTemplate;
        this.onlineStreamManager = onlineStreamManager;
    }

    public void put_login_user(String room_uuid, String user_uuid, User user) throws JsonProcessingException {
        this.redisTemplate.opsForHash().put(keyPrefix + "-" + room_uuid, user_uuid, JsonUtil.object2Json(user));
    }

    public Long remove_login_user(String room_uuid, String user_uuid) {
        return this.redisTemplate.opsForHash().delete(keyPrefix + "-" + room_uuid, user_uuid);
    }

    public List get_login_users(String room_uuid) {
        return this.redisTemplate.opsForHash().values(keyPrefix + "-" + room_uuid);
    }

    public void user_increment(String room_uuid, String sessionId) {
        String key = room_online_user_session_key_prefix + "-" + room_uuid;
        this.redisTemplate.opsForSet().add(key, sessionId);
    }

    public void user_decrement(String room_uuid, String sessionId) {
        String key = room_online_user_session_key_prefix + "-" + room_uuid;
        this.redisTemplate.opsForSet().remove(key, sessionId);
    }

    public Long get_room_online_user_counts(String room_uuid) {
        String key = room_online_user_session_key_prefix + "-" + room_uuid;
        Long size = this.redisTemplate.opsForSet().size(key);
        return size;
    }
}
