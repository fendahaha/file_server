package com.example.file_server.mapper;

import com.example.file_server.entity.SrsSessions;
import com.example.file_server.entity.SrsSessionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrsSessionsMapper {
    long countByExample(SrsSessionsExample example);

    int deleteByExample(SrsSessionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SrsSessions record);

    int insertSelective(SrsSessions record);

    List<SrsSessions> selectByExample(SrsSessionsExample example);

    SrsSessions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SrsSessions record, @Param("example") SrsSessionsExample example);

    int updateByExample(@Param("record") SrsSessions record, @Param("example") SrsSessionsExample example);

    int updateByPrimaryKeySelective(SrsSessions record);

    int updateByPrimaryKey(SrsSessions record);
}