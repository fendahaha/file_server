package com.example.file_server.form;

import java.util.List;

public class FileDeleteForm {
    private List<String> fileUniqueNames;
    private List<String> fileTags;
    private List<String> fileCategorys;

    public FileDeleteForm() {
    }

    public List<String> getFileUniqueNames() {
        return fileUniqueNames;
    }

    public void setFileUniqueNames(List<String> fileUniqueNames) {
        this.fileUniqueNames = fileUniqueNames;
    }

    public List<String> getFileTags() {
        return fileTags;
    }

    public void setFileTags(List<String> fileTags) {
        this.fileTags = fileTags;
    }

    public List<String> getFileCategorys() {
        return fileCategorys;
    }

    public void setFileCategorys(List<String> fileCategorys) {
        this.fileCategorys = fileCategorys;
    }
}
