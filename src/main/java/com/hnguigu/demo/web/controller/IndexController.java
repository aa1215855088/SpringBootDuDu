package com.hnguigu.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: demo
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-09-02 16:49
 **/
@Controller
public class IndexController {

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
