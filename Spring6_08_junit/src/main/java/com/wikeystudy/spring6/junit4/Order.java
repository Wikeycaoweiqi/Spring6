package com.wikeystudy.spring6.junit4;

import org.springframework.stereotype.Component;

/**
 * @ Author：Wikey Cao
 * @ Date：01-11-2024
 * @ Description：
 */
@Component
public class Order {
    public void add() {
        System.out.println("Order add...");
    }
}