package com.example.file_server.form;

import java.util.Date;

public class FileQueryForm {
    private int pageNum = 1;
    private int pageSize = 10;
    private Date date;

    public FileQueryForm() {
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
