package com.wikeystudy.spring6.bean;
import com.wikeystudy.spring6.dao.UserDao;

/**
 * @ Author：Wikey Cao
 * @ Date：25-10-2024
 * @ Description：
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("UserDaoImpl...run...");
    }
}