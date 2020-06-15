package datastructure.basics;

/**
 * @description:单向链表的实现-CRUD
 * @author: Tingyin.Xu
 * @date: 2020/4/7 9:34
 */

public class MySingleLinkedList<T> {
    /**
     * 单向链表的特点： 1、数据域 2、指针域 3、无固定的物理存储顺序 4、无需指定初始化内存大小
     */
    // 头结点
    private Node head;

    private int size;

    MySingleLinkedList() {
        head = new Node();
        size = 0;
    }

    /**
     * 返回链表的实际容量
     *
     * @return
     */
    public int size() {
        return size;
    }

    public void printLine() {
        System.out.println("------------------------------------------");
    }

    /**
     * 遍历链表中的所有元素
     */
    public void display() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.data != null) {
                System.out.println(currentNode.data);
            }
            currentNode = currentNode.next;
        }
    }

    /**
     * 尾插法，插入元素
     *
     * @param e
     */
    public void addLast(T e) {
        Node<T> newNode = new Node<T>(e);
        if (head == null) {
            // 没有头结点，则新结点为头结点
            head = newNode;
            return;
        }
        Node last = head;
        // 遍历找到尾结点
        while (last.next != null) {
            last = last.next;
        }
        // 尾结点插入新的结点
        last.next = newNode;
        size++;

    }

    /**
     * 头插法，插入元素
     *
     * @param e 添加元素
     */
    public void addFirst(T e) {
        Node<T> newNode = new Node<T>(e);
        if (head == null) {
            head = newNode;
            size++;
            return;
        } else {
            // 头结点的直接后继为新结点
            newNode.next = head;
            // 新节点变为头结点
            head = newNode;
            size++;
        }

    }

    private static class Node<T> {
        /**
         * 数据域
         */
        private T data;
        /**
         * 下一个节点
         */

        private Node next;

        public Node() {
        }

        ;

        public Node(T data) {
            this.data = data;
            this.next = null;

        }

        /*------------------getter -setter----------------d */
        public Object getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setFirst(Node next) {
            this.next = next;
        }

        public static void main(String[] args) {
            MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
            mySingleLinkedList.addFirst(1);
            mySingleLinkedList.addFirst("hello");
            mySingleLinkedList.addFirst(3);
            mySingleLinkedList.printLine();
            mySingleLinkedList.display();
            mySingleLinkedList = new MySingleLinkedList();
            mySingleLinkedList.addLast("a");
            mySingleLinkedList.addLast("b");
            mySingleLinkedList.addLast("c");
            mySingleLinkedList.printLine();
            mySingleLinkedList.display();
//            ThreadLocal
//            ArrayList
        }
    }
}
