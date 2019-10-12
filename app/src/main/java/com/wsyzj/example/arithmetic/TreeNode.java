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

    /**
     * 前序排序查找节点 (根左右)
     *
     * @param i
     * @return
     */
    public TreeNode frontSearch(int i) {
        TreeNode treeNode = null;
        // 当自己的值知否匹配
        if (value == i) {
            return this;
        } else {
            // 找左边的节点，可能是空，也可能有值
            if (leftTreeNode != null) {
                treeNode = leftTreeNode.frontSearch(i);
            }
            // 不为空，说明有值了
            if (treeNode != null) {
                return treeNode;
            }
            // 找右边的节点
            if (rightTreeNode != null) {
                treeNode = rightTreeNode.frontSearch(i);
            }
        }
        return treeNode;
    }

    /**
     * 中序排序查找节点 (左根右)
     *
     * @param i
     * @return
     */
    public TreeNode middleSearch(int i) {
        TreeNode treeNode = null;
        if (leftTreeNode.value == i) {
            return leftTreeNode;
        } else {
            if (this.value == i) {
                return this;
            }
            if (rightTreeNode != null) {
                treeNode = rightTreeNode.frontSearch(i);
            }
        }
        return treeNode;
    }

    /**
     * 后序排序查找节点 (左右根)
     *
     * @param i
     * @return
     */
    public TreeNode afterSearch(int i) {
        TreeNode treeNode = null;
        if (leftTreeNode.value == i) {
            return leftTreeNode;
        } else {
            if (rightTreeNode != null) {
                treeNode = rightTreeNode.frontSearch(i);
            }
            if (rightTreeNode != null) {
                return rightTreeNode;
            }
            if (this.value == i) {
                return this;
            }
        }
        return treeNode;
    }

    /**
     * 删除指定的节点
     *
     * @param i
     */
    public void delete(int i) {
        TreeNode parent = this;
        // 查看左右的节点
        if (parent.leftTreeNode != null && parent.leftTreeNode.value == i) {
            parent.leftTreeNode = null;
            return;
        }
        // 查看右边的节点
        if (parent.rightTreeNode != null && parent.rightTreeNode.value == i) {
            parent.rightTreeNode = null;
            return;
        }

        // 递归检查并删除左儿子
        parent = leftTreeNode;
        if (parent != null) {
            parent.delete(i);
        }

        // 递归检查并删除右儿子
        parent = rightTreeNode;
        if (parent != null) {
            parent.delete(i);
        }
    }
}
