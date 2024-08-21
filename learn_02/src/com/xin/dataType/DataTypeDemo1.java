package com.xin.dataType;

public class DataTypeDemo1 {
    public static void main(String[] args) {

        printDataType();
    }

    public static void printDataType() {

        byte b = 10;
        short age = 18;
        int number = 100;
        // 虽然使用的是long类型声明的变量,但他默认的数据类型是int,之所以没报错是因为1000并没有超过int类型的最大值
        long count = 1000;
        // 超过了int类型的最大值,必须显示的声明为long类型
        long count2 = 4423432432432L;

        float f = 3.14f;

        double d = 3.14;

        char c = 'a';

        boolean isFlag = false;
        boolean isLogin = true;

        String str = "hello";
        System.out.println(str);
    }
}
