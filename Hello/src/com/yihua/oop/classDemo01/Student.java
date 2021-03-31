package com.yihua.oop.classDemo01;

public class Student {

    // 属性：字段
    private String name;
    private int age;
    private char sex;

    public Student(){

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    // 方法
    public void study(){
        System.out.println(this.name+"在学习");
    }
}
