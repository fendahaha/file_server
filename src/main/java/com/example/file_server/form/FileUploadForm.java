package com.example.file_server.form;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadForm {
    private String category;
    private String tags;
    private MultipartFile[] file;

    public FileUploadForm() {
    }

    public String getCategory() {
        return category;
    }

    public String getTags() {
        return tags;
    }

    public MultipartFile[] getFile() {
        return file;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setFile(MultipartFile[] file) {
        this.file = file;
    }
}

