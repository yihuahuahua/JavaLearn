package com.yihua.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //创建一个扫面器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接收：");

        //判断用户有没有输入字符串
        if(scanner.hasNextLine()){
            //使用next方式接收
            String str = scanner.nextLine();
            System.out.println("输入内容为："+str);
        }

        scanner.close();
    }
}
