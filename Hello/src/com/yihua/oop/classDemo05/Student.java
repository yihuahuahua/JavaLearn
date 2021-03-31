package com.yihua.oop.classDemo05;

public class Student {
    private static int age; //静态的变量 多线程！
    private double score;   //非静态变量

    public void run(){
        System.out.println("runrunrun");
    }
    public static void go(){
        System.out.println("gogogo");
    }
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(Student.age);

        System.out.println(s1.age);
        System.out.println(s1.score);

        go();
        s1.run();
    }
}
