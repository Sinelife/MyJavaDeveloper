package _2_java_essential.zzz_fourth_extra_homework;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;
import _2_java_essential.zzz_fourth_extra_homework.sort_services.*;

class TimeCounter {
    private static final String DEFIES_LINE = "------------------------------------------------------------------";

    private <E extends AbstractEntity> void outputTimeForAllSortTypes(int size, Class<E> clazz) {
        System.out.println(DEFIES_LINE+ clazz.getSimpleName().toUpperCase() + DEFIES_LINE);
        for (SortType sortType : SortType.values()) {
            System.out.println(sortType.name() + ": " + getArraySortTime(size, sortType, clazz) + " milliseconds");
        }
        System.out.println("\n\n");
    }

    private <E extends AbstractEntity> long getArraySortTime(int size, SortType sortType, Class<E> clazz) {
        E[] array = null;
        try {
            array = (E[]) clazz.newInstance().getGeneratedArray(size, clazz);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        long start = System.currentTimeMillis();
        //System.out.println(Arrays.toString(array));
        sortType.service.sort(array);
        //System.out.println(Arrays.toString(array));
        long end = System.currentTimeMillis();
        return end - start;
    }

    public void outputAll(int size, Class... classes) {
        for (Class clazz : classes) {
            outputTimeForAllSortTypes(size, clazz);
        }
    }

    enum SortType {
        BUBBLE(new BubbleSortService()),
        INSERTION(new InsertionSortService()),
        SELECTION(new SelectionSortService()),
        MERGE(new MergeSortService()),
        QUICK(new QuickSortService()),
        HEAP(new HeapSortService()),
        SHELL(new ShellSortService()),
        COMB(new CombSortService()),
        RECURSIVE_BUBBLE(new RecursiveBubbleSortService()),
        RECURSIVE_INSERTION(new RecursiveInsertionSortService()),
        COCKTAIL(new CocktailSortService()),
        BITONIC(new BitonicSortService()),
        PANCAKE(new PancakeSortService()),
        GNOME(new GnomeSortService()),
        STOOGE(new StoogeSortService()),
        ODD_EVEN(new OddEvenSortService()),
        ITERATIVE_QUICK(new IterativeQuickSortService()),
        ITERATIVE_MERGE(new IterativeMergeSortService());
        //TREE(new TreeSortService());

        SortService service;

        SortType(SortService service) {
            this.service = service;
        }
    }
}
