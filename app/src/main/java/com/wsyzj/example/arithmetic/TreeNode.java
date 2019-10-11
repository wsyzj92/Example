package com.wsyzj.example.arithmetic;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/11
 *     desc   : 二叉树的节点
 *     version: 1.0
 * </pre>
 */
public class TreeNode {

    // 节点的权zx
    public int value;
    // 左边的节点
    public TreeNode leftTreeNode;
    // 右边的节点
    public TreeNode rightTreeNode;

    public TreeNode(int value) {
        this.value = value;
    }

    /**
     * 设置左边的节点
     *
     * @param leftTreeNode
     */
    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    /**
     * 设置右边的节点
     *
     * @param rightTreeNode
     */
    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

    /**
     * 前序排序（根左右）
     */
    public void frontShow() {
        System.out.print(value);
        if (leftTreeNode != null) {
            leftTreeNode.frontShow();
        }
        if (rightTreeNode != null) {
            rightTreeNode.frontShow();
        }
    }

    /**
     * 中序排序 (左根右)
     */
    public void middleShow() {
        if (leftTreeNode != null) {
            leftTreeNode.middleShow();
        }
        System.out.print(value);
        if (rightTreeNode != null) {
            rightTreeNode.middleShow();
        }
    }

    /**
     * 后序排序 (左右根)
     */
    public void afterShow() {
        if (leftTreeNode != null) {
            leftTreeNode.afterShow();
        }
        if (rightTreeNode != null) {
            rightTreeNode.afterShow();
        }
        System.out.print(value);
    }
}
