package com.guotianchain.zubaobei.common.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @title 查询结果类
 * @param <T>
 * @author qiulongxing
 */
public class MyPageInfo<T> implements Serializable {

    /**
     *
     */
    private int code;

    /**
     * 信息提示
     */
    private String msg;

    /**
     * 总记录数
     */
    private int count;

    /**
     * 数据集合
     */
    private List<T> data;

    public MyPageInfo() {
        this.code = 0;
        this.count = 0;
        this.data = new ArrayList<T>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
