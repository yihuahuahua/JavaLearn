package com.yihua.operator;

// 三元运算符
public class Demo2 {
    public static void main(String[] args) {
        /*  x ? y : z
            如果x == true 则 y ,否则 z
         */
        int score = 80;
        String type = score >= 60 ?"及格":"不及格";
        System.out.println(type);
    }
}
