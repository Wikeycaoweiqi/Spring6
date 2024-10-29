package com.wikeystudy.spring6.service;

import com.wikeystudy.spring6.dao.UserDao;

/**
 * @ Author：Wikey Cao
 * @ Date：29-10-2024
 * @ Description：
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void run() {
        System.out.println("UserService running...");
        userDao.run();
    }
}