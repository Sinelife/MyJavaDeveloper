package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class BitonicSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        int up = 1;
        bitonicSort(array, 0, array.length, up);
    }

    private void bitonicSort(E[] array, int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            bitonicSort(array, low, k, 1);
            bitonicSort(array,low + k, k, 0);
            bitonicMerge(array, low, cnt, dir);
        }
    }

    private void bitonicMerge(E[] array, int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            for (int i = low; i < low + k; i++) {
                compAndSwap(array, i, i + k, dir);
            }
            bitonicMerge(array, low, k, dir);
            bitonicMerge(array,low + k, k, dir);
        }
    }

    private void compAndSwap(E[] array, int i, int j, int dir) {
        if ((array[i].compareTo(array[j]) > 0 && dir == 1) || (array[i].compareTo(array[j]) < 0 && dir == 0)) {
            swap(array, i, j);
        }
    }
}
