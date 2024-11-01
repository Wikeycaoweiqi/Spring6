package com.wikeystudy.spring6;

import org.springframework.stereotype.Repository;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
@Repository
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println(result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        System.out.println(result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        System.out.println(result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        System.out.println(result);
        return result;
    }
}