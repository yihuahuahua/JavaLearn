package com.yihua.method;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(testNum(1, 3, 2, 34,123, 123));

    }

    public static int testNum(int... i){
        return i.length;
    }

}
