package com.example.file_server.mapper;

import com.example.file_server.entity.RoomStatus;
import com.example.file_server.entity.RoomStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomStatusMapper {
    long countByExample(RoomStatusExample example);

    int deleteByExample(RoomStatusExample example);

    int insert(RoomStatus record);

    int insertSelective(RoomStatus record);

    List<RoomStatus> selectByExample(RoomStatusExample example);

    int updateByExampleSelective(@Param("record") RoomStatus record, @Param("example") RoomStatusExample example);

    int updateByExample(@Param("record") RoomStatus record, @Param("example") RoomStatusExample example);
}