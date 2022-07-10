package com.software.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前端控制器 :首页
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String gotoIndex(){
        //return "pages/login.html";
        //return "pages/productresultpage1.html";
        return "index.html";
    }
    @RequestMapping(value = "/1")
    public String gotoUserMutual(){
        //return "pages/login.html";
        return "pages/productresultpage2.html";
        //return "pages/userMutual.html";
    }
}