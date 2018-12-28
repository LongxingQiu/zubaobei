package com.guotianchain.zubaobei.common.page;

import java.io.Serializable;

/**
 * @title 基本分页查询参数类
 * @author qiulongxing
 */
public class BaseQuery implements Serializable{
    /**
     * 页码
     */
    private int page;

    /**
     * 页面大小
     */
    private int limit;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
