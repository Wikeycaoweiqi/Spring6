package com.wikeystudy.spring6.bean.service;

import com.wikeystudy.spring6.bean.dao.OrderDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
@Service(value = "myOrderService")
public class OrderServiceImpl implements OrderService {

    @Resource(name = "myOrderDao")
    private OrderDao orderDao;

    @Override
    public void add() {
        System.out.println("service add...");
        orderDao.add();
    }
}