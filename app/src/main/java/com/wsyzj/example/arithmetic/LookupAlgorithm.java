package com.wsyzj.example.arithmetic;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/04
 *     desc   : 查找算法
 *     version: 1.0
 * </pre>
 */
public class LookupAlgorithm {

    /**
     * 线性查找
     * target 于数组0的位置到 array.length - 1 的数字分别比较，找出相等元素的下标
     *
     * @param array
     * @param target
     */
    public static int linearSearch(int[] array, int target) {
        if (array == null) {
            throw new NullPointerException("Array cannot be empty");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 二分查找 [0,1,2,3,4,5,6,7,8,9]
     * 首先找到数组中间的数组于 target 进行比较，如果等于就返回。数组必须为有序的
     * 如果小于 target 就在左边的数组中重新取中间的数组查找
     * 如果等于 target 就返回下边
     * 如果小于 target 就在右边的数组中重新取中间的数组查找
     *
     * @return
     */
    public int binarySearch(int[] array, int target) {
        if (array == null) {
            throw new NullPointerException("Array cannot be empty");
        }

        int start = 0;
        int end = array.length - 1;
        int middle = array.length / 2;

        if (target < array[0] || target > array[end]) {
            return -1;
        }

        while (true) {
            // 等于就返回
            if (array[middle] == target) {
                return middle;
            }

            // 中间的数大于target就在左重新查找
            if (array[middle] > target) {
                end = middle - 1;
                middle = (start + end) / 2;
            }

            if (array[middle] < target) {
                start = middle + 1;
                middle = (start + end) / 2;
            }
        }
    }
}
