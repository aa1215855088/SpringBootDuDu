package com.hnguigu.demo.domain;

import java.io.Serializable;

/**
 * @program: demo
 * @description: ${description}
 * @author: 徐子楼
 * @create: 2018-09-02 16:22
 **/
public class User implements Serializable {

    private static final long serialVersionUID = 4947146717177847663L;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
