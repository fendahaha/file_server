package com.example.file_server.service.impl;

import com.example.file_server.dictionary.MessageType;
import com.example.file_server.dictionary.RoomType;
import com.example.file_server.dictionary.StreamType;
import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.Room;
import com.example.file_server.entity.SrsStreams;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.mapper.SrsStreamsMapper;
import com.example.file_server.utils.OnlineStreamManager;
import com.example.file_server.utils.UrlUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class SrsStreamsServiceImpl {
    @Autowired
    private SrsStreamsMapper srsStreamsMapper;
    @Autowired
    private RoomServiceImpl roomService;
    @Autowired
    private AnchorServiceImpl anchorService;
    @Autowired
    private OnlineStreamManager onlineStreamManager;
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    public String getRoomUuid(SrsStreams srsStreams) {
        String param = srsStreams.getParam();
        HashMap<String, String> hashMap = UrlUtil.extractFromQueryString(param.substring(1));
        return hashMap.get("token");
    }

    public void onPublic(SrsStreams srsStreams) {
        String room_uuid = getRoomUuid(srsStreams);
        List<Room> rooms = roomService.getRoomsByUUIds(Collections.singletonList(room_uuid));
        if (rooms.isEmpty()) {
            throw new DbActionExcetion("token不合法");
        }
        Room room = rooms.get(0);
        if (!room.getRoomEnable().equals(1)) {
            throw new DbActionExcetion("房间未开启直播功能");
        }
        if (!room.getStreamType().equals(StreamType.Live.getValue())) {
            throw new DbActionExcetion("房间直播类型不是live");
        }
        if (room.getRoomType().equals(RoomType.Anchor.getValue())) {
            List<Anchor> anchors = anchorService.getAnchorByRoomUUID(room.getRoomUuid());
            if (anchors.isEmpty()) {
                throw new DbActionExcetion("主播不存在");
            }
            onlineStreamManager.put(srsStreams, anchors.get(0), room);
            try {
                this.simpMessagingTemplate.convertAndSend("/topic/homePage",
                        MessageType.Page.createMessage("OnlineAnchorsUpdate"));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        } else {
            throw new DbActionExcetion("roomType不存在");
        }
//        try {
//            insert(srsStreams);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }

    public void onUnPublic(SrsStreams srsStreams) {
        String room_uuid = getRoomUuid(srsStreams);
        List<Room> rooms = roomService.getRoomsByUUIds(Collections.singletonList(room_uuid));
        if (!rooms.isEmpty()) {
            Room room = rooms.get(0);
            if (room.getRoomType().equals(RoomType.Anchor.getValue())) {
                List<Anchor> anchors = anchorService.getAnchorByRoomUUID(room.getRoomUuid());
                if (!anchors.isEmpty()) {
                    System.out.println("onlineStreamManager.del");
                    onlineStreamManager.del(srsStreams, anchors.get(0), room);
                    try {
                        this.simpMessagingTemplate.convertAndSend("/topic/homePage",
                                MessageType.Page.createMessage("OnlineAnchorsUpdate"));
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
//        try {
//            insert(srsStreams);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public SrsStreams insert(SrsStreams srsStreams) {
        srsStreams.setCreate_at(new Date());
        int i = srsStreamsMapper.insertSelective(srsStreams);
        return srsStreams;
    }
}
