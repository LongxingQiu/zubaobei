package com.guotianchain.zubaobei.user.controller;

import com.guotianchain.zubaobei.user.dto.UserInfoDto;
import com.guotianchain.zubaobei.user.service.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceClient userServiceFeign;

    @RequestMapping(value = "/api/user/userinfo/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserInfoDto findById(@PathVariable("userId") String userId) {
        return userServiceFeign.findById(userId);
    }
}
