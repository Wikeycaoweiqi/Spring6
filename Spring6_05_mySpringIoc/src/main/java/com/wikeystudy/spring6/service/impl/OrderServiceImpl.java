package com.wikeystudy.spring6.service.impl;

import com.wikeystudy.spring6.annotation.Bean;
import com.wikeystudy.spring6.annotation.Di;
import com.wikeystudy.spring6.dao.OrderDao;
import com.wikeystudy.spring6.service.OrderService;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
@Bean
public class OrderServiceImpl implements OrderService {

    @Di
    private OrderDao orderDao;

    @Override
    public void add() {
        System.out.println("service add...");
        orderDao.add();
    }
}