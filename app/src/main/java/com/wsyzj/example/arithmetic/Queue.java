package com.wsyzj.example.arithmetic;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/04
 *     desc   : 队列
 *     version: 1.0
 * </pre>
 */
public class Queue {

    private int[] elements;

    public Queue() {
        elements = new int[0];
    }

    /**
     * 入列
     *
     * @param element
     */
    public void push(int element) {
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[newArray.length - 1] = element;
        elements = newArray;
    }

    /**
     * 出列
     *
     * @return
     */
    public int poll() {
        if (elements.length == 0) {
            throw new RuntimeException("queue is empty");
        }
        int element = elements[0];
        int[] newArray = new int[elements.length - 1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i + 1];
        }
        elements = newArray;
        return element;
    }

    /**
     * 是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
