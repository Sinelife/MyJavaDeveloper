package _2_java_essential.zzz_fourth_extra_homework.sort_services;
import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;
import java.lang.reflect.Array;

public class IterativeMergeSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    private Class<?> elemCLass;

    @Override
    public void sort(E[] array) {
        elemCLass = getElemClass(array[0]);
        mergeSort(array, array.length);
    }

    private void mergeSort(E[] array, int n) {
        int currSize;
        int leftStart;
        for (currSize = 1; currSize <= n - 1; currSize *= 2) {
            for (leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);
                merge(array, leftStart, mid, rightEnd);
            }
        }
    }

    private void merge(E[] array, int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;
        E[] left = (E[]) Array.newInstance(elemCLass, n1);
        E[] right = (E[]) Array.newInstance(elemCLass, n2);
        for (i = 0; i < n1; i++) {
            left[i] = array[l + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = array[m + 1 + j];
        }
        i = 0; j = 0; k = l;
        while (i < n1 && j < n2) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}
