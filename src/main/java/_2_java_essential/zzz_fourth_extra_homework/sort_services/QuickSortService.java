package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class QuickSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(E[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i].compareTo(array[cur])) <= 0) {
                i++;
            }
            while (j > cur && (array[cur].compareTo(array[j])) <= 0) {
                j--;
            }
            if (i < j) {
                swap(array, i, j);
                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }
            }
        }
        sort(array, start, cur);
        sort(array, cur + 1, end);
    }
}
