package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.AnchorExample;
import com.example.file_server.entity.Follows;
import com.example.file_server.entity.FollowsExample;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.mapper.AnchorMapper;
import com.example.file_server.mapper.FollowsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FollowsServiceImpl {
    private FollowsMapper followsMapper;
    private AnchorMapper anchorMapper;

    @Autowired
    public FollowsServiceImpl(FollowsMapper followsMapper, AnchorMapper anchorMapper) {
        this.followsMapper = followsMapper;
        this.anchorMapper = anchorMapper;
    }

    public boolean exist(String clientUserUuid, String anchorUserUuid) {
        FollowsExample example = new FollowsExample();
        example.createCriteria().andAnchorUserUuidEqualTo(anchorUserUuid).andClientUserUuidEqualTo(clientUserUuid);
        List<Follows> follows = followsMapper.selectByExample(example);
        return !follows.isEmpty();
    }

    public boolean insert(String clientUserUuid, String anchorUserUuid) {
        Follows follows = new Follows();
        follows.setAnchorUserUuid(anchorUserUuid);
        follows.setClientUserUuid(clientUserUuid);
        follows.setCreateAt(new Date());
        return followsMapper.insertSelective(follows) > 0;
    }

    public boolean delete(String clientUserUuid, String anchorUserUuid) {
        FollowsExample example = new FollowsExample();
        example.createCriteria().andAnchorUserUuidEqualTo(anchorUserUuid).andClientUserUuidEqualTo(clientUserUuid);
        return followsMapper.deleteByExample(example) > 0;
    }

    public synchronized boolean anchorFollowsIncrement(String anchorUserUuid, int i) {
        AnchorExample example = new AnchorExample();
        example.createCriteria().andUserUuidEqualTo(anchorUserUuid);
        List<Anchor> anchors = anchorMapper.selectByExample(example);
        Anchor anchor = anchors.get(0);
        Anchor anchorUpdate = new Anchor();
        anchorUpdate.setAnchorFollowers(anchor.getAnchorFollowers() + i);
        return anchorMapper.updateByExampleSelective(anchorUpdate, example) > 0;
    }

    @CommonTransactional
    public boolean follow(String clientUserUuid, String anchorUserUuid) {
        if (exist(clientUserUuid, anchorUserUuid)) {
            return true;
        }
        if (insert(clientUserUuid, anchorUserUuid)) {
            if (anchorFollowsIncrement(anchorUserUuid, 1)) {
                return true;
            }
        }
        throw new DbActionExcetion("fail");
    }

    @CommonTransactional
    public boolean unfollow(String clientUserUuid, String anchorUserUuid) {
        if (!exist(clientUserUuid, anchorUserUuid)) {
            return true;
        }
        if (delete(clientUserUuid, anchorUserUuid)) {
            if (anchorFollowsIncrement(anchorUserUuid, -1)) {
                return true;
            }
        }
        throw new DbActionExcetion("fail");
    }

    public List<Anchor> get_client_followed_anchors(String clientUserUuid) {
        FollowsExample example = new FollowsExample();
        example.createCriteria().andClientUserUuidEqualTo(clientUserUuid);
        List<Follows> follows = followsMapper.selectByExample(example);
        List<String> list = follows.stream().map(Follows::getAnchorUserUuid).toList();
        AnchorExample anchorExample = new AnchorExample();
        anchorExample.createCriteria().andUserUuidIn(list);
        return anchorMapper.selectByExampleWithBLOBs(anchorExample);
    }

}
