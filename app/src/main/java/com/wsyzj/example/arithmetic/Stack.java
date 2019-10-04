package com.wsyzj.example.arithmetic;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/04
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class Stack {

    private int[] elements;

    public Stack() {
        elements = new int[0];
    }

    /**
     * 入栈
     *
     * @param element
     */
    public void push(int element) {
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[elements.length - 1] = element;
        elements = newArray;
    }

    /**
     * 出栈
     */
    public int pop() {
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        int element = elements[elements.length - 1];
        int[] newArray = new int[elements.length - 1];
        // 除最后一个元素外都放到第一个元素
        for (int i = 0; i < elements.length - 1; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
        return element;
    }

    /**
     * 查看栈顶元素
     *
     * @return
     */
    public int peek() {
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length - 1];
    }

    /**
     * 栈是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
