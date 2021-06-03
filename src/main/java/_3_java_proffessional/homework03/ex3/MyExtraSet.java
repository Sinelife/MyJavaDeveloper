package _3_java_proffessional.homework03.ex3;

import _3_java_proffessional.homework03.ex1.MySet;

import java.lang.reflect.Array;
import java.util.*;

public class MyExtraSet<E> extends MySet<E> implements Extra<E> {

    @Override
    public boolean removeRandom() {
        Random random = new Random();
        int index = random.nextInt(size() - 1);
        E elemToDelete = null;
        for (E elem : this) {
            if(index-- == 0) {
                elemToDelete = elem;
            }
        }
        System.out.println("DELETED: " + elemToDelete);
        remove(elemToDelete);
        return false;
    }

    @Override
    public boolean removeRandom(int num) {
        if(num < 0) {
            return false;
        }
        for (int i = 0; i < num; i++) {
            removeRandom();
        }
        return true;
    }

    @Override
    public boolean removeRandom(E... elems) {
        if (elems == null) {
            return false;
        }
        for (E elem : elems) {
            remove(elem);
        }
        return true;
    }

    @Override
    public Map<Integer, E> convertToHashMap() {
        Map<Integer, E> map = new HashMap<>();
        int i = 0;
        for (E elem : this) {
            map.put(++i, elem);
        }
        return map;
    }

    @Override
    public E[] convertToArray() {
        E e = (E) new Object();
        E[] array = null;
        try {
            Class clazz = Class.forName(e.getClass().getName());
            array = (E[]) Array.newInstance(clazz, size());
            int counter = 0;
            for (E elem : this) {
                array[counter++] = elem;
            }
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        return array;
    }
}
