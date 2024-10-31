package com.wikeystudy.spring6.bean.service;

import com.wikeystudy.spring6.bean.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserDao userDao;

    private UserDao userDao;
    @Autowired
    @Qualifier(value = "userDaoImpl")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

//    private UserDao userDao;
//    @Autowired
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void add() {
        System.out.println("service add...");
        userDao.add();
    }
}