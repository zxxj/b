package com.xin.scanner;

// 1.导包
import java.util.Scanner;

/**
 * @description: 学习scanner扫描器
 * @create: 2018-09-07 21:06
 **/
public class Dmeo {

    public static void main(String[] args) {

        // 需求: 接受用户键盘输入的数据,并在控制台打印出来

        // 2.创建代码扫描器对象
        Scanner sc = new Scanner(System.in);

        // 3.调用next方法获取用户输入的数据
        System.out.println("请输入您的姓名:");
        String userName = sc.next();

        System.out.println("您的姓名是:" + userName);

        System.out.println("请输入您的年龄:");

        String age = sc.next();
        System.out.println("您的年龄是:" + age);

    }
}
