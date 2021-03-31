package com.yihua.oop.classDemo06;

// abstract 抽象类：类 extends：单继承~ （接口可以多继承）
public abstract class Action {

    // 约束~有人帮我们实现~
    // abstract，抽象方法，只有方法名字，没有方法的实现！
    public abstract void doSomething();

    // 1. 不能 new 这个抽象类
}
