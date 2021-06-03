package _3_java_proffessional.homework00.ex2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyTinyArrayList<E> implements Iterable<E> {

    private E[] values;
    private int size;
    private int capacity;


    /**
     * Конструктор по умолчанию
     */
    public MyTinyArrayList() {
        this.capacity = 50;
        this.values = (E[]) new Object[capacity];
    }


    /**
     * Метод, который возвращает размер списка
     */
    public int size() {
        return size;
    }

    /**
     * Метод, который проверяет являеться ли список пустым
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Метод, который добавляет обьект в конец списка
     */
    public boolean add(E o) {
        if (o == null) {
            return true;
        }
        values[size] = o;
        size++;
        return true;
    }



    /**
     * Метод, который возвращает элемент списка по индексу
     */
    public E get(int index) {
        if (index < size && index >= 0) {
            return values[index];
        }
        return null;
    }


    /**
     * Метод, который удаляет элемент списка по индексу
     */
    public E remove(int index) {
        if (index < size && index >= 0) {
            for (int i = index; i < size; i++) {
                if (i == size - 1) {
                    values[i] = null;
                    size--;
                    return values[i];
                }
                values[i] = values[i + 1];
            }
        }
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int current_index = -1;

            @Override
            public E next() {
                if (!hasNext()) { throw new NoSuchElementException(); }
                current_index++;
                return values[current_index];
            }

            @Override
            public boolean hasNext() {
                return current_index < size - 1 ;
            }

            @Override
            public void remove() {
                MyTinyArrayList.this.remove(current_index);
                current_index--;
            }
        };
    }

}
