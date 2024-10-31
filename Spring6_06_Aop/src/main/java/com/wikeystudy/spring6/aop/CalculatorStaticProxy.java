package com.wikeystudy.spring6.aop;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
public class CalculatorStaticProxy implements Calculator {

    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("[LOG] add method invoke...");
        int addResult = calculator.add(i, j);
        System.out.println("[LOG] add method finished...");
        return addResult;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }
}