package com.wsyzj.example.arithmetic;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/17
 *     desc   : 顺序二叉树的遍历
 *            其实顺序二叉树可以把他看作是一个顺序的数组
 *            根节点和他左节点的关系 index * 2 + 1 （返回都是下标）
 *            根节点和他有节点的关系 index * 2 + 2
 *            左节点和他根节点的关系 (index - 1) / 2
 *            右节点和他根节点的关系 (index - 1) / 2
 *     version: 1.0
 * </pre>
 */
public class ArrayBinaryTree {

    public int data[];

    public ArrayBinaryTree(int data[]) {
        this.data = data;
    }

    /**
     * 前序排序 根左右a
     */
    public void fontSearch() {
        fontSearch(0);
    }

    /**
     * 从指定的索引前序排序 根左右
     *
     * @param index
     */
    public void fontSearch(int index) {
        if (data == null || data.length == 0) {
            return;
        }

        // 先打印自己
        System.out.println(data[index]);

        // 查找左节点
        if ((index * 2 + 1) < data.length) {
            fontSearch(index * 2 + 1);
        }

        // 查找右节点
        if ((index * 2 + 2) < data.length) {
            fontSearch(index * 2 + 2);
        }
    }
}
