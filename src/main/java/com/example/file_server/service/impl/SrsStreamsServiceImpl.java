package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.entity.SrsStreams;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.mapper.SrsStreamsMapper;
import com.example.file_server.utils.UrlUtil;
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
        HashMap<String, String> hashMap = UrlUtil.extractFromQueryString(param.substring(1));
        String room_uuid = hashMap.get("token");
        System.out.println("room_uuid " + room_uuid);
//        insert(srsStreams);
        /*todo 设置上线状态*/
        return true;
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
