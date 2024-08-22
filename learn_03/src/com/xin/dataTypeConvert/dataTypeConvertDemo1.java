package com.xin.dataTypeConvert;

/**
 * @description: 数据类型转换
 * @create: 2018-09-07 21:06
 **/
public class dataTypeConvertDemo1 {
    public static void main(String[] args) {

        byte num = 10;
        test1(num); // 10

        int count = 100;
        test2( (byte) count); // 100

        // 强制类型转换可能会操造成数据丢失的问题,例如将超出byte范围的数据转为int类型会转为负数
        int count2 = 200;
        test2((byte) count2); // -56

        // 使用强制类型转换double/float浮点数类型时,会默认将小数移除
        double height = 1.80;
        test1((int) height); // 1
    }

    // 自动类型转换: 小范围的数据类型可以传给大范围的数据类型
    public static void test1(int num) {
        System.out.println(num);
    }

    // 强制类型转换: 大范围的数据类型如果想传给小范围的数据类型之前,必须要进行强制类型转换,否则会报错
    public static void test2(byte num) {
        System.out.println(num);
    }
}
