package com.example.asus.myapplication;

/**
 * Created by 冯玉苗 on 2017/7/6.
 */

public class Student {
    private String name;
    private String content;

    public Student(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
