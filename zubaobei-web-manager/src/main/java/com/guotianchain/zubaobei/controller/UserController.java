package com.guotianchain.zubaobei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 用户管理页面
     * @return
     */
    @RequestMapping("/userList")
    public String userList(){
        return "/pages/user/userList";
    }

}


