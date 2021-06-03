package _3_java_proffessional.homework05.ex2;

import java.util.Iterator;

public class MyStack<E> implements MyCollection<E> {

    private static final int MAX_CAPACITY = 15;
    private E[] values;
    private int size;
    private int maxCapacity;

    MyStack() {
        this.maxCapacity = MAX_CAPACITY;
        this.values = (E[]) new Object[maxCapacity];
    }

    public MyStack(int capacity) {
        this.maxCapacity = capacity;
        this.values = (E[]) new Object[maxCapacity];
    }


    @Override
    public boolean add(E elem) {
        if (elem == null) {
            return false;
        }
        if(isFull()) {
            throw new IndexOutOfBoundsException("Стек переполнен.");
        }
        values[size] = elem;
        size++;
        return true;
    }

    @Override
    public void remove() {
        if(size > 0) {
            values[size - 1] = null;
            size--;
        }
    }

    @Override
    public E getTop() {
        return values[size - 1];
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
        return size == maxCapacity;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyStackIterator();
    }



    class MyStackIterator implements Iterator<E> {

        private int currentIndex;

        MyStackIterator() {
            this.currentIndex = -1;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size - 1;
        }

        @Override
        public E next() {
            return values[++currentIndex];
        }

        @Override
        public void remove() {

        }
    }

    @Override
    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += values[i];
            if(i < size - 1) {
                res += ", ";
            }
        }
        res += "]";
        return res;
    }
}
