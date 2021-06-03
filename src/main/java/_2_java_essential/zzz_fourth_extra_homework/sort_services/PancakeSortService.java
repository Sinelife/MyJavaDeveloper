package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class PancakeSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        pancakeSort(array, array.length);
    }

    private void pancakeSort(E[] array, int n) {
        for (int currSize = n; currSize > 1; --currSize) {
            int maxIndex = findMax(array, currSize);
            if (maxIndex != currSize - 1) {
                flip(array, maxIndex);
                flip(array, currSize - 1);
            }
        }
    }

    private void flip(E[] array, int i) {
        int start = 0;
        while (start < i) {
            swap(array, start, i);
            start++;
            i--;
        }
    }

    private int findMax(E[] array, int n) {
        int maxIndex, i;
        for (maxIndex = 0, i = 0; i < n; ++i) {
            if (array[i].compareTo(array[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
