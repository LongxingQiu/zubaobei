package com.guotianchain.zubaobei.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guotianchain.zubaobei.common.page.MyPageInfo;
import com.guotianchain.zubaobei.user.dao.UserMapper;
import com.guotianchain.zubaobei.user.dto.UserDto;
import com.guotianchain.zubaobei.user.dto.UserSearchDto;
import com.guotianchain.zubaobei.user.model.User;
import com.guotianchain.zubaobei.user.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUID(String uid) {
        return userMapper.selectUserByUID(uid);
    }

    @Override
    public UserDto findByUserId(String userId) {
        User user = this.findByUID(userId);
        if(user!=null){
            UserDto userDto = new UserDto();
            userDto.setUid(user.getUid());
            userDto.setName(user.getName());
            userDto.setMobile(user.getMobile());
            userDto.setStatus(user.getStatus());
            userDto.setCreateTime(user.getCreateTime());
            return userDto;
        }
        return null;
    }

    @Override
    public List<UserDto> findByPage(int page, int pageSize) {
        List<UserDto> dtoList = new ArrayList<>();
        //使用分页插件,核心代码就这一行
        PageHelper.startPage(page, pageSize);
        List<User> list = userMapper.selectAll();
        if(!list.isEmpty()){
            for (User user: list){
                UserDto userDto = new UserDto();
                userDto.setUid(user.getUid());
                userDto.setName(user.getName());
                userDto.setMobile(user.getMobile());
                userDto.setStatus(user.getStatus());
                userDto.setCreateTime(user.getCreateTime());
                dtoList.add(userDto);
            }
        }
        return dtoList;
    }

    @Override
    public UserDto addUser(String uid, String mobile, String name) {
        User user = new User();
        user.setUid(uid);
        user.setName(name);
        user.setMobile(mobile);
        user.setStatus(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        int result = userMapper.addUser(user);
        if (result == 1){
            return this.findByUserId(uid);
        }
        return null;
    }

    @Override
    public UserDto reSetStatus(String uid, int status) {
        int result =  userMapper.updateUserStatus(uid, status);
        if (result == 1){
            return this.findByUserId(uid);
        }
        return null;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        User user = new User();
        user.setUid(userDto.getUid());
        user.setName(userDto.getName());
        user.setStatus(userDto.getStatus());
        user.setUpdateTime(new Date());
        int result = userMapper.updateUser(user);
        if (result == 1){
            return this.findByUserId(user.getUid());
        }
        return null;
    }

    @Override
    public int resetPassword(String uid, String password) {
        String enCodePassword = password;//加密方式

        return userMapper.updateUserPassword(uid, password);
    }

    @Override
    public UserDto resetName(String uid, String name) {
        int result = userMapper.updateUserName(uid, name);
        if (result == 1){
            return this.findByUserId(uid);
        }
        return null;
    }

    @Override
    public boolean deleteByUID(String uid) {
        int result = userMapper.deleteUserByUID(uid);
        if(result ==1){
            return true;
        }
        return false;
    }

    @Override
    public PageInfo<User> queryByPage(UserSearchDto dto) {

        //使用分页插件,核心代码就这一行
        PageHelper.startPage(dto.getPage(), dto.getLimit());
        List<User> list = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(list);

        return pageInfo;
    }


}
