package com.guotianchain.zubaobei.web.controller;

import com.guotianchain.zubaobei.common.page.MyPageInfo;
import com.guotianchain.zubaobei.user.dto.UserDto;
import com.guotianchain.zubaobei.user.dto.UserSearchDto;
import com.guotianchain.zubaobei.web.client.UserQueryServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserQueryServiceClient userQueryFeign;

    @RequestMapping(value = "/userList.do", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public MyPageInfo<UserDto> userList(@RequestParam(name = "page",required=false,defaultValue="1")Integer page, @RequestParam(name = "limit",required=false,defaultValue="10") Integer limit,
                                        @RequestParam(name = "uid",required=false) String uid, @RequestParam(name = "mobile",required=false) String mobile) {
        UserSearchDto dto = new UserSearchDto();
        dto.setPage(page);
        dto.setLimit(limit);
        dto.setUid(uid);
        dto.setMobile(mobile);

        return userQueryFeign.searchUser(dto);
    }
}
