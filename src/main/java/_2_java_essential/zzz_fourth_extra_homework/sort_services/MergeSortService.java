package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;
import java.lang.reflect.Array;

public class MergeSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    private Class<?> elemCLass;

    @Override
    public void sort(E[] array) {
        elemCLass = getElemClass(array[0]);
        sort(array, 0, array.length - 1);
    }

    private void sort(E[] array, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(array, l, m);
            sort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }

    private void merge(E[] array, int l, int m, int r)  {
        int n1 = m - l + 1;
        int n2 = r - m;

        E[] leftArr = (E[]) Array.newInstance(elemCLass, n1);
        E[] rightArr = (E[]) Array.newInstance(elemCLass, n2);

        for (int i = 0; i < n1; ++i) {
            leftArr[i] = array[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = array[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (leftArr[i].compareTo(rightArr[j]) < 0) {
                array[k] = leftArr[i];
                i++;
            } else {
                array[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
