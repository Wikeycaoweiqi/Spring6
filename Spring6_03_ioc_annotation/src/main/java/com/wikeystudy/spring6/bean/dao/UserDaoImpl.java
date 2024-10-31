package com.wikeystudy.spring6.bean.dao;

import com.wikeystudy.spring6.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao add...");
    }
}