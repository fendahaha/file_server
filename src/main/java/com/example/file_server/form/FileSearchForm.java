package com.example.file_server.form;

import jakarta.validation.constraints.Pattern;

import static jakarta.validation.constraints.Pattern.Flag;

public class FileSearchForm {
    @Pattern(regexp = "^.+$", flags = {Flag.CASE_INSENSITIVE})
    private String fileUniqueName;

    @Pattern(regexp = "^.+$", flags = {Flag.CASE_INSENSITIVE})
    private String fileType;

    @Pattern(regexp = "^.+$", flags = {Flag.CASE_INSENSITIVE})
    private String filePath;

    @Pattern(regexp = "^.+$", flags = {Flag.CASE_INSENSITIVE})
    private String fileTags;

    @Pattern(regexp = "^.+$", flags = {Flag.CASE_INSENSITIVE})
    private String fileCategory;

    public FileSearchForm() {
    }

    public String getFileUniqueName() {
        return fileUniqueName;
    }

    public void setFileUniqueName(String fileUniqueName) {
        this.fileUniqueName = fileUniqueName;
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
}
