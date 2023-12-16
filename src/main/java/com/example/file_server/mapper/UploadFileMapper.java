package com.example.file_server.mapper;

import com.example.file_server.entity.Anchor;
import com.example.file_server.entity.UploadFile;
import com.example.file_server.entity.UploadFileExample;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UploadFileMapper {
    long countByExample(UploadFileExample example);

    int deleteByExample(UploadFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadFile record);

    int insertSelective(UploadFile record);

    List<UploadFile> selectByExample(UploadFileExample example);

    List<UploadFile> selectByExample2(HashMap<String, Object> map);

    UploadFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    int updateByExample(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    int updateByPrimaryKeySelective(UploadFile record);

    int updateByPrimaryKey(UploadFile record);
}