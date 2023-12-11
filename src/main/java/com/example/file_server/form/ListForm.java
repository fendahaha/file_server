package com.example.file_server.form;

import jakarta.validation.constraints.Min;

public class ListForm {
    @Min(1)
    private int pageNum = 1;
    @Min(1)
    private int pageSize = 10;

    public ListForm() {
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
}
