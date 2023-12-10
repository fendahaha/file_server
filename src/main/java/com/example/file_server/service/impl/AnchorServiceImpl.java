package com.example.file_server.service.impl;

import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.AnchorExample;
import com.example.file_server.form.AnchorForm;
import com.example.file_server.mapper.AnchorMapper;
import com.example.file_server.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AnchorServiceImpl {
    @Autowired
    private AnchorMapper mapper;

    public List<Anchor> list() {
        AnchorExample example = new AnchorExample();
        example.setOrderByClause("anchor_create_at desc");
        return mapper.selectByExample(example);
    }

    public Anchor create(AnchorForm form) {
        Anchor record = new Anchor();
        record.setUserUuid(form.getUserUuid());
        record.setAnchorUuid(UUIDUtil.generateUUID());
        record.setAnchorName(form.getAnchorName());
        record.setAnchorSanwei(form.getAnchorSanwei());
        record.setAnchorHeight(form.getAnchorHeight());
        record.setAnchorWieght(form.getAnchorWieght());
        record.setAnchorRemark(form.getAnchorRemark());
        record.setAnchorConfig(form.getAnchorConfig());
        record.setAnchorCreateAt(new Date());
        int i = mapper.insertSelective(record);
        return i > 0 ? record : null;
    }

    public boolean update(AnchorForm form) {
        AnchorExample example = new AnchorExample();
        example.createCriteria().andAnchorUuidEqualTo(form.getAnchorUuid());
        Anchor record = new Anchor();
        record.setAnchorConfig(form.getAnchorConfig());
        record.setAnchorRemark(form.getAnchorRemark());
        record.setAnchorWieght(form.getAnchorWieght());
        record.setAnchorHeight(form.getAnchorHeight());
        record.setAnchorName(form.getAnchorName());
        record.setAnchorSanwei(form.getAnchorSanwei());
        int i = mapper.updateByExampleSelective(record, example);
        return i > 0;
    }

    public boolean delete(AnchorForm form) {
        AnchorExample example = new AnchorExample();
        example.createCriteria().andAnchorUuidEqualTo(form.getAnchorUuid());
        int i = mapper.deleteByExample(example);
        return i > 0;
    }

}
