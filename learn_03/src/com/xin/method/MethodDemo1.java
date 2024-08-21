package com.xin.method;

/**
 * @description: 学习有参方法和无惨方法
 * @create: 2018-09-07 21:06
 **/

public class MethodDemo1 {
    public static void main(String[] args) {
        int result = sum(10,20);
        System.out.println(result);

        printHello();
    }

    // 1.有返回值: 计算传入的两个数的和并返回
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // 2.无返回值
    public static void printHello() {
        System.out.println("hello");
    }
}
