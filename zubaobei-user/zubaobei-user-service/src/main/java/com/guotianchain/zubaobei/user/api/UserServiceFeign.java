package com.guotianchain.zubaobei.user.api;

import com.guotianchain.zubaobei.common.twitter.Snowflake;
import com.guotianchain.zubaobei.user.dto.UserDto;
import com.guotianchain.zubaobei.user.dto.UserInfoDto;
import com.guotianchain.zubaobei.user.model.User;
import com.guotianchain.zubaobei.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserServiceFeign implements IUserServiceFeign {

    @Autowired
    private IUserService userService;

    @Override
    public List<UserDto> findUserByPage(@RequestParam(name = "page",required=false,defaultValue="1")Integer page, @RequestParam(name = "page_size",required=false,defaultValue="10") Integer pageSize) {
        List<UserDto> list = new ArrayList<>();
        list = userService.findByPage(page,pageSize);
        return list;
    }

    @Override
    public UserDto findById(@PathVariable(value = "uid")String uid) {
        UserDto userDto = userService.findByUserId(uid);
        return userDto;
    }

    @Override
    public boolean deleteByUID(@PathVariable(value = "uid")String uid) {
        return userService.deleteByUID(uid);
    }

    @Override
    public UserInfoDto findInfoById(@PathVariable(value = "uid")String uid) {
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setUid(uid);
        userInfoDto.setName("zubaobei.guotianchain.com");
        return userInfoDto;
    }

    @Override
    public UserDto addUser(String mobile, String name) {
        Snowflake idWorker = new Snowflake(0, 0);
        String uid  = String.valueOf(idWorker.nextId());
        return userService.addUser(uid, mobile, name);
    }

    @Override
    public UserDto updateUserByUID(@PathVariable(value = "uid")String uid,@RequestBody UserDto user) {
        user.setUid(uid);
        return userService.updateUser(user);
    }

    @Override
    public UserDto resetUserStatus(@PathVariable(value = "uid")String uid, @RequestParam(name = "status")Integer status) {
        //System.out.println("uid="+uid+" status="+status);

        return userService.reSetStatus(uid, status);
    }

    @Override
    public boolean resetUserPassword(@PathVariable(value = "uid")String uid,@RequestParam(name = "password")String password) {
        int result = userService.resetPassword(uid, password);
        if (result == 1){
            return true;
        }
        return false;
    }

    @Override
    public UserDto resetUserName(@PathVariable(value = "uid")String uid,@RequestParam(name = "name")String name) {

        return userService.resetName(uid,name);
    }


}
