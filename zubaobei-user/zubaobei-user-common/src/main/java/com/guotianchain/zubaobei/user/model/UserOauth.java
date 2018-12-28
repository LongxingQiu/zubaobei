package com.guotianchain.zubaobei.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户第三方授权信息实体类
 */
public class UserOauth implements Serializable{

    /**
     * ID
     */
    private String uoid;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 第三方平台类型 1:微信 2:支付宝
     */
    private int type;

    /**
     * 第三方应用的唯一标识
     */
    private String openId;

    /**
     * 访问Token
     */
    private String accessToken;

    /**
     * 创建时间
     */
    private Date createAt;

    public String getUoid() {
        return uoid;
    }

    public void setUoid(String uoid) {
        this.uoid = uoid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
