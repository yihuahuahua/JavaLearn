package com.yihua.base;

public class Demo1 {
    // 类变量
    static int a = 523;
    // 实例变量
    int b;
    char c;
    public static void main(String[] args) {
        // 局部变量
        int d = 123;
        System.out.println(d);

        // 实例变量
        Demo1 demo1 = new Demo1();
        demo1.b = 223;
        System.out.println(demo1.b);

        //类变量
        System.out.println(a);
    }
}
