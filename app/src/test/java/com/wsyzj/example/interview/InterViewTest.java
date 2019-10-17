package com.wsyzj.example.interview;

import com.wsyzj.example.arithmetic.ArrayBinaryTree;

import org.junit.Test;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/17
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class InterViewTest {

    @Test
    public void test1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(array);
        arrayBinaryTree.fontSearch(2);
    }
}
