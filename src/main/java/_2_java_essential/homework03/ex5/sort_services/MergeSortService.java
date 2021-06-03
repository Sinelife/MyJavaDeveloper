package _2_java_essential.homework03.ex5.sort_services;

import _2_java_essential.homework03.ex5.UtilMethods;
import _2_java_essential.homework03.ex5.shapes.Shape;

public class MergeSortService implements Sortable {

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(array, l, m);
            sort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }

    private void merge(int[] array, int l, int m, int r)  {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArr[i] = array[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = array[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
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



    @Override
    public void sort(String[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(String[] array, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(array, l, m);
            sort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }

    private void merge(String[] array, int l, int m, int r)  {
        int n1 = m - l + 1;
        int n2 = r - m;

        String[] leftArr = new String[n1];
        String[] rightArr = new String[n2];

        for (int i = 0; i < n1; ++i) {
            leftArr[i] = array[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = array[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (UtilMethods.firstLessOrEquals(leftArr[i], rightArr[j])) {
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




    @Override
    public void sort(Shape[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(Shape[] array, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(array, l, m);
            sort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }

    private void merge(Shape[] array, int l, int m, int r)  {
        int n1 = m - l + 1;
        int n2 = r - m;

        Shape[] leftArr = new Shape[n1];
        Shape[] rightArr = new Shape[n2];

        for (int i = 0; i < n1; ++i) {
            leftArr[i] = array[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = array[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (leftArr[i].getArea() <= rightArr[j].getArea()) {
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
