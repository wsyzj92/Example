package com.wsyzj.example.arithmetic;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/09
 *     desc   : 双向循环列表
 *     version: 1.0
 * </pre>
 */
public class DoubleNode {

    public int data;
    public DoubleNode pre = this;
    public DoubleNode next = this;

    public DoubleNode(int data) {
        this.data = data;
    }

    /**
     * 在当前节点后追加节点
     * 假设现在有 1 2 两个节点，在 1 后面添加 3
     *
     * @param node
     */
    public void after(DoubleNode node) {
        // 先把 1 的下一个节点 2 节点拿出来，作为新节点 3 的下一个
        DoubleNode nextNext = this.next;
        // 1 的下一个节点就变为 3
        this.next = node;
        // 新节点 3 的上一个就变为 1
        node.pre = this;
        // 新节点的下一个 就为 第一步拿出来的 2
        node.next = nextNext;
        // 并且 2 节点的上一个应该为新节点 3
        nextNext.pre = node;
    }

    public DoubleNode getPre() {
        return this.pre;
    }

    public DoubleNode getNext() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }
}
