package com.yihua.array;

public class Demo02 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};

        for (int array : arrays) {
            System.out.println(array);
        }
        System.out.println();
        System.out.println();
        printArray(arrays);
    }

    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]+"");
        }
    }
}
