package com.guotianchain.zubaobei.user.api;


import com.guotianchain.zubaobei.user.dto.UserDto;
import com.guotianchain.zubaobei.user.dto.UserInfoDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RPC Feign接口声明
 */
@RequestMapping("/users")
public interface IUserServiceFeign {

    /**
     * 获取用户列表信息
     * @param page 页码，选填项，默认0
     * @param pageSize 每页的记录数，选填项，默认10
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    List<UserDto> findUserByPage(@RequestParam(name = "page",required=false,defaultValue="1")Integer page, @RequestParam(name = "page_size",required=false,defaultValue="10") Integer pageSize);

    /**
     * 获取用户信息
     * @param uid 用户ID
     * @return
     */
    @RequestMapping(value = "/{uid}",method = RequestMethod.GET)
    UserDto findById(@PathVariable(value = "uid")String uid);

    /**
     * 删除用户
     * @param uid 用户ID
     * @return
     */
    @RequestMapping(value = "/{uid}",method = RequestMethod.DELETE)
    boolean deleteByUID(@PathVariable(value = "uid")String uid);

    /**
     * 获取用户详情信息
     * @param uid 用户ID
     * @return
     */
    @RequestMapping(value = "/{uid}/infos",method = RequestMethod.GET)
    UserInfoDto findInfoById(@PathVariable(value = "uid")String uid);

    /**
     * 新添用户
     * @param mobile 手机号码
     * @param name 用户名
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    UserDto addUser(@RequestParam(name = "mobile",required=true)String mobile, @RequestParam(name = "name",required=true)String name);


    /**
     * @Title 修改用户信息
     *
     * @param uid 用户ID
     * @param user 用户属性
     * @return
     */
    @RequestMapping(value = "/{uid}",method = RequestMethod.PUT)
    UserDto updateUserByUID(@PathVariable(value = "uid")String uid,@RequestBody UserDto user);

    /**
     * @Title 启用/禁用用户
     *
     * @param uid 用户ID
     * @param status 用户状态 状态：0:启用 1:禁用
     * @return
     */
    @RequestMapping(value = "/{uid}/status",method = RequestMethod.PUT)
    UserDto resetUserStatus(@PathVariable(value = "uid")String uid,@RequestParam(name = "status")Integer status);

    /**
     * @Title 修改用户密码
     *
     * @param uid 用户ID
     * @param password 用户密码
     * @return
     */
    @RequestMapping(value = "/{uid}/password",method = RequestMethod.PUT)
    boolean resetUserPassword(@PathVariable(value = "uid")String uid,@RequestParam(name = "password")String password);

    /**
     * @Title 修改用户昵称
     *
     * @param uid 用户ID
     * @param name 用户昵称
     * @return
     */
    @RequestMapping(value = "/{uid}/name",method = RequestMethod.PUT)
    UserDto resetUserName(@PathVariable(value = "uid")String uid,@RequestParam(name = "name")String name);

}
