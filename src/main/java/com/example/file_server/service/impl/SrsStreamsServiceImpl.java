package com.example.file_server.service.impl;

import com.example.file_server.entity.SrsStreams;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.mapper.SrsStreamsMapper;
import com.example.file_server.utils.StreamUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;

@Service
public class SrsStreamsServiceImpl {
    @Autowired
    private SrsStreamsMapper srsStreamsMapper;

    public boolean onPublic(SrsStreams srsStreams) {
        String param = srsStreams.getParam();
        HashMap<String, Object> data = StreamUtil.verifyStreamParams(param);
        String room_uuid = (String) data.get("room_uuid");
        System.out.println("room_uuid " + room_uuid);
        insert(srsStreams);
        /*todo 设置上线状态*/
        return true;
    }


    public SrsStreams insert(SrsStreams srsStreams) {
        srsStreams.setCreate_at(new Date());
        int i = srsStreamsMapper.insertSelective(srsStreams);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
        return srsStreams;
    }
}
