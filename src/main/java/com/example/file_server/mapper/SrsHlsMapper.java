package com.example.file_server.mapper;

import com.example.file_server.entity.SrsHls;
import com.example.file_server.entity.SrsHlsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrsHlsMapper {
    long countByExample(SrsHlsExample example);

    int deleteByExample(SrsHlsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SrsHls record);

    int insertSelective(SrsHls record);

    List<SrsHls> selectByExample(SrsHlsExample example);

    SrsHls selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SrsHls record, @Param("example") SrsHlsExample example);

    int updateByExample(@Param("record") SrsHls record, @Param("example") SrsHlsExample example);

    int updateByPrimaryKeySelective(SrsHls record);

    int updateByPrimaryKey(SrsHls record);
}