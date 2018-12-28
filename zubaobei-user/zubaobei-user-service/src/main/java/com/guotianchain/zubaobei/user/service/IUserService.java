package com.guotianchain.zubaobei.user.service;

import com.github.pagehelper.PageInfo;
import com.guotianchain.zubaobei.user.dto.UserDto;
import com.guotianchain.zubaobei.user.dto.UserSearchDto;
import com.guotianchain.zubaobei.user.model.User;

import java.util.List;

/**
 *
 * @author qiulongxing
 * @since 2018-12-13
 */
public interface IUserService {

    /**
     * 查询用户
     * @param uid
     * @return
     */
    User findByUID(String uid);

    /**
     * 查询用户
     * @param uid
     * @return
     */
    UserDto findByUserId(String uid);

    /**
     * 分页查询用户数据
     * @param page
     * @param pageSize
     * @return
     */
    List<UserDto> findByPage(int page, int pageSize);


    /**
     * 新建用户
     * @param uid 用户ID
     * @param mobile 手机号
     * @param name 用户名
     * @return
     */
    UserDto addUser(String uid, String mobile, String name);

    /**
     * 用户启动/禁用
     *
     * @param uid 用户ID
     * @param status 状态：0:启用 1:禁用
     * @return
     */
    UserDto reSetStatus(String uid, int status);

    /**
     * @Title 更新用户
     * @param userDto
     * @return
     */
    UserDto updateUser(UserDto userDto);

    /**
     * @Title 修改密码
     * @param uid 用户ID
     * @param password 密码明文
     * @return
     */
    int resetPassword(String uid, String password);

    /**
     * @Title 修改用户昵称
     * @param uid 用户ID
     * @param name 用户昵称
     * @return
     */
    UserDto resetName(String uid, String name);

    /**
     * @Title 根据UID删除用户
     * @param uid
     * @return
     */
    boolean deleteByUID(String uid);

    /**
     * @title 分页查询，返回分页封装对象
     * @param dto 用户查询DTO
     * @return
     */
    PageInfo<User> queryByPage(UserSearchDto dto);

}
