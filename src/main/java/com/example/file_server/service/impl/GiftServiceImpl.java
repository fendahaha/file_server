package com.example.file_server.service.impl;

import com.example.file_server.entity.Gift;
import com.example.file_server.entity.GiftExample;
import com.example.file_server.form.GiftForm;
import com.example.file_server.mapper.GiftMapper;
import com.example.file_server.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GiftServiceImpl {
    @Autowired
    private GiftMapper giftMapper;

    public List<Gift> list() {
        GiftExample giftExample = new GiftExample();
        giftExample.setOrderByClause("gift_order asc, gift_create_at desc");
        return giftMapper.selectByExample(giftExample);
    }

    public Gift create(GiftForm giftForm) {
        Gift gift = new Gift();
        gift.setGiftUuid(UUIDUtil.generateUUID());
        gift.setGiftName(giftForm.getGiftName());
        gift.setGiftValue(giftForm.getGiftValue());
        gift.setGiftImage(giftForm.getGiftImage());
        gift.setGiftOrder(giftForm.getGiftOrder());
        gift.setGiftCreateAt(new Date());
        int i = giftMapper.insertSelective(gift);
        return i > 0 ? gift : null;
    }

    public boolean update(GiftForm giftForm) {
        GiftExample example = new GiftExample();
        GiftExample.Criteria criteria = example.createCriteria();
        criteria.andGiftUuidEqualTo(giftForm.getGiftUuid());
        Gift gift = new Gift();
        gift.setGiftName(giftForm.getGiftName());
        gift.setGiftValue(giftForm.getGiftValue());
        gift.setGiftImage(giftForm.getGiftImage());
        gift.setGiftOrder(giftForm.getGiftOrder());
        int i = giftMapper.updateByExampleSelective(gift, example);
        return i > 0;
    }

    public boolean delete(GiftForm giftForm) {
        GiftExample example = new GiftExample();
        GiftExample.Criteria criteria = example.createCriteria();
        criteria.andGiftUuidEqualTo(giftForm.getGiftUuid());
        int i = giftMapper.deleteByExample(example);
        return i > 0;
    }
}
