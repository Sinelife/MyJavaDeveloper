package _3_java_proffessional.homework03.ex5;

import _3_java_proffessional.homework03.ex4.MyQueue;

import java.util.Iterator;

public class MyDeque<E> extends MyQueue<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;


    public MyDeque() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean addLast(E element) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Очередь переполнена");
        }
        if(element == null) {
            return false;
        }
        if (isEmpty()){
            last = new Node<>(null, element, null);
            first = last;
        } else {
            last.next = new Node<>(last, element, null);
            last = last.next;
        }
        size++;
        return true;
    }

    public boolean addFirst(E element) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Очередь переполнена");
        }
        if(element == null) {
            return false;
        }
        if (isEmpty()){
            last = new Node<>(null, element, null);
            first = last;
        } else {
            first.prev = new Node<>(null, element, first);
            first = first.prev;
        }
        size++;
        return true;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            first = first.next;
            size--;
        }
        if (size == 1) {
            first = null;
            last = null;
            size--;
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            last = last.prev;
            size--;
        }
        if (size == 1) {
            first = null;
            last = null;
            size--;
        }
    }

    public E getLast() {
        return last.elem;
    }

    public E getFirst() {
        return first.elem;
    }


    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }



    /** Вспомагательный вложеный клас*/
    private static class Node<E> {
        E elem;         /** значение самого элемента*/
        Node<E> next;   /** отсылка на следующий элемент*/
        Node<E> prev;   /** отсылка на предыдущий элемент*/

        Node(Node<E> prev, E element, Node<E> next) {
            this.elem = element;
            this.next = next;
            this.prev = prev;
        }
    }


    private class MyIterator implements Iterator<E> {

        private Node<E> current = first;

        MyIterator(){}

        @Override
        public E next() {
            E elem = current.elem;
            current = current.next;
            return elem;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public void remove() {

        }
    }
}
