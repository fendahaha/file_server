package com.example.file_server.entity;

import java.util.Date;

public class UploadFile {
    private Integer id;

    private String fileUniqueName;

    private String fileOriginalName;

    private Long fileSize;

    private String fileType;

    private String filePath;

    private String fileTags;

    private String fileCategory;

    private Date fileUploadDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileUniqueName() {
        return fileUniqueName;
    }

    public void setFileUniqueName(String fileUniqueName) {
        this.fileUniqueName = fileUniqueName;
    }

    public String getFileOriginalName() {
        return fileOriginalName;
    }

    public void setFileOriginalName(String fileOriginalName) {
        this.fileOriginalName = fileOriginalName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileTags() {
        return fileTags;
    }

    public void setFileTags(String fileTags) {
        this.fileTags = fileTags;
    }

    public String getFileCategory() {
        return fileCategory;
    }

    public void setFileCategory(String fileCategory) {
        this.fileCategory = fileCategory;
    }

    public Date getFileUploadDate() {
        return fileUploadDate;
    }

    public void setFileUploadDate(Date fileUploadDate) {
        this.fileUploadDate = fileUploadDate;
    }
}