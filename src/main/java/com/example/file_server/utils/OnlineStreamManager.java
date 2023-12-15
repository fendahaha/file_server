package com.example.file_server.utils;

import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.Room;
import com.example.file_server.entity.SrsStreams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OnlineStreamManager {
    private RedisTemplate redisTemplate;
    public String anchorStreamsKey = "anchor_streams";
    public String onlineRoomKey = "online_room_uuid";

    @Autowired
    public OnlineStreamManager(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void put(SrsStreams srsStreams, Anchor anchor, Room room) {
        redisTemplate.opsForHash().put(anchorStreamsKey, srsStreams.getStream_id(), anchor.getAnchorUuid());
        redisTemplate.opsForSet().add(onlineRoomKey, room.getRoomUuid());
    }

    public void del(SrsStreams srsStreams, Anchor anchor, Room room) {
        Long delete = redisTemplate.opsForHash().delete(anchorStreamsKey, srsStreams.getStream_id());
        Long remove = redisTemplate.opsForSet().remove(onlineRoomKey, room.getRoomUuid());
    }

    public List<String> get_anchor_uuids() {
        return (List<String>) redisTemplate.opsForHash().values(anchorStreamsKey);
    }

    public boolean is_online(String room_uuid) {
        return redisTemplate.opsForSet().isMember(onlineRoomKey, room_uuid);
    }

}
