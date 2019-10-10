package com.wsyzj.example.arithmetic;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/10
 *     desc   : 递归：斐波那契数列
 *     version: 1.0
 * </pre>
 */
public class Fibonacci {

    private static final String TAG = Fibonacci.class.getSimpleName();

    /**
     * 斐波那契数列 排列规则
     * 1 1 2 3 5 8 13 21
     *
     * @param index 表示需要获取第 index 位置的数 从1开始
     * @return
     */
    public static int fibonacci(int index, String s) {
        if (index == 1 || index == 2) {
            return 1;
        } else {
            return fibonacci(index - 1, "   aaa  ") + fibonacci(index - 2, "   bbb  ");
        }
    }
}
