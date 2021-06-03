package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class CocktailSortService <E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        cocktailSort(array);
    }

    private void cocktailSort(E[] array) {
        boolean swapped = true;
        int start = 0;
        int end = array.length;
        while (swapped) {
            swapped = false;
            for (int i = start; i < end - 1; ++i) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            end = end - 1;
            for (int i = end - 1; i >= start; i--) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            start = start + 1;
        }
    }
}
