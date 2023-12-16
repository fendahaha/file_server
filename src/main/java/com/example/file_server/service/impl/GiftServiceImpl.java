package com.example.file_server.service.impl;

import com.example.file_server.config.CommonTransactional;
import com.example.file_server.entity.Gift;
import com.example.file_server.entity.GiftExample;
import com.example.file_server.exception.DbActionExcetion;
import com.example.file_server.form.GiftForm;
import com.example.file_server.form.GiftSearchForm;
import com.example.file_server.mapper.GiftMapper;
import com.example.file_server.utils.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class GiftServiceImpl {
    @Autowired
    private GiftMapper giftMapper;

    public HashMap<String, Object> list(GiftSearchForm form) {
        GiftExample giftExample = new GiftExample();
        GiftExample.Criteria criteria = giftExample.createCriteria();
        giftExample.setOrderByClause("gift_order asc, gift_create_at desc");
        if (StringUtils.isNotBlank(form.getGiftName())) {
            criteria.andGiftNameEqualTo(form.getGiftName());
        }
        if (form.getGiftValue() != null) {
            criteria.andGiftValueEqualTo(form.getGiftValue());
        }
        return CommonServiceUtil.listPage(giftMapper, giftExample, form.getPageNum(), form.getPageSize());
    }

    public List<Gift> all() {
        GiftExample giftExample = new GiftExample();
        giftExample.setOrderByClause("gift_order asc, gift_create_at desc");
        return giftMapper.selectByExample(giftExample);
    }

    @CommonTransactional
    public Gift create(GiftForm giftForm) {
        Gift gift = new Gift();
        gift.setGiftUuid(UUIDUtil.generateUUID());
        gift.setGiftName(giftForm.getGiftName());
        gift.setGiftValue(giftForm.getGiftValue());
        gift.setGiftImage(giftForm.getGiftImage());
        gift.setGiftOrder(giftForm.getGiftOrder());
        gift.setGiftCreateAt(new Date());
        int i = giftMapper.insertSelective(gift);
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
        return gift;
    }

    @CommonTransactional
    public boolean update(GiftForm giftForm) {
        Gift gift = new Gift();
        gift.setId(giftForm.getId());
        gift.setGiftName(giftForm.getGiftName());
        gift.setGiftValue(giftForm.getGiftValue());
        gift.setGiftImage(giftForm.getGiftImage());
        gift.setGiftOrder(giftForm.getGiftOrder());
        int i = giftMapper.updateByPrimaryKeySelective(gift);
        return i > 0;
    }

    @CommonTransactional
    public void delete(GiftForm giftForm) {
        int i = giftMapper.deleteByPrimaryKey(giftForm.getId());
        if (i <= 0) {
            throw new DbActionExcetion("fail");
        }
    }
}
