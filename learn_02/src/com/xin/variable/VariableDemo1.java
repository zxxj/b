package com.xin.variable;

/**
 * @description: 变量
 * @author: xin
 * @date: 2019-09-03 11:05
 */
public class VariableDemo1 {
    public static void main(String[] args) {
        printVariable();
    }

    public static void printVariable() {
        // 1.定义变量: 数据类型 变量名称 = 变量值;
        int age = 18;
        System.out.println(age);

        // 2.定义一个小数变量,来保存成绩
        double score = 99.9;

        // 3.为什么要用变量来记录数据呢? 可以提高处理数据的灵活性和维护性
        int number = 19;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        // 4.变量的特点: 变量中的数据是可以被替换的
        int num1 = 10;
        num1 = 20;
        System.out.println(num1); // 20
        num1 = num1 + 10;
        System.out.println(num1); // 30

        // 5.需求: 钱包里目前有9.9元,花出去了5元,又收到了3元,请实时输出钱包金额
        double money = 9.9;
        System.out.println(money);
        money = money - 5;
        System.out.println(money);
        money = money + 3;
        System.out.println(money);
    }
}
