package _3_java_proffessional.homework03.ex4;

import _3_java_proffessional.homework01.ex2.MyCollection;

import java.util.Iterator;

public class MyQueue<E> implements MyCollection<E> {

    private static final int MAX_QUEUE_CAPACITY = 5;
    private Node<E> first;
    private Node<E> last;
    private int size;


    public MyQueue(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }


    @Override
    public boolean add(E element) {
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

    @Override
    public void remove() {
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

    @Override
    public E getTop() {
        return last.elem;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == MAX_QUEUE_CAPACITY;
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
