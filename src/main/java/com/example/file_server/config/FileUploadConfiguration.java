package com.example.file_server.config;

import com.example.file_server.utils.FileUploadUtil;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class FileUploadConfiguration {

    @Value("${fenda.file_upload_path}")
    private String file_upload_path;
    @Value("${fenda.file_upload_location}")
    private String file_upload_location;

    private Path fileRootPath;

    public String getFile_upload_path() {
        return file_upload_path;
    }

    public String getFile_upload_location() {
        return file_upload_location;
    }

    public Path getFileRootPath() {
        return fileRootPath;
    }

    @PostConstruct
    public void init() {
        try {
            fileRootPath = FileUploadUtil.createPathIfNotExist(file_upload_location);
        } catch (IOException e) {
            e.printStackTrace();
            fileRootPath = Paths.get("");
        }
    }
}
