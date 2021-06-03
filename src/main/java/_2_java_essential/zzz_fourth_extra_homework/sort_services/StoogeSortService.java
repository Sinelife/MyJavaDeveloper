package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class StoogeSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        stoogeSort(array, 0, array.length - 1);
    }

    private void stoogeSort(E[] array, int l, int h) {
        if (l >= h) {
            return;
        }
        if (array[l].compareTo(array[h]) > 0) {
            swap(array, l, h);
        }
        if (h - l + 1 > 2) {
            int t = (h - l + 1) / 3;
            stoogeSort(array, l, h - t);
            stoogeSort(array, l + t, h);
            stoogeSort(array, l, h - t);
        }
    }
}
