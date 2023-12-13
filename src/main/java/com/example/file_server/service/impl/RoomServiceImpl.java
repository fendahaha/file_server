package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.dictionary.RoomEnable;
import com.example.file_server.dictionary.StreamType;
import com.example.file_server.entity.Room;
import com.example.file_server.entity.RoomExample;
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

    @CommonTransactional
    public Room create() throws Exception {
        Room room = new Room();
        room.setRoomUuid(UUIDUtil.generateUUID());
        room.setRoomCreateAt(new Date());
        room.setRoomEnable(RoomEnable.Enable.getValue());
        room.setStreamType(StreamType.Live.getValue());
        room.setStreamAddress("rtmp://localhost/live/livestream");
        room.setStreamApp("live");
        room.setStreamName("livestream");
        int i = roomMapper.insertSelective(room);
        if (i > 0) {
            return room;
        }
        throw new Exception("fail");
    }

    @CommonTransactional
    public void deleteByUUID(String uuid) throws Exception {
        RoomExample example = new RoomExample();
        example.createCriteria().andRoomUuidEqualTo(uuid);
        int i = roomMapper.deleteByExample(example);
        if (i <= 0) {
            throw new Exception("fail");
        }
    }

}
