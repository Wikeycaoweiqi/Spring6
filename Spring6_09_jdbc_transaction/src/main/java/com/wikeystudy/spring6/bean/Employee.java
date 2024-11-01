package com.wikeystudy.spring6.bean;

/**
 * @ Author：Wikey Cao
 * @ Date：01-11-2024
 * @ Description：
 */
public class Employee {
    private int id;
    private String name;
    private Integer age;
    private String sex;

    // 无参构造函数
    public Employee() {
    }

    // 全参构造函数
    public Employee(int id, String name, Integer age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // Getter和Setter方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // toString方法
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}