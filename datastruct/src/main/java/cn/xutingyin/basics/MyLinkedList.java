package cn.xutingyin.basics;

/**
 * @description: 双向链表
 * @author: Eingyin.Xu
 * @date: 2020/4/9 9:37
 */

public class MyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    MyLinkedList() {

    }

    private void printLine() {
        System.out.println("-------------------------------------");
    }

    public void disPlay() {
        while (first != null) {
            if (first.data != null) {
                System.out.println(first.data);
            }
            first = first.next;
        }
    }

    /**
     * 头部插入指定元素
     * 
     * @param e
     * @return
     */
    public boolean addFirst(E e) {
        Node<E> f = first;
        Node<E> newNode = new Node(null, e, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
        return true;

    }

    /**
     * 尾部添加指定元素
     * 
     * @param e
     * @return
     */
    public boolean add(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        return true;
    }

    /**
     * 内部类-节点基础结构
     */
    private static class Node<E> {
        // 前驱
        private Node<E> prev;
        // 后继
        private Node<E> next;

        private E data;

        Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.data = element;
            this.next = next;

        }
    }

    public static void main(String[] args) {
        MyLinkedList<String> l = new MyLinkedList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.disPlay();
        l.printLine();
        l.addFirst("1");
        l.addFirst("2");
        l.addFirst("3");
        l.disPlay();
        l.printLine();

    }
}