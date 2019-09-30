package com.wsyzj.example.arithmetic;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/09/24
 *     desc   : 算法
 *     version: 1.0
 * </pre>
 */
public class Arithmetic {

    /**
     * 冒泡排序(从小到大)
     * 比较相邻两个数的大小，如果 array[j] > array[j + 1] 说明后面的数字小，就替换位置
     *
     * @param array 需要排序的数组
     * @return 排序后的数组
     */
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 选择排序
     * 循环第一层，初始化最小元素的索引 min
     * 循环第二层，使用 array[min] 的元素和其他每个元素对比，如果 array[min] > array[j] 说明后面的数字小，则更新 min 元素的位置
     * 第二层循序结束后，判断 min 的位置是否发生了变化，如果发现变化将 min 和 i 索引下的值进行替换
     *
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array) {
        int min, temp;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            if (min != i) {
                temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }

    /**
     * 插入排序
     * 在第二层循环中比较 j前面的元素，如果 array[j-1] > array[j] 就将这两个元素交换，并且继续内层的循环
     *
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 快速排序
     * 让一个数字作为标准元素，分别从数组中0的位置和length-1的位置左右起点循环
     * 在循环的过程中，讲小于标准数的放在左边，讲大于标准数的放在右边 按照这个方法一直循环下去，直到排序完成
     */
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            // 将数组中的第0个数作为标准元素
            int temp = array[start];
            // 激素需要排序的下标
            int low = start;
            int high = end;

            while (low < high) {
                // 右边的数字比标准数大
                while (low < high && array[high] >= temp) {
                    high--;
                }
                // 比标准数小的，从右边替换到左边
                array[low] = array[high];
                while (low < high && array[low] <= temp) {
                    low++;
                }
                // 比标准数大的，从左右替换到右边
                array[high] = array[low];
            }
            // 把标准数赋值给所在位置的元素，low或者high都可以，因为他两是一样的
            array[low] = temp;
            quickSort(array, start, low);
            quickSort(array, low + 1, end);
        }
    }

    /**
     * 希尔排序
     *
     * @param array {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
     * @return
     */
    public static int[] shellSort(int[] array) {
        // 遍历所有的步长 假如数组长度为10 d 为别为 5 2 1 总执行三次
        // d = 4
        // d = 2
        // d = 1
        for (int d = array.length / 2; d > 0; d /= 2) {
            // 遍历所有的元素
            // 假设 d = 5 (i = 5,6,7,8,9)
            // 假设 d = 2 (i = 2,3,4,5,6,7,8,9)
            // 假设 d = 1 (i = 1,2,3,4,5,6,7,8,9)
            for (int i = d; i < array.length; i++) {
                // 遍历本组中的所有元素
                for (int j = i - d; j >= 0; j -= d) {
                    // d = 5; i = 5; j = 0; j + d = 5; j -= d = 0;
                    // d = 5; i = 6; j = 1; j + d = 7; j -= d = 0;
                    if (array[j] > array[j + d]) {
                        int temp = array[j];
                        array[j] = array[j + d];
                        array[j + d] = temp;
                    }
                }
            }
        }
        return array;
    }
}
