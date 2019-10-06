package com.wsyzj.example.arithmetic;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/06
 *     desc   : 单链表 每个节点都会保存下一个节点
 *     version: 1.0
 * </pre>
 */
public class Node {

    // 数据
    public int data;
    // 下一个节点
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    /**
     * 获取数据
     *
     * @return
     */
    public int getData() {
        return data;
    }

    /**
     * 向链表中最后一个位置的节点追加新的节点
     *
     * @return
     */
    public Node append(Node node) {
        Node currentNode = this;
        // 一直找下一个节点，如果找不到说明是最后一个节点了,如果找到继续找，
        while (true) {
            Node nextNode = currentNode.next;
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = node;
        return this;
    }

    /**
     * 删除下一个节点
     * 其实就是把下下一个节点赋值给了当前节点
     * 1 2 3 变为 1 3
     */
    public void removeNext() {
        Node nextNext = next.next;
        this.next = nextNext;
    }

    /**
     * 插入一个节点作为当前节点的下一个节点
     * 1 2 3 讲 4 插入到 2 之后 变为 1 2 4 3
     */
    public void after(Node node) {
        // 下下一个节点为 next 也就是 3
        Node nextNext = next;
        // 将下一个节点改为需要插入的 也就是 2
        next = node;
        // 把下下一个节点作为需要插入node的next
        node.next = nextNext;
    }

    /**
     * 打印链表中的数据
     */
    public void show() {
        Node currentNode = this;
        while (true) {
            System.out.print(currentNode.data + " ");
            if (currentNode.next == null) {
                break;
            }
            currentNode = currentNode.next;
        }
    }

    /**
     * 是否为链表中的最后一个
     *
     * @return
     */
    public boolean isLast() {
        return next == null;
    }
}
