package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.AnchorExample;
import com.example.file_server.entity.Room;
import com.example.file_server.entity.User;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.form.AnchorForm;
import com.example.file_server.form.AnchorListForm;
import com.example.file_server.mapper.AnchorMapper;
import com.example.file_server.utils.OnlineStreamManager;
import com.example.file_server.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class AnchorServiceImpl {
    @Autowired
    private AnchorMapper anchorMapper;
    @Autowired
    private RoomServiceImpl roomService;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private OnlineStreamManager onlineStreamManager;

    public void queryUserRooms(List<Anchor> anchors) {
        if (!anchors.isEmpty()) {
            List<User> users = userService.getUsersByUUIDs(anchors.stream().map(Anchor::getUserUuid).toList());
            for (Anchor a : anchors) {
                for (User u : users) {
                    if (u.getUserUuid().equals(a.getUserUuid())) {
                        a.setUser(u);
                        break;
                    }
                }
            }
            List<Room> rooms = roomService.getRoomsByUUIds(anchors.stream().map(Anchor::getRoomUuid).toList());
            for (Anchor a : anchors) {
                for (Room r : rooms) {
                    if (r.getRoomUuid().equals(a.getRoomUuid())) {
                        a.setRoom(r);
                        break;
                    }
                }
            }
        }
    }

    public HashMap<String, Object> list(AnchorListForm form) {
        HashMap<String, Object> objectHashMap = new HashMap<>();
        objectHashMap.put("orderByClause", "anchor_create_at desc");
        objectHashMap.put("pageStart", (form.getPageNum() - 1) * form.getPageSize());
        objectHashMap.put("pageLimit", form.getPageSize());
        objectHashMap.put("roomEnable", form.getRoomEnable());
        objectHashMap.put("streamType", form.getStreamType());
        objectHashMap.put("userName", form.getUserName());
        List<Anchor> anchors = anchorMapper.selectByExample3(objectHashMap);
        queryUserRooms(anchors);
        int total = anchorMapper.selectCountByExample3(objectHashMap);

        HashMap<String, Object> map = new HashMap<>();
        map.put("list", anchors);
        map.put("total", total);
        return map;
    }

    @CommonTransactional
    public Anchor create(AnchorForm form) throws Exception {
        Room room = roomService.create();
        User user = userService.createAnchorUser(form);

        Anchor record = new Anchor();
        record.setUserUuid(user.getUserUuid());
        record.setRoomUuid(room.getRoomUuid());
        record.setAnchorUuid(UUIDUtil.generateUUID());
        record.setAnchorSanwei(form.getAnchorSanwei());
        record.setAnchorHeight(form.getAnchorHeight());
        record.setAnchorWieght(form.getAnchorWieght());
        record.setAnchorRemark(form.getAnchorRemark());
        record.setAnchorConfig(form.getAnchorConfig());
        record.setAnchorCreateAt(user.getCreateAt());
        int i = anchorMapper.insertSelective(record);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
        return record;
    }

    @CommonTransactional
    public void update(AnchorForm form) {
        AnchorExample example = new AnchorExample();
        example.createCriteria().andAnchorUuidEqualTo(form.getAnchorUuid());
        Anchor record = new Anchor();
        record.setAnchorConfig(form.getAnchorConfig());
        record.setAnchorRemark(form.getAnchorRemark());
        record.setAnchorWieght(form.getAnchorWieght());
        record.setAnchorHeight(form.getAnchorHeight());
        record.setAnchorSanwei(form.getAnchorSanwei());
        int i = anchorMapper.updateByExampleSelective(record, example);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
    }

    @CommonTransactional
    public void deleteById(int id) {
        Anchor anchor = anchorMapper.selectByPrimaryKey(id);
        if (anchor == null) {
            throw new DbActionExcetion("fail");
        }
        userService.deleteByUUID(anchor.getUserUuid());
        roomService.deleteByUUID(anchor.getRoomUuid());
        int i = anchorMapper.deleteByPrimaryKey(id);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
    }

    public List<Anchor> getAnchorByRoomUUID(String uuid) {
        AnchorExample example = new AnchorExample();
        example.createCriteria().andRoomUuidEqualTo(uuid);
        return anchorMapper.selectByExample(example);
    }

    /**
     * 获取在线主播
     */
    public List<Anchor> onlineAnchors() {
        List<String> uuids = onlineStreamManager.get_anchor_uuids();
        if (!uuids.isEmpty()) {
            AnchorExample anchorExample = new AnchorExample();
            anchorExample.createCriteria().andAnchorUuidIn(uuids);
            List<Anchor> anchors1 = anchorMapper.selectByExample(anchorExample);
            queryUserRooms(anchors1);
            return anchors1;
        }
        return new ArrayList<Anchor>();
    }

    /**
     * 获取所有主播（包括在线状态）
     */
    public List<HashMap<String, Object>> allAnchors() {
        List<String> anchor_uuids = onlineStreamManager.get_anchor_uuids();
        AnchorExample example = new AnchorExample();
        example.setOrderByClause("anchor_create_at desc");
        List<Anchor> anchors = anchorMapper.selectByExample(example);
        queryUserRooms(anchors);
        List<HashMap<String, Object>> list = anchors.stream().map(e -> {
            HashMap<String, Object> map = new HashMap<>();
            map.put("name", e.getUser().getUserDisplayName());
            map.put("email", e.getUser().getUserEmail());
            map.put("phone", e.getUser().getUserPhone());
            map.put("country", e.getUser().getUserCountry());
            map.put("avatar", e.getUser().getUserAvatar());
            map.put("remark", e.getAnchorRemark());
            map.put("room_uuid", e.getRoomUuid());
            map.put("user_uuid", e.getUserUuid());
            map.put("online", anchor_uuids.contains(e.getAnchorUuid()));
            return map;
        }).toList();
        return list;
    }

    /**
     * 查询单个主播详情
     */
    public Anchor getByRoomUuid(String room_uuid) {
        List<Anchor> anchors = getAnchorByRoomUUID(room_uuid);
        if (anchors.isEmpty()) {
            throw new DbActionExcetion("fail");
        }
        queryUserRooms(anchors);
        return anchors.get(0);
    }
}
