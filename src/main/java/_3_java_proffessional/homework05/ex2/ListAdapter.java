package _3_java_proffessional.homework05.ex2;

import java.util.Iterator;
import java.util.List;

public class ListAdapter<E> implements MyCollection<E> {

    private List<E> list;

    ListAdapter(List<E> list) {
        this.list = list;
    }


    @Override
    public boolean add(E elem) {
        if (elem == null) {
            return false;
        }
        list.add(elem);
        return true;
    }

    @Override
    public void remove() {
        list.remove(list.size() - 1);
    }

    @Override
    public E getTop() {
        return list.get(list.size() - 1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return list.size() > 100;
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
            return currentIndex < size() - 1;
        }

        @Override
        public E next() {
            return list.get(++currentIndex);
        }

        @Override
        public void remove() {
            ListAdapter.this.remove();
        }
    }


}
