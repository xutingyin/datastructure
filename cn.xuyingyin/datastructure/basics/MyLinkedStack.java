package datastructure.basics;

/**
 * @description: 链表实现栈
 * @author: Tingyin.Xu
 * @date: 2020/4/9 14:51
 */

public class MyLinkedStack {

    private static class Node<E> {
        private Node<E> next;
        private E data;

        Node(Node<E> next, E element) {
            this.next = next;
            this.data = element;
        }
    }

}
