package com.hnguigu.demo.web.controller;

import com.hnguiug.demo.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-09-02 16:13
 **/
@Controller
public class
LoginController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> login(User user, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        if (user.getPassword().equals("123") && user.getUsername().equals("123")) {
            session.setAttribute("user", user);
            map.put("result", "1");
        } else {
            map.put("result", "0");
        }
        return map;
    }

    @RequestMapping(value = "loginOut")
    public String loginOut(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/tologin";
    }
}
