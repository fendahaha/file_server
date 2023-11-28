package com.example.file_server.service.impl;

import com.example.file_server.dictionary.RoomOnline;
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

    public int create(RoomCreateFrom roomCreateFrom) {
        Room room = new Room();
        room.setRoomName(roomCreateFrom.getRoomName());
        room.setRoomStreamEnable(roomCreateFrom.getRoomStreamEnable());
        room.setRoomType(roomCreateFrom.getRoomType());
        room.setRoomCategory(roomCreateFrom.getRoomCategory());
        room.setRoomCover(roomCreateFrom.getRoomCover());
        room.setRoomUuid(UUIDUtil.generateStreamUUID());
        room.setRoomStreamApp("live");
        room.setRoomCreateAt(new Date());
        room.setRoomIsOnline(RoomOnline.Offline.getValue());
        room.setRoomOnlineUsers(0);
        return roomMapper.insertSelective(room);
    }

    public List<Room> list(){
        return roomMapper.selectByExample(null);
    }
}
