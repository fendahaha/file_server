package com.example.file_server.service.impl;

import com.example.file_server.entity.Room;
import com.example.file_server.form.RoomCreateFrom;
import com.example.file_server.mapper.RoomMapper;
import com.example.file_server.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    public Room create() {
        Room room = new Room();
        room.setRoomUuid(UUIDUtil.generateUUID());
        room.setStreamAddress("rtmp://localhost/live/livestream");
        room.setStreamApp("live");
        room.setStreamName("livestream");
        room.setRoomCreateAt(new Date());
        room.setStreamOnline(0);
        roomMapper.insertSelective(room);
        return room;
    }

}
