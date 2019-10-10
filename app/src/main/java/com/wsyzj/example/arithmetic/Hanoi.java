package com.wsyzj.example.arithmetic;

import android.util.Log;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/10
 *     desc   : 递归：汉诺塔
 *     version: 1.0
 * </pre>
 */
public class Hanoi {

    private static final String TAG = Hanoi.class.getSimpleName();

    /**
     * @param n    一共有多少个盘子
     * @param from 开始的柱子
     * @param in   中间的柱子
     * @param to   目标的柱子
     */
    public void hanoi(int n, char from, char in, char to) {
        if (n == 1) {
            Log.e(TAG, "移动第1个盘子从" + from + "移动到" + to);
        } else {
            // 无论有多少盘子都可以认为是只有最低下的盘子和上面的盘子
            // 移动第一个盘子上面所有的盘子到中间的位置
            hanoi(n - 1, from, to, in);
            Log.e(TAG, "移动第" + n + "个盘子从" + from + "移动到" + to);
            // 把上面所有的盘子从目标位置移动到中间位置
            hanoi(n - 1, in, from, to);
        }
    }
}
