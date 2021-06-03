package _2_java_essential.homework03.ex5.sort_services;

import _2_java_essential.homework03.ex5.UtilMethods;
import _2_java_essential.homework03.ex5.shapes.Shape;

public class SelectionSortService implements Sortable {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            UtilMethods.swap(array, i, minIndex);
        }
    }

    @Override
    public void sort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (UtilMethods.firstLessOrEquals(array[j], array[minIndex])) {
                    minIndex = j;
                }
            }
            UtilMethods.swap(array, i, minIndex);
        }
    }

    @Override
    public void sort(Shape[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].getArea() < array[minIndex].getArea()) {
                    minIndex = j;
                }
            }
            UtilMethods.swap(array, i, minIndex);
        }
    }
}
