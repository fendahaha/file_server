package com.example.file_server.mapper;

import com.example.file_server.entity.GiftSendRecord;
import com.example.file_server.entity.GiftSendRecordExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftSendRecordMapper {
    long countByExample(GiftSendRecordExample example);

    int deleteByExample(GiftSendRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GiftSendRecord record);

    int insertSelective(GiftSendRecord record);

    List<GiftSendRecord> selectByExample(GiftSendRecordExample example);
    List<GiftSendRecord> selectByExample2(HashMap<String,Object> map);
    int selectCount(GiftSendRecordExample example);

    GiftSendRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GiftSendRecord record, @Param("example") GiftSendRecordExample example);

    int updateByExample(@Param("record") GiftSendRecord record, @Param("example") GiftSendRecordExample example);

    int updateByPrimaryKeySelective(GiftSendRecord record);

    int updateByPrimaryKey(GiftSendRecord record);
}