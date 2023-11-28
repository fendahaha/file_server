package com.example.file_server.mapper;

import com.example.file_server.entity.SrsStreams;
import com.example.file_server.entity.SrsStreamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrsStreamsMapper {
    long countByExample(SrsStreamsExample example);

    int deleteByExample(SrsStreamsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SrsStreams record);

    int insertSelective(SrsStreams record);

    List<SrsStreams> selectByExample(SrsStreamsExample example);

    SrsStreams selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SrsStreams record, @Param("example") SrsStreamsExample example);

    int updateByExample(@Param("record") SrsStreams record, @Param("example") SrsStreamsExample example);

    int updateByPrimaryKeySelective(SrsStreams record);

    int updateByPrimaryKey(SrsStreams record);
}