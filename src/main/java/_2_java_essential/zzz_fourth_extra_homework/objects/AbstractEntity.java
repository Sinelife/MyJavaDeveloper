package _2_java_essential.zzz_fourth_extra_homework.objects;

import java.lang.reflect.Array;

public abstract class AbstractEntity<E> implements Generator<E>, Comparable<E> {

    @Override
    public E[] getGeneratedArray(int size, Class<E> elemClass) {
        E[] array = (E[]) Array.newInstance(elemClass, size);
        for (int i = 0; i < array.length; i++) {
            array[i] = getGeneratedElem();
        }
        return array;
    }
}
