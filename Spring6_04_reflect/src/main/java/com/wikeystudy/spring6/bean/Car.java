package com.wikeystudy.spring6.bean;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
public class Car {
    private String brand;
    private int age;
    private String color;

    public Car() {
    }

    private Car(String brand, int age, String color) {
        this.brand = brand;
        this.age = age;
        this.color = color;
    }

    private void run() {
        System.out.println("Car is running...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}