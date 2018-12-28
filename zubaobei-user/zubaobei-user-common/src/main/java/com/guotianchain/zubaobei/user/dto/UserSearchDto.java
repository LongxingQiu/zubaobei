package com.guotianchain.zubaobei.user.dto;

import com.guotianchain.zubaobei.common.page.BaseQuery;

import java.io.Serializable;

/**
 * @title 用户查询DTO
 * @author qiulongxing
 */
public class UserSearchDto extends BaseQuery {

    private String uid;

    private String mobile;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
