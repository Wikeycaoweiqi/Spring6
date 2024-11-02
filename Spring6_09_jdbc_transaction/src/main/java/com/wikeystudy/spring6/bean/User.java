package com.wikeystudy.spring6.bean;

/**
 * @ Author：Wikey Cao
 * @ Date：02-11-2024
 * @ Description：
 */
public class User {
    private int userId;
    private String username;
    private int balance;

    // 无参构造函数
    public User() {
    }

    // 全参构造函数
    public User(int userId, String username, int balance) {
        this.userId = userId;
        this.username = username;
        this.balance = balance;
    }

    // Getter和Setter方法
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // toString方法
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}