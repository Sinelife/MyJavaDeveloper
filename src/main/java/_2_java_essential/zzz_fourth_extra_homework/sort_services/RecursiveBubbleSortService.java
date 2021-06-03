package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class RecursiveBubbleSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        bubbleSort(array, array.length);
    }

    private void bubbleSort(E[] array, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                swap(array, i, i + 1);
            }
        }
        bubbleSort(array, n - 1);
    }
}
