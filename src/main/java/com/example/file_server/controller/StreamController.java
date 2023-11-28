package com.example.file_server.controller;

import com.example.file_server.entity.SrsHls;
import com.example.file_server.entity.SrsSessions;
import com.example.file_server.entity.SrsStreams;
import com.example.file_server.mapper.SrsHlsMapper;
import com.example.file_server.mapper.SrsSessionsMapper;
import com.example.file_server.mapper.SrsStreamsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/api/v1")
@RestController
public class StreamController {
    @Autowired
    private SrsStreamsMapper srsStreamsMapper;
    @Autowired
    private SrsSessionsMapper srsSessionsMapper;
    @Autowired
    private SrsHlsMapper srsHlsMapper;

    @PostMapping("/streams")
    public Object streams(@RequestBody SrsStreams srsStreams) {
        srsStreams.setCreate_at(new Date());
        int i = srsStreamsMapper.insertSelective(srsStreams);
        return ResponseEntity.ok(0);
    }

    @PostMapping("/sessions")
    public Object sessions(@RequestBody SrsSessions srsSessions) {
        srsSessions.setCreate_at(new Date());
        int i = srsSessionsMapper.insertSelective(srsSessions);
        return ResponseEntity.ok(0);
    }

    @PostMapping("/hls")
    public Object hls(@RequestBody SrsHls srsHls) {
        srsHls.setCreate_at(new Date());
        int i = srsHlsMapper.insertSelective(srsHls);
        return ResponseEntity.ok(0);
    }
}
