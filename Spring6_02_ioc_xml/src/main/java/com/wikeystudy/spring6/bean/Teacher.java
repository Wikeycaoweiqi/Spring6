package com.wikeystudy.spring6.bean;

/**
 * @ Author：Wikey Cao
 * @ Date：25-10-2024
 * @ Description：
 */
public class Teacher {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}