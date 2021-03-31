package com.yihua.method;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        while (true) {
            calculate();
        }
    }
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        String opt = "aaa";
        System.out.println("请输入第一个数字：");
        if(scanner.hasNextDouble())
            a = scanner.nextDouble();
        System.out.println("请输入第二个数字：");
        if(scanner.hasNextDouble())
            b = scanner.nextDouble();
        System.out.println("请输入运算符（+、-、*、/）：");
        if(scanner.hasNext())
            opt = scanner.next();

        switch (opt){
            case "+":
                System.out.println((a+b));
                break;
            case "-":
                System.out.println((a-b));
                break;
            case "*":
                System.out.println((a*b));
                break;
            case "/":
                System.out.println((a/b));
                break;
            default:
                System.out.println("发生错误，请检查");
                break;
        }

        System.out.println("运算完成，开始下一场运算\n");
    }
}
