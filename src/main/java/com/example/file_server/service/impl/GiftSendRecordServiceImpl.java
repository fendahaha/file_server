package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.entity.GiftSendRecordExample;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.form.AnchorForm;
import com.example.file_server.mapper.GiftSendRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class GiftSendRecordServiceImpl {
    @Autowired
    private GiftSendRecordMapper mapper;

    public HashMap<String, Object> list(AnchorForm form) {
        GiftSendRecordExample example = new GiftSendRecordExample();
        GiftSendRecordExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("gift_send_date desc");
        return CommonServiceUtil.listPage(mapper, example, form.getPageNum(), form.getPageSize());
    }

    @CommonTransactional
    public void delete(AnchorForm form) {
        int i = mapper.deleteByPrimaryKey(form.getId());
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
    }
}
