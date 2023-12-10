package com.example.file_server.service.impl;

import com.example.file_server.entity.GiftSendRecord;
import com.example.file_server.form.GiftSendForm;
import com.example.file_server.mapper.GiftSendRecordMapper;
import com.example.file_server.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GiftSendRecordServiceImpl {
    @Autowired
    private GiftSendRecordMapper mapper;

    public GiftSendRecord create(GiftSendForm giftSendForm) {
        GiftSendRecord record = new GiftSendRecord();
        record.setGiftSendUuid(UUIDUtil.generateUUID());
        record.setGiftSendDate(new Date());
        record.setUserUuid(giftSendForm.getUserUuid());
        record.setAnchorUuid(giftSendForm.getAnchorUuid());
        record.setGiftUuid(giftSendForm.getGiftUuid());
        record.setGiftValue(giftSendForm.getGiftValue());
        int i = mapper.insertSelective(record);
        return i > 0 ? record : null;
    }
}
