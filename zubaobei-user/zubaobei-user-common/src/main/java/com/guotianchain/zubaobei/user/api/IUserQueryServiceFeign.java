package com.guotianchain.zubaobei.user.api;

import com.guotianchain.zubaobei.common.page.MyPageInfo;
import com.guotianchain.zubaobei.user.dto.UserDto;
import com.guotianchain.zubaobei.user.dto.UserSearchDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * RPC Feign接口声明
 */
@RequestMapping("/user")
public interface IUserQueryServiceFeign {

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    MyPageInfo<UserDto> searchUser(@RequestBody UserSearchDto dto);
}
