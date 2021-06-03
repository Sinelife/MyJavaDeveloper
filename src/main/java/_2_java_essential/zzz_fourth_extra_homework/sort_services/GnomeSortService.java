package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class GnomeSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        gnomeSort(array, array.length);
    }

    private void gnomeSort(E[] array, int n) {
        int index = 0;
        while (index < n) {
            if (index == 0) {
                index++;
            }
            if (array[index].compareTo(array[index - 1]) >= 0) {
                index++;
            } else {
                swap(array, index, index - 1);
                index--;
            }
        }
    }
}
