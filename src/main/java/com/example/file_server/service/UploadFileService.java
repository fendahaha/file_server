package com.example.file_server.service;

import com.example.file_server.entity.UploadFile;
import com.example.file_server.form.FileDeleteForm;
import com.example.file_server.form.FileListForm;
import com.example.file_server.form.FileSearchForm;
import com.example.file_server.form.FileUploadForm;

import java.util.HashMap;
import java.util.List;

public interface UploadFileService {

    public HashMap<String, Object> list(FileListForm fileListForm);

    public HashMap<String, Object> upload(FileUploadForm fileUploadForm);

    public int delete_auto(FileDeleteForm fileDeleteForm);

    public  List<UploadFile> query(FileSearchForm form);
}

