package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.dictionary.StreamType;
import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.Room;
import com.example.file_server.entity.SrsStreams;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.mapper.SrsStreamsMapper;
import com.example.file_server.utils.OnlineAnchorManager;
import com.example.file_server.utils.UrlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SrsStreamsServiceImpl {
    @Autowired
    private SrsStreamsMapper srsStreamsMapper;
    @Autowired
    private RoomServiceImpl roomService;
    @Autowired
    private AnchorServiceImpl anchorService;

    public boolean onPublic(SrsStreams srsStreams) {
        String param = srsStreams.getParam();
        HashMap<String, String> hashMap = UrlUtil.extractFromQueryString(param.substring(1));
        String room_uuid = hashMap.get("token");
        System.out.println("room_uuid " + room_uuid);
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
        List<Anchor> anchors = anchorService.getAnchorByRoomUUID(room.getRoomUuid());
        if (anchors.isEmpty()) {
            throw new DbActionExcetion("主播不存在");
        }
        insert(srsStreams);
        OnlineAnchorManager.put(anchors.get(0));
        return true;
    }

    public void onUnPublic(SrsStreams srsStreams) {
        String param = srsStreams.getParam();
        HashMap<String, String> hashMap = UrlUtil.extractFromQueryString(param.substring(1));
        String room_uuid = hashMap.get("token");
        List<Room> rooms = roomService.getRoomsByUUIds(Collections.singletonList(room_uuid));
        if (!rooms.isEmpty()) {
            List<Anchor> anchors = anchorService.getAnchorByRoomUUID(rooms.get(0).getRoomUuid());
            if (!anchors.isEmpty()) {
                OnlineAnchorManager.remove(anchors.get(0));
            }
        }
        try {
            insert(srsStreams);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @CommonTransactional
    public SrsStreams insert(SrsStreams srsStreams) {
        srsStreams.setCreate_at(new Date());
        int i = srsStreamsMapper.insertSelective(srsStreams);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
        return srsStreams;
    }
}
