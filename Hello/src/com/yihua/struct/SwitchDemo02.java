package com.yihua.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "一花";

        switch (name){
            case "二花":
                System.out.println("二花");
                break;
            case "一花":
                System.out.println("一花");
                break;
            default:
                System.out.println("未知呀");
        }
    }
}
