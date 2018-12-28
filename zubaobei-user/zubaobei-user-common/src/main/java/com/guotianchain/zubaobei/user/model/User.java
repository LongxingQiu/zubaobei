package com.guotianchain.zubaobei.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 */
public class User implements Serializable {

    /**
     * 用户ID，系统唯一
     */
    private String uid;

    /**
     * 昵称
     */
    private String name;


    /**
     * 登录密码
     */
    private String password;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态：0:启用 1:禁用
     */
    private int status;

    /**
     * 注册时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
