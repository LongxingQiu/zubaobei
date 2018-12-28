package com.guotianchain.zubaobei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /**
     * 后台主页
     * @return
     */
    @RequestMapping("/home")
    public String userList(){
        return "/home";
    }

    /**
     * 控制台页面
     * @return
     */
    @RequestMapping("/console")
    public String console(){
        return "/console";
    }

}


