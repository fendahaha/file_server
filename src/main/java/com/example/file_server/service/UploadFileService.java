package com.example.file_server.service;

import com.example.file_server.entity.UploadFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public interface UploadFileService {

    public List<UploadFile> list();

    HashMap<String, Object> upload(MultipartFile[] files) throws IOException;

    int deleteByUniqueNames(String[] file_unique_names);

}
