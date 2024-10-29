package com.wikeystudy.spring6.controller;

import com.wikeystudy.spring6.service.UserService;

/**
 * @ Author：Wikey Cao
 * @ Date：29-10-2024
 * @ Description：
 */
public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void run() {
        System.out.println("UserController running...");
        userService.run();
    }
}