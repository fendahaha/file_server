package com.example.file_server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FendaConfiguration {

    @Value("${fenda.file_upload_path}")
    private String file_upload_path;
    @Value("${fenda.file_upload_location}")
    private String file_upload_location;

    public String getFile_upload_path() {
        return file_upload_path;
    }

    public String getFile_upload_location() {
        return file_upload_location;
    }
}
