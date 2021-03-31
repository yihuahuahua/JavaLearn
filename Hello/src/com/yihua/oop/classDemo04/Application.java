package com.yihua.oop.classDemo04;

import java.time.temporal.TemporalAccessor;

public class Application {

    public static void main(String[] args) {
        /*
        * 多态注意事项：
        * 1. 多态是方法的多态，属性没有多态
        * 2. 父类和子类，有联系 类型转换异常
        * */
        // 一个对象的实际类型是确定的
        // new Student();
        // new Person();

        // 可指向的引用类型就不确定了：父类的引用指向子类

        // Student 能调用的方法都是自己或者继承父类的！
        Student s1 = new Student();
        // Person 父类型，可以指向子类，但是不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();

        // 对象能执行哪些方法，主要是看对象左边的类型，和右边关系不大！
        ((Student) s2).eat();
        //s2.eat();
        s1.eat();

        System.out.println(s3 instanceof Student);
        System.out.println(s3 instanceof Person);
        System.out.println(s3 instanceof Object);
    }
}
