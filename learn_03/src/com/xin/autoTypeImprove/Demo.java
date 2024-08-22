package com.xin.autoTypeImprove;

/**
 * @description: 自动类型提升
 * @create: 2018-09-07 21:06
 **/
public class Demo {
    public static void main(String[] args) {

        byte num1 = 10;
        byte num2 = 20;
        int result = test(num1, num2);
        System.out.println(result);

        char c = 'a';
        int sum = 100;
        long length = 30;
        long result2 = test2(num1, num2, c, sum, length);
        System.out.println(result2);
    }

    // 小范围的类型会自动转换成大范围的类型进行运算
    // 规则:
    //  byte short chart 会自动转 int 类型
    //  long float 会自动转为 double 类型
    public static int test(byte num1, byte num2) {
        return num1 + num2; // 两个byte类型的数据进行运算会自动提升为int类型 所以方法的返回值类型就是int类型
    }

    public static long test2(byte num1, short num2, char c, int num3, long num4) {
        // 方法的最终返回类型是由形参列表中最大的数据类型而决定的,比如目前最大类型就是long,所以返回值类型就是long
        return num1 + num2 + num3 + num4;
    }
}
