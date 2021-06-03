package _3_java_proffessional.homework03.ex1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet<E> implements Set<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;


    public MySet() {
        this.first = null;
        this.last = null;
        this.size = 0;
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
    public boolean contains(Object o) {
        for (E e : this) {
            if(e.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (E e : this) {
            array[i] = e;
            i++;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E element) {
        if(element == null || this.contains(element)) {
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
    public boolean remove(Object o) {
        if (o == null || !this.contains(o)) {
            return true;
        }
        if (size == 1) {
            first = null;
            last = null;
            size--;
        }
        MyIterator i = new MyIterator();
        while(i.hasNext()) {
            if(i.get().equals(o)) {
                i.remove();
                size--;
                return true;
            } else {
                i.next();
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if(c == null || c.isEmpty()) {
            return false;
        }
        for (Object o : c) {
            if(!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if(c == null || c.isEmpty()) {
            return false;
        }
        for (E e : c) {
            add(e);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if(c == null || c.isEmpty()) {
            return false;
        }
        for (E e : this) {
            if (!c.contains(e)) {
                remove(e);
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if(c == null || c.isEmpty()) {
            return false;
        }
        for (Object o : c) {
            if (contains(o)) {
                remove(o);
            }
        }
        return true;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
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
            if (current.prev == null) {
                current = current.next;
                current.prev = null;
            } else if (current.next == null) {
                current.prev.next = null;
                current = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                current = current.next;
            }
        }

        public E get() {
            return current.elem;
        }
    }


    @Override
    public String toString() {
        String res = "[";
        int counter = 1;
        for (E elem : this) {
            if (counter++ < size) {
                res += elem + ", ";
            } else {
                res += elem;
            }
        }
        return res + "]";
    }
}
