package com.yihua.oop.classDemo03;

public class Application {
    // 静态和非静态区别很大
    // 静态 方法调用和类型有关
    // 非静态 可重写

    // 重写：需要有继承关系，子类重写父类的方法！
    /*
    * 1、方法类必须相同
    * 2、参数列表列表必须相同
    * 3、修饰符：范围可以扩大不能缩小
    * 4、抛出的异常：范围可以被缩小、不能扩大
    */
    public static void main(String[] args) {
        A a = new A();
        a.test();
        a.stest();
        //父类的引用指向了子类（但自己还是父类）
        B b = new A();
        b.test();
        b.stest();
    }
}
