package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.dictionary.RoomEnable;
import com.example.file_server.dictionary.RoomType;
import com.example.file_server.dictionary.StreamType;
import com.example.file_server.entity.Room;
import com.example.file_server.entity.RoomExample;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.form.RoomCreateFrom;
import com.example.file_server.mapper.RoomMapper;
import com.example.file_server.utils.UUIDUtil;
import com.example.file_server.utils.UrlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class RoomServiceImpl {

    @Autowired
    private RoomMapper roomMapper;

    public int _create(RoomCreateFrom roomCreateFrom) {
        Room room = new Room();

        room.setRoomUuid(UUIDUtil.generateStreamUniqueName());

        room.setRoomCreateAt(new Date());
        return roomMapper.insertSelective(room);
    }

    public List<Room> list() {
        return roomMapper.selectByExample(null);
    }

    @CommonTransactional
    public Room create() throws Exception {
        String room_uuid = UUIDUtil.generateUUID();
        String streamApp = "live";
        String streamId = UUIDUtil.generateUUID();
        HashMap<String, String> streamParam = new HashMap<>();
        streamParam.put("token", room_uuid);

        Room room = new Room();
        room.setRoomUuid(room_uuid);
        room.setRoomCreateAt(new Date());
        room.setRoomEnable(RoomEnable.Enable.getValue());
        room.setRoomType(RoomType.Anchor.getValue());
        room.setStreamType(StreamType.Live.getValue());
        room.setStreamAddress("/" + streamApp + "/" + streamId);
        room.setStreamApp(streamApp);
        room.setStreamName(streamId);
        room.setStreamParam(UrlUtil.convertToQueryString(streamParam));

        int i = roomMapper.insertSelective(room);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
        return room;
    }

    @CommonTransactional
    public void deleteByUUID(String uuid) {
        RoomExample example = new RoomExample();
        example.createCriteria().andRoomUuidEqualTo(uuid);
        int i = roomMapper.deleteByExample(example);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
    }

    public List<Room> getRoomsByUUIds(List<String> uuids) {
        RoomExample example = new RoomExample();
        example.createCriteria().andRoomUuidIn(uuids);
        return roomMapper.selectByExample(example);
    }

}
