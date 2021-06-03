package _2_java_essential.homework03.ex5.sort_services;


import _2_java_essential.homework03.ex5.UtilMethods;
import _2_java_essential.homework03.ex5.shapes.Shape;

public class QuickSortService implements Sortable, Cuttable {

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                UtilMethods.swap(array, i, j);
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


    @Override
    public void sort(String[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(String[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && UtilMethods.firstLessOrEquals(array[i], array[cur])) {
                i++;
            }
            while (j > cur && UtilMethods.firstLessOrEquals(array[cur], array[j])) {
                j--;
            }
            if (i < j) {
                UtilMethods.swap(array, i, j);
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


    @Override
    public void sort(Shape[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(Shape[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i].getArea() <= array[cur].getArea())) {
                i++;
            }
            while (j > cur && (array[cur].getArea() <= array[j].getArea())) {
                j--;
            }
            if (i < j) {
                UtilMethods.swap(array, i, j);
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





    @Override
    public int[] getCutted(int[] array, int n) {
        int[] newArray = new int[array.length / n];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        return newArray;
    }

    @Override
    public int[] getCutted(int[] array, int n, int m) {
        int[] newArray = new int[array.length / n];
        for (int i = 0, j = array.length * (m - 1) / n; i < newArray.length; i++, j++) {
            System.out.println(array[j]);
            newArray[i] = array[j];
        }
        return newArray;
    }
}
