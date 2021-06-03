package _2_java_essential.homework08.generics.ex1;

import java.lang.reflect.Array;
import java.util.*;

class GenericMethods {

    /**
     * 1) Метод конвертации массива любого типа в список этого ж типа.
     */
    public static <E> List<E> getListFromArray(E [] array){
        return new ArrayList<>(Arrays.asList(array));
    }


    /**
     * 2) Метод конвертации трехмерного масива любого типа в список этого ж типа.
     */
    public static <E> List<E> getListFrom3DArray(E[][][] array){
        List<E> list = new ArrayList<>();
        for (E[][] array2D : array) {
            for (int j = 0; j < array[0].length; j++) {
                list.addAll(Arrays.asList(array2D[j]));
            }
        }
        return list;
    }


    /**
     * 3) Метод конвертации списка любого типа в масив этого ж типа.
     */

    public static <E> E[] getArrayFromList(List<E> list) {
        E[] array = (E[]) Array.newInstance(list.get(0).getClass(), list.size());
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }


    /**
     * 4) Метод конвертации списка любого типа в массив куда попадет
     * только каждый второй элемент.
     */
    public static <E> E[] getArrayFromListEverySecondElem(List<E> list) {
        E[] array = (E[]) Array.newInstance(list.get(0).getClass(), list.size() / 2);
        for (int i = 0;  i < list.size(); i += 2) {
            if(i % 2 == 0) {
                array[i] = list.get(i);
            }
        }
        return array;
    }


    /**
     * 5) Написать метод, который выведет список любого типа.
     */
    public static <E> void outputList(List<E> list){
        for(E elem : list){
            System.out.print(elem + ", ");
        }
    }
}
