package com.example.file_server.service;

import com.example.file_server.entity.UploadFile;
import com.example.file_server.entity.UploadFileExample;
import com.example.file_server.form.UploadFileForm;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public interface UploadFileService {

    public List<UploadFile> list();

    public HashMap<String, Object> upload(UploadFileForm uploadFileForm);

    public int delete_auto(HashMap<String, Object> map);
}

