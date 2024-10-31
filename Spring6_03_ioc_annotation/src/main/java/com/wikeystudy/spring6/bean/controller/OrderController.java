package com.wikeystudy.spring6.bean.controller;

import com.wikeystudy.spring6.bean.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
@Controller(value = "orderController")
public class OrderController {

    @Resource(name = "myOrderService")
    private OrderService orderService;

    public void add() {
        System.out.println("controller add...");
        orderService.add();
    }
}