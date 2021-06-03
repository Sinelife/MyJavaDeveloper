package _3_java_proffessional.homework01.ex2;


import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class HugeStack<E> implements MyExtraCollection<E> {

    private static final int HUGE_STACK_CAPACITY = 5;
    private MyCollection<E>[] stacks;
    private int size;
    private int currentStackNum;


    public HugeStack() {
        this.stacks = new MyStack[HUGE_STACK_CAPACITY];
        this.currentStackNum = 0;
        this.stacks[currentStackNum] = new MyStack<>();
    }

    @Override
    public boolean add(E elem) {
        if (stacks[currentStackNum].isFull()) {
            currentStackNum++;
            stacks[currentStackNum] = new MyStack<>();
        }
        stacks[currentStackNum].add(elem);
        size++;
        return true;
    }

    @Override
    public void remove() {
        if (!isEmpty()) {
            if (stacks[currentStackNum].isEmpty()) {
                currentStackNum--;
            }
            stacks[currentStackNum].remove();
            size--;
        }
    }

    @Override
    public E getTop() {
        return stacks[currentStackNum].getTop();
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
        return stacks[stacks.length - 1].isFull();
    }

    @Override
    public void addAll(Collection<E> c) {
        for (E elem : c) {
            add(elem);
        }
    }

    @Override
    public void addAll(Map<?, E> map) {
        Collection<E> elems = map.values();
        for (E elem : elems) {
            add(elem);
        }
    }

    @Override
    public void removeAll(int number) {
        while (number > 0) {
            remove();
            number--;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new HugeStackIterator();
    }


    private class HugeStackIterator implements Iterator<E> {

        private int currentIndex;
        private Iterator<E> iterator;

        HugeStackIterator() {
            this.currentIndex = 0;
            this.iterator = stacks[currentIndex].iterator();
        }

        @Override
        public boolean hasNext() {
            return currentIndex < HUGE_STACK_CAPACITY - 1
                    && iterator.hasNext();
        }

        @Override
        public E next() {
            if (iterator.hasNext()) {
                return iterator.next();
            }
            iterator = stacks[currentIndex].iterator();
            return iterator.next();
        }

        @Override
        public void remove() {

        }
    }


    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i <= currentStackNum; i++) {
            res += stacks[i] + "\n";
        }
        return res;
    }
}
