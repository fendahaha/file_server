package com.example.file_server.service.impl;

import com.example.file_server.dictionary.UserType;
import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.AnchorExample;
import com.example.file_server.entity.User;
import com.example.file_server.form.AnchorForm;
import com.example.file_server.mapper.AnchorMapper;
import com.example.file_server.mapper.UserMapper;
import com.example.file_server.utils.UUIDUtil;
import com.example.file_server.utils.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class AnchorServiceImpl {
    @Autowired
    private AnchorMapper mapper;
    @Autowired
    private UserMapper userMapper;

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

    public Anchor create(AnchorForm form) {
        Date date = new Date();
        String uuid = UUIDUtil.generateUUID();

        User user = new User();
        user.setUserUuid(uuid);
        user.setUserName(form.getUserName());
        user.setUserPassword(form.getUserPassword());
        user.setUserDisplayName(UserUtil.generateUsername());
        user.setUserType(UserType.Anchor.getValue());
        user.setUserCountry(form.getUserCountry());
        user.setUserPhone(form.getUserPhone());
        user.setUserEmail(form.getUserEmail());
        user.setUserAvatar(form.getUserAvatar());
        user.setCreateAt(date);

        Anchor record = new Anchor();
        record.setUserUuid(uuid);
        record.setAnchorUuid(UUIDUtil.generateUUID());
        record.setAnchorSanwei(form.getAnchorSanwei());
        record.setAnchorHeight(form.getAnchorHeight());
        record.setAnchorWieght(form.getAnchorWieght());
        record.setAnchorRemark(form.getAnchorRemark());
        record.setAnchorConfig(form.getAnchorConfig());
        record.setAnchorCreateAt(date);

        int i1 = userMapper.insertSelective(user);
        int i = mapper.insertSelective(record);
        return (i > 0) && (i1 > 0) ? record : null;
    }

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

    public boolean delete(AnchorForm form) {
        /*todo*/
        AnchorExample example = new AnchorExample();
        example.createCriteria().andAnchorUuidEqualTo(form.getAnchorUuid());
        int i = mapper.deleteByExample(example);
        return i > 0;
    }

}
