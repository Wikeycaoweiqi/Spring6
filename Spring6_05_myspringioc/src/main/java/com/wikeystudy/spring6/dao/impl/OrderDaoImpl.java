package com.wikeystudy.spring6.dao.impl;

import com.wikeystudy.spring6.annotation.Bean;
import com.wikeystudy.spring6.dao.OrderDao;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
@Bean
public class OrderDaoImpl implements OrderDao {
    @Override
    public void add() {
        System.out.println("dao add...");
    }
}