package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.AnchorExample;
import com.example.file_server.entity.Room;
import com.example.file_server.entity.User;
import com.example.file_server.form.AnchorForm;
import com.example.file_server.mapper.AnchorMapper;
import com.example.file_server.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AnchorServiceImpl {
    @Autowired
    private AnchorMapper mapper;
    @Autowired
    private RoomServiceImpl roomService;
    @Autowired
    private UserServiceImpl userService;

    public HashMap<String, Object> list(AnchorForm form) {
        AnchorExample example = new AnchorExample();
        AnchorExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("anchor_create_at desc");

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("example", example);
        int start = (form.getPageNum() - 1) * form.getPageSize();
        hashMap.put("pageStart", start);
        hashMap.put("pageLimit", form.getPageSize());

        List<Anchor> anchors = mapper.selectByExample2(hashMap);
        int count = mapper.selectCount(example);

        HashMap<String, Object> map = new HashMap<>();
        map.put("list", anchors);
        map.put("total", count);
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
        int i = mapper.insertSelective(record);
        if (i > 0) {
            return record;
        }
        throw new Exception("fail");
    }
    @CommonTransactional
    public boolean update(AnchorForm form) {
        AnchorExample example = new AnchorExample();
        example.createCriteria().andAnchorUuidEqualTo(form.getAnchorUuid());
        Anchor record = new Anchor();
        record.setAnchorConfig(form.getAnchorConfig());
        record.setAnchorRemark(form.getAnchorRemark());
        record.setAnchorWieght(form.getAnchorWieght());
        record.setAnchorHeight(form.getAnchorHeight());
        record.setAnchorSanwei(form.getAnchorSanwei());
        int i = mapper.updateByExampleSelective(record, example);
        return i > 0;
    }
    @CommonTransactional
    public void deleteById(int id) throws Exception {
        Anchor anchor = mapper.selectByPrimaryKey(id);
        if (anchor != null) {
            userService.deleteByUUID(anchor.getUserUuid());
            roomService.deleteByUUID(anchor.getRoomUuid());
            int i = mapper.deleteByPrimaryKey(id);
            if (i <= 0) {
                throw new Exception("fail");
            }
        }
    }

}
