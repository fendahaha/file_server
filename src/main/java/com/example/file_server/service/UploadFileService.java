package com.example.file_server.service;

import com.example.file_server.entity.UploadFile;
import com.example.file_server.form.UploadFileForm;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public interface UploadFileService {

    public List<UploadFile> list();

    HashMap<String, Object> upload(UploadFileForm uploadFileForm) throws IOException;

    int deleteByUniqueNames(String[] file_unique_names);

}
