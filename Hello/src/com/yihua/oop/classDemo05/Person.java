package com.yihua.oop.classDemo05;

public class Person {
    // 1
    static {
        //静态代码块
        System.out.println("静态代码块");
    }
    // 2
    {
        //代码块
        System.out.println("匿名代码块");
    }
    // 3
    public Person() {
        System.out.println("构造方法");
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("==============================");
        Person person2 = new Person();
    }
}
