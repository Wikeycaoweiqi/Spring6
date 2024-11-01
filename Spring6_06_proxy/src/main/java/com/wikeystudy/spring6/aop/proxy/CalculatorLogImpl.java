package com.wikeystudy.spring6.aop.proxy;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
public class CalculatorLogImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        System.out.println("[LOG] add method invoke...");
        int result = i + j;
        System.out.println(result);
        System.out.println("[LOG] add method finished...");
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("[LOG] div method invoke...");
        int result = i / j;
        System.out.println(result);
        System.out.println("[LOG] div method finished...");
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("[LOG] mul method invoke...");
        int result = i * j;
        System.out.println(result);
        System.out.println("[LOG] mul method finished...");
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("[LOG] sub method invoke...");
        int result = i - j;
        System.out.println(result);
        System.out.println("[LOG] sub method finished...");
        return result;
    }
}