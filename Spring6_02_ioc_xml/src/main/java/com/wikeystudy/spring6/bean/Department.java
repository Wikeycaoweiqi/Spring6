package com.wikeystudy.spring6.bean;

import java.util.List;

/**
 * @ Author：Wikey Cao
 * @ Date：25-10-2024
 * @ Description：
 */
public class Department {
    private List<Employee> employeeList;
    private String name;

    public void info() {
        System.out.println("部门名称：" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employeeList=" + employeeList +
                ", name='" + name + '\'' +
                '}';
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

}