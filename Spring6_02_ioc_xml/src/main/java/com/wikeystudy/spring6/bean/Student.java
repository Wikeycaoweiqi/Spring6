package com.wikeystudy.spring6.bean;

import java.util.Map;

/**
 * @ Author：Wikey Cao
 * @ Date：25-10-2024
 * @ Description：
 */
public class Student {
    private String id;
    private String name;
    private Map<String, Teacher> teacherMap;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", teacherMap=" + teacherMap +
                '}';
    }

    public String getId() {
        return id;
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

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }
}