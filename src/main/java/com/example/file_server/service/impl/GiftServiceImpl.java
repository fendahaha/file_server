package com.example.file_server.service.impl;

import com.example.file_server.entity.Gift;
import com.example.file_server.entity.GiftExample;
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

    public HashMap<String, Object> list(GiftSearchForm searchForm) {
        GiftExample giftExample = new GiftExample();
        GiftExample.Criteria criteria = giftExample.createCriteria();
        giftExample.setOrderByClause("gift_order asc, gift_create_at desc");
        if (StringUtils.isNotBlank(searchForm.getGiftName())) {
            criteria.andGiftNameEqualTo(searchForm.getGiftName());
        }
        if (searchForm.getGiftValue() != null) {
            criteria.andGiftValueEqualTo(searchForm.getGiftValue());
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("example", giftExample);
        int start = (searchForm.getPageNum() - 1) * searchForm.getPageSize();
        map.put("pageStart", start);
        map.put("pageLimit", searchForm.getPageSize());
        List<Gift> gifts = giftMapper.selectByExample2(map);
        Integer total = giftMapper.selectCount(giftExample);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("list", gifts);
        hashMap.put("total", total);
        return hashMap;
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
        Gift gift = new Gift();
        gift.setId(giftForm.getId());
        gift.setGiftName(giftForm.getGiftName());
        gift.setGiftValue(giftForm.getGiftValue());
        gift.setGiftImage(giftForm.getGiftImage());
        gift.setGiftOrder(giftForm.getGiftOrder());
        int i = giftMapper.updateByPrimaryKeySelective(gift);
        return i > 0;
    }

    public boolean delete(GiftForm giftForm) {
        int i = giftMapper.deleteByPrimaryKey(giftForm.getId());
        return i > 0;
    }
}
