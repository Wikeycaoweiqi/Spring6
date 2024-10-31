package com.wikeystudy.spring6.bean.dao;

import org.springframework.stereotype.Repository;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
@Repository(value = "myOrderDao")
public class OrderDaoImpl implements OrderDao {
    @Override
    public void add() {
        System.out.println("dao add...");
    }
}