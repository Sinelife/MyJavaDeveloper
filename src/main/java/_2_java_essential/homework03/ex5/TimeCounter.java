package _2_java_essential.homework03.ex5;

import _2_java_essential.homework03.ex5.shapes.Shape;
import _2_java_essential.homework03.ex5.sort_services.*;

class TimeCounter {
    private final static Sortable bubbleSortService = new BubbleSortService();
    private final static Sortable insertionSortService = new InsertionSortService();
    private final static Sortable selectionSortService = new SelectionSortService();
    private final static Sortable mergeSortService = new MergeSortService();
    private final static Sortable quickSortService = new QuickSortService();
    private final static Generator generator = new Generator();
    private final static String[] sortTypes = {"bubble", "insertion", "selection", "merge", "quick"};


    private long getIntArraySortTime(int size, String sortType) {
        int[] array = generator.getGeneratedIntegerArray(size);
        long start = System.currentTimeMillis();
        switch (sortType) {
            case "bubble":
                bubbleSortService.sort(array);
                break;
            case "insertion":
                insertionSortService.sort(array);
                break;
            case "selection":
                selectionSortService.sort(array);
                break;
            case "merge":
                mergeSortService.sort(array);
                break;
            case "quick":
                quickSortService.sort(array);
                break;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private long getStringArraySortTime(int size, String sortType) {
        String[] array = generator.getGeneratedStringArray(size);
        long start = System.currentTimeMillis();
        switch (sortType) {
            case "bubble":
                bubbleSortService.sort(array);
                break;
            case "insertion":
                insertionSortService.sort(array);
                break;
            case "selection":
                selectionSortService.sort(array);
                break;
            case "merge":
                mergeSortService.sort(array);
                break;
            case "quick":
                quickSortService.sort(array);
                break;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private long getShapeArraySortTime(int size, String sortType) {
        Shape[] array = generator.getGeneratedShapeArray(size);
        long start = System.currentTimeMillis();
        switch (sortType) {
            case "bubble":
                bubbleSortService.sort(array);
                break;
            case "insertion":
                insertionSortService.sort(array);
                break;
            case "selection":
                selectionSortService.sort(array);
                break;
            case "merge":
                mergeSortService.sort(array);
                break;
            case "quick":
                quickSortService.sort(array);
                break;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private void outputTimeForAllSortTypesForInteger(int size) {
        System.out.println("INTEGER");
        for (String sortType : sortTypes) {
            System.out.println(sortType.toUpperCase() + ": " + getIntArraySortTime(size, sortType) + " milliseconds");
        }
        System.out.println("\n\n");
    }

    private void outputTimeForAllSortTypesForString(int size) {
        System.out.println("STRING");
        for (String sortType : sortTypes) {
            System.out.println(sortType.toUpperCase() + ": " + getStringArraySortTime(size, sortType) + " milliseconds");
        }
        System.out.println("\n\n");
    }

    private void outputTimeForAllSortTypesForShape(int size) {
        System.out.println("SHAPE");
        for (String sortType : sortTypes) {
            System.out.println(sortType.toUpperCase() + ": " + getShapeArraySortTime(size, sortType) + " milliseconds");
        }
        System.out.println("\n\n");
    }


    public void outputTimeForAllSortTypes(int size) {
        outputTimeForAllSortTypesForInteger(size);
        outputTimeForAllSortTypesForString(size);
        outputTimeForAllSortTypesForShape(size);
    }

}
