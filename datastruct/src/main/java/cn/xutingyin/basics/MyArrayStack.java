package cn.xutingyin.basics;

import java.util.Stack;

/**
 * @description: 栈的基本功能 ： 栈是一种只能从表的一端存取数据且遵循 "先进后出" 原则的线性存储结构。 只允许在一端进行入栈、出栈操作。 栈的实现方式有两种：一种是数组的实现、另一种是链表的实现
 * @author: Tingyin.Xu
 * @date: 2020/4/9 14:00
 */

public class MyArrayStack {

    // 数组存储元素
    private Object[] array;

    // 栈容量
    private int size;

    // 栈顶
    private int top;

    /**
     * 默认构造函数，构造一个容量为50的栈
     */
    public MyArrayStack() {
        this.size = 50;
        this.array = new Object[size];
        this.top = -1;
    }

    /**
     * 根据传入参数，构造一个指定容量的栈
     * 
     * @param size
     */
    public MyArrayStack(int size) {
        this.array = new Object[size];
        this.size = size;
        this.top = -1;
    }

    /**
     * 增加元素
     * 
     * @param value
     */
    public void push(Object value) {
        if (top < size - 1) {// 栈还未满
            // 这里为什么是 ++top 而不是top ++
            array[++top] = value;
        }
    }

    /**
     * 删除元素
     * 
     * @return
     */

    public Object pop() {
        return array[top--];
    }

    /**
     * 访问栈顶元素
     * 
     * @return
     */
    public Object peek() {
        return array[top];
    }

    /**
     * 判断栈是否为空
     * 
     * @return
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * 判断栈是否已满
     * 
     * @return
     */
    public boolean isFull() {
        return (top == size - 1);
    }

    public void printLine() {
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push("acc");
        System.out.println(stack.peek());
        stack.printLine();
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        stack.printLine();
        Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

}
