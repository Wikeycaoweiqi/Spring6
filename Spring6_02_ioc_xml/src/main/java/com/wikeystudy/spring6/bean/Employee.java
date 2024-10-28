package com.wikeystudy.spring6.bean;

import java.util.Arrays;

/**
 * @ Author：Wikey Cao
 * @ Date：25-10-2024
 * @ Description：
 */
public class Employee {
    private String name;
    private Integer age;
    private Department department;
    private String[] hobbies;

    public void work() {
        System.out.println(name + "Employee work..." + age);
        department.info();
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }
}