package _2_java_essential.homework03.ex5.sort_services;

import _2_java_essential.homework03.ex5.UtilMethods;
import _2_java_essential.homework03.ex5.shapes.Shape;

public class InsertionSortService implements Sortable {

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    UtilMethods.swap(array, j, j - 1);
                }
            }
        }
    }

    @Override
    public void sort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (UtilMethods.firstLessOrEquals(array[j], array[j - 1])) {
                    UtilMethods.swap(array, j, j - 1);
                }
            }
        }
    }

    @Override
    public void sort(Shape[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j].getArea() < array[j - 1].getArea()) {
                    UtilMethods.swap(array, j, j - 1);
                }
            }
        }
    }

}
