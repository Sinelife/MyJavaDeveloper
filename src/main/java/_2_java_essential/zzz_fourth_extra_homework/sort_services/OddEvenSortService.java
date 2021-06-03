package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class OddEvenSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        oddEvenSort(array, array.length);
    }

    private void oddEvenSort(E[] array, int n) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i <= n - 2; i += 2) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            for (int i = 0; i <= n - 2; i += 2) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
        }
    }
}
