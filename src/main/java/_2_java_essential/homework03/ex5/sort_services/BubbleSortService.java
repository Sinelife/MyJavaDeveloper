package _2_java_essential.homework03.ex5.sort_services;

import _2_java_essential.homework03.ex5.UtilMethods;
import _2_java_essential.homework03.ex5.shapes.Shape;

public class BubbleSortService implements Sortable {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[i]) {
                    UtilMethods.swap(array, i, j);
                }
            }
        }
    }

    @Override
    public void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(UtilMethods.firstLessOrEquals(array[j], array[i])) {
                    UtilMethods.swap(array, i, j);
                }
            }
        }
    }

    @Override
    public void sort(Shape[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[j].getArea() < array[i].getArea()) {
                    UtilMethods.swap(array, i, j);
                }
            }
        }
    }

}
