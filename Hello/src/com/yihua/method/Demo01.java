package com.yihua.method;

public class Demo01 {
    // main方法
    public static void main(String[] args) {
        int sum = add(1, 2);
        System.out.println(sum);
        double sum2 = add(1.1, 1.2);
        System.out.println(sum2);
    }

    // 加法
    public static int add(int a, int b){
        return a+b;
    }
    // 方法重载
    public static double add(double a, double b){
        return a + b;
    }
}
