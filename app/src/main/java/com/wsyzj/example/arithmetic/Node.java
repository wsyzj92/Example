package com.wsyzj.example.arithmetic;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/05
 *     desc   : 单链表
 *     version: 1.0
 * </pre>
 */
public class Node {

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node append(Node node) {
        Node currentNode = this;
        while (true) {
            Node nextNode = next();
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = node;
        return this;
    }

    // 获取下一个节点
    public Node next() {
        return next;
    }

    // 获取节点中的数据
    public int getData() {
        return data;
    }

    // 下一个节点是否为空
    public boolean isLast() {
        return next == null;
    }
}
