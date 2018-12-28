package com.guotianchain.zubaobei.user.dto;

import java.util.Date;

/**
 * 用户DTO
 */
public class UserDto {

    /**
     * 用户ID，系统唯一
     */
    private String uid;

    /**
     * 昵称
     */
    private String name;

    /**
     * 头像信息
     */
    private String avatar;

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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
}
