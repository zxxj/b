package com.xin.method;

/**
 * @description: 学习无返回值方法中的return
 * @create: 2018-09-07 21:06
 **/

public class MethodDemo3 {
    public static void main(String[] args) {

        count(10, 1);
    }

    // return可以提前结束方法
    public static void count(int num1, int num2) {
        if(num1 == 0 || num2 == 0) {
            System.out.println("参数不能为0");
            return;
        }

        System.out.println(num1 / num2);
    }
}
