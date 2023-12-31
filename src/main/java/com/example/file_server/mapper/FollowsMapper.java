package com.example.file_server.mapper;

import com.example.file_server.entity.Follows;
import com.example.file_server.entity.FollowsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowsMapper {
    long countByExample(FollowsExample example);

    int deleteByExample(FollowsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Follows record);

    int insertSelective(Follows record);

    List<Follows> selectByExample(FollowsExample example);

    Follows selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Follows record, @Param("example") FollowsExample example);

    int updateByExample(@Param("record") Follows record, @Param("example") FollowsExample example);

    int updateByPrimaryKeySelective(Follows record);

    int updateByPrimaryKey(Follows record);
}