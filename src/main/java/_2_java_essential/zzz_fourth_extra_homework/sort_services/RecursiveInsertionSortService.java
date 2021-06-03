package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class RecursiveInsertionSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        insertionSortRecursive(array, array.length);
    }

    private void insertionSortRecursive(E[] array, int n) {
        if (n <= 1) {
            return;
        }
        insertionSortRecursive(array,n - 1);
        E last = array[n - 1];
        int j = n - 2;
        while (j >= 0 && array[j].compareTo(last) > 0) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = last;
    }
}
