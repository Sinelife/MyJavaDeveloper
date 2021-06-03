package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class ShellSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        shellSort(array);
    }

    private void shellSort (E[] array) {
        for (int inc = array.length / 2; inc >= 1; inc = inc / 2) {
            for (int step = 0; step < inc; step++) {
                insertionSort(array, step, inc);
            }
        }
    }

    private void insertionSort (E[] array, int start, int inc) {
        for (int i = start; i < array.length - 1; i += inc) {
            for (int j = Math.min(i + inc, array.length - 1); j - inc >= 0; j = j - inc) {
                if (array[j - inc].compareTo(array[j]) > 0) {
                    swap(array, j, j - inc);
                } else break;
            }
        }
    }
}
