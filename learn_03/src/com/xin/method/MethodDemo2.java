package com.xin.method;
/**
 * @description: 学习方法重载
 * @create: 2018-09-07 21:06
 **/
public class MethodDemo2 {
    public static void main(String[] args) {
    fire(10);
    fire(10,20);
    fire(10.20,3.14,"洛杉矶");
    }

    // 使用方法重载实现发射导弹的需求
    // 1.一个位置
    public static void fire(int num) {
        System.out.println(num);
    }

    // 2.两个位置
    public static void fire(int num1, int num2) {
        System.out.println(num1 + "" + num2);
    }

    // 3.精准位置
    public static void fire(double num1, double num2, String location) {
        System.out.println(num1 + "" + num2 + "" + location);
    }
}
