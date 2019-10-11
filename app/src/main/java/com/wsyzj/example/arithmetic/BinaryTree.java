package com.wsyzj.example.arithmetic;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/11
 *     desc   : 二叉树顺序结构
 *     version: 1.0
 * </pre>
 */
public class BinaryTree {

    public static void main(String[] args) {
        // 创建一颗二叉树，
        BinaryTree binaryTree = new BinaryTree();
        // 给二叉树添加一个根节点
        TreeNode rootNode = new TreeNode(1);
        binaryTree.setRoot(rootNode);
        // 给根节点添加左2右3两个节点
        TreeNode leftTreeNode = new TreeNode(2);
        TreeNode rightTreeNode = new TreeNode(3);
        rootNode.setLeftTreeNode(leftTreeNode);
        rootNode.setRightTreeNode(rightTreeNode);
        // 给节点2添加 4 5 两个子节点
        TreeNode leftNode4 = new TreeNode(4);
        TreeNode rightNode5 = new TreeNode(5);
        leftTreeNode.setLeftTreeNode(leftNode4);
        leftTreeNode.setRightTreeNode(rightNode5);
        // 给节点3添加 6 7 两个子节点
        TreeNode leftNode6 = new TreeNode(6);
        TreeNode rightNode7 = new TreeNode(7);
        rightTreeNode.setLeftTreeNode(leftNode6);
        rightTreeNode.setRightTreeNode(rightNode7);
        // 前序排序
        binaryTree.frontShow();
        // 中序排序
        binaryTree.middleShow();
        // 后序排序
        binaryTree.afterShow();
    }

    // 前序排序
    private void frontShow() {
        root.frontShow();
    }

    // 中序排序
    private void middleShow() {
        root.middleShow();
    }

    // 中序排序
    private void afterShow() {
        root.afterShow();
    }

    private TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }
}
