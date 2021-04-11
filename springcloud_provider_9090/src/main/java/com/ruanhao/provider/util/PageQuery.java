package com.ruanhao.provider.util;
import java.io.Serializable;
public class PageQuery implements Serializable {
    private static final long serialVersionUID = 4516681976816833806L;
    private Integer pageNum;
    private Integer pageSize;
    public Integer getPageNum() {
        if (null == pageNum || pageNum < 1) {
            return this.pageNum = 1; } else {
            return this.pageNum;
        }
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    public Integer getPageSize() {
        if (null == pageSize || pageSize < 1) {
            return this.pageSize = 20; } else {
            return this.pageSize;
        }
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}