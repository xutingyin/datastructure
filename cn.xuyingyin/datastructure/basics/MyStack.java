package datastructure.basics;

/**
 * 栈的基本功能 ： stack 是一种LIFO(Last In First Out)的特殊线性表结构。 只允许在一端进行入栈、出栈操作。 这里未考虑扩容的情况
 */
public class MyStack {

    // 数组存储元素
    private Object[] array;

    // 栈容量
    private int size;

    // 栈顶
    private int top;

    /**
     * 默认构造函数，构造一个容量为50的栈
     */
    public MyStack() {
        this.size = 50;
        this.array = new Object[size];
        this.top = -1;
    }

    /**
     * 根据传入参数，构造一个指定容量的栈
     * 
     * @param size
     */
    public MyStack(int size) {
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
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push("acc");
        System.out.println(stack.peek());
        stack.printLine();
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }

}
