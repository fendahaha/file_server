package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.entity.GiftSendRecord;
import com.example.file_server.entity.GiftSendRecordExample;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.form.AnchorForm;
import com.example.file_server.mapper.GiftSendRecordMapper;
import com.example.file_server.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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

    @CommonTransactional
    public GiftSendRecord insert(String userUuid, String userName, String anchorUuid, String anchorName, String giftUuid, String giftname, Integer giftValue) {
        GiftSendRecord record = new GiftSendRecord();
        record.setGiftSendUuid(UUIDUtil.generateUUID());
        record.setGiftSendDate(new Date());
        record.setClientUuid(userUuid);
        record.setClientName(userName);
        record.setAnchorUuid(anchorUuid);
        record.setAnchorName(anchorName);
        record.setGiftUuid(giftUuid);
        record.setGiftName(giftname);
        record.setGiftValue(giftValue);
        int i = mapper.insertSelective(record);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
        return record;
    }

    public List<GiftSendRecord> selectLatest(int days) {
        if (days < 0) {
            throw new DbActionExcetion("fail");
        }
        Date curr = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(curr);
        calendar.add(Calendar.DATE, -days);
        Date before = calendar.getTime();

        GiftSendRecordExample example = new GiftSendRecordExample();
        example.createCriteria().andGiftSendDateBetween(before, curr);
        List<GiftSendRecord> list = mapper.selectByExample(example);

        return list;
    }
}
