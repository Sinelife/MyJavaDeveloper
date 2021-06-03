package _2_java_essential.homework03.ex5.sort_services;

import _2_java_essential.homework03.ex5.shapes.Shape;

public interface Sortable {

    void sort(int[] array);

    void sort(String[] array);

    void sort(Shape[] array);
}
