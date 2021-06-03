package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.*;

public class BubbleSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        bubbleSort(array);
    }

    private void bubbleSort(E[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[j].compareTo(array[i]) < 0) {
                    swap(array, i, j);
                }
            }
        }
    }
}
