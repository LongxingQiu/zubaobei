package com.guotianchain.zubaobei.user.api;

import com.github.pagehelper.PageInfo;
import com.guotianchain.zubaobei.common.page.MyPageInfo;
import com.guotianchain.zubaobei.user.dto.UserDto;
import com.guotianchain.zubaobei.user.dto.UserSearchDto;
import com.guotianchain.zubaobei.user.model.User;
import com.guotianchain.zubaobei.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @title 用户查询服务（Feign RPC）实现类
 *
 */
@RestController
public class UserQueryServiceFeign implements IUserQueryServiceFeign{

    @Autowired
    private IUserService userService;

    @Override
    public MyPageInfo<UserDto> searchUser(@RequestBody UserSearchDto dto) {
        MyPageInfo<UserDto> myPageInfo = new MyPageInfo<>();
        PageInfo<User> info = userService.queryByPage(dto);
        int count = (int)info.getTotal();
        myPageInfo.setCount(count);
        List<User> list = info.getList();
        for(User user: list){
            UserDto userDto = new UserDto();
            userDto.setUid(user.getUid());
            userDto.setName(user.getName());
            userDto.setMobile(user.getMobile());
            userDto.setStatus(user.getStatus());
            userDto.setCreateTime(user.getCreateTime());
            myPageInfo.getData().add(userDto);
        }

        return myPageInfo;
    }
}
