package com.wikeystudy.spring6.controller;

import com.wikeystudy.spring6.annotation.Bean;
import com.wikeystudy.spring6.annotation.Di;
import com.wikeystudy.spring6.service.OrderService;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
@Bean
public class OrderController {

    @Di
    private OrderService orderService;

    public void add() {
        System.out.println("controller add...");
        orderService.add();
    }
}