package com.example.file_server.utils;

import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.Room;
import com.example.file_server.entity.SrsStreams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Set;

@Component
public class OnlineStreamManager {
    private RedisTemplate redisTemplate;
    public String anchors = "online_anchor_uuids";
    public String rooms = "online_room_uuids";

    @Autowired
    public OnlineStreamManager(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void put(SrsStreams srsStreams, Anchor anchor, Room room) {
        redisTemplate.opsForSet().add(anchors, anchor.getAnchorUuid());
        redisTemplate.opsForSet().add(rooms, room.getRoomUuid());
    }

    public void del(SrsStreams srsStreams, Anchor anchor, Room room) {
        Long delete = redisTemplate.opsForSet().remove(anchors, anchor.getAnchorUuid());
        Long remove = redisTemplate.opsForSet().remove(rooms, room.getRoomUuid());
    }

    public ArrayList<String> get_anchor_uuids() {
        Set members = redisTemplate.opsForSet().members(anchors);
        return new ArrayList<String>(members);
    }

    public boolean is_online(String room_uuid) {
        return redisTemplate.opsForSet().isMember(rooms, room_uuid);
    }

}
