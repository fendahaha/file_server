package com.example.file_server.controller;

import com.example.file_server.service.impl.FollowsServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RequestMapping("/follows")
@RestController
public class FollowsController {
    private FollowsServiceImpl followsService;

    @Autowired
    public FollowsController(FollowsServiceImpl followsService) {
        this.followsService = followsService;
    }

    @PostMapping("/follow")
    public Object follow(@Size(min = 1) String clientUserUuid, @Size(min = 1) String anchorUserUuid) {
        return ResponseUtil.ok(followsService.follow(clientUserUuid, anchorUserUuid));
    }

    @PostMapping("/unfollow")
    public Object unfollow(@Size(min = 1) String clientUserUuid, @Size(min = 1) String anchorUserUuid) {
        return ResponseUtil.ok(followsService.unfollow(clientUserUuid, anchorUserUuid));
    }

    @GetMapping("/client/{clientUserUuid}")
    public Object clientFollows(@PathVariable("clientUserUuid") String clientUserUuid) {
        return ResponseUtil.ok(followsService.get_client_followed_anchors(clientUserUuid));
    }
}
