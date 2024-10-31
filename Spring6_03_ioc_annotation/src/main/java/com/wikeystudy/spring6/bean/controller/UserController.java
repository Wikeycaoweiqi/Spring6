package com.wikeystudy.spring6.bean.controller;

import com.wikeystudy.spring6.bean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
@Controller(value = "userController")
public class UserController {

//    @Autowired
//    private UserService userService;

    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

//    private UserService userService;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    public void add() {
        System.out.println("controller add...");
        userService.add();
    }
}