package com.example.file_server.mapper;

import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.AnchorExample;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AnchorMapper {
    long countByExample(AnchorExample example);

    int deleteByExample(AnchorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Anchor record);

    int insertSelective(Anchor record);

    List<Anchor> selectByExampleWithBLOBs(AnchorExample example);

    List<Anchor> selectByExample(AnchorExample example);

    Anchor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Anchor record, @Param("example") AnchorExample example);

    int updateByExampleWithBLOBs(@Param("record") Anchor record, @Param("example") AnchorExample example);

    int updateByExample(@Param("record") Anchor record, @Param("example") AnchorExample example);

    int updateByPrimaryKeySelective(Anchor record);

    int updateByPrimaryKeyWithBLOBs(Anchor record);

    int updateByPrimaryKey(Anchor record);

    List<Anchor> selectByExample3(HashMap<String, Object> map);

    int selectCountByExample3(HashMap<String, Object> map);
}