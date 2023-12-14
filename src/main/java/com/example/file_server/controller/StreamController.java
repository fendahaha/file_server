package com.example.file_server.controller;

import com.example.file_server.dictionary.StreamAction;
import com.example.file_server.entity.SrsHls;
import com.example.file_server.entity.SrsSessions;
import com.example.file_server.entity.SrsStreams;
import com.example.file_server.mapper.SrsHlsMapper;
import com.example.file_server.mapper.SrsSessionsMapper;
import com.example.file_server.mapper.SrsStreamsMapper;
import com.example.file_server.service.impl.SrsStreamsServiceImpl;
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
    @Autowired
    private SrsStreamsServiceImpl srsStreamsService;

    @PostMapping("/streams")
    public Object streams(@RequestBody SrsStreams srsStreams) {
        System.out.println("srsStreams.getParam:" + srsStreams.getParam());
        if (srsStreams.getAction().equals(StreamAction.Publish.getValue())) {
            if (srsStreamsService.onPublic(srsStreams)) {
                return ResponseEntity.ok(0);
            }
        }
        if (srsStreams.getAction().equals(StreamAction.UnPublish.getValue())) {
            srsStreamsService.onUnPublic(srsStreams);
            return ResponseEntity.ok(0);
        }
        return ResponseEntity.badRequest();
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
