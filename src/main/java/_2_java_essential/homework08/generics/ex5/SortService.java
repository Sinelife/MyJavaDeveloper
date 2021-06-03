package _2_java_essential.homework08.generics.ex5;

import java.util.*;

class SortService {
    private static final Random random = new Random();

    private <E extends Comparable> void bubbleSort(List<E> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if(list.get(j).compareTo(list.get(i)) < 0) {
                    swap(list, i, j);
                }
            }
        }
    }

    private <E extends Comparable> void insertionSort(List<E> list) {
        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (list.get(j).compareTo(list.get(j - 1)) < 0) {
                    swap(list, j, j - 1);
                }
            }
        }
    }

    private <E extends Comparable> void selectionSort(List<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            swap(list, i, minIndex);
        }
    }

    private <E> void swap(List<E> list, int i, int j) {
        E temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j, temp);
    }

    private <E extends Comparable> long getTimeOfSorting(List<E> list, String sortType) {
        long start = System.currentTimeMillis();
        switch (sortType) {
            case "bubble":
                bubbleSort(list);
                break;
            case "insertion":
                insertionSort(list);
                break;
            case "selection":
                selectionSort(list);
                break;
        }
        return System.currentTimeMillis() - start;
    }


    private <E> List<E> getGeneratedRandomList(Class<E> elemClass, int size) {
        List<E> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (elemClass.equals(Integer.class)) {
                list.add((E) Integer.valueOf(random.nextInt(120_000)));
            } else if (elemClass.equals(Double.class)) {
                list.add((E) Double.valueOf(random.nextDouble()));
            } else {
                list.add((E) Character.valueOf((char) random.nextInt(120)));
            }
        }
        return list;
    }


    private <E extends Comparable> void outputGenericTable(String[] types, Class<E> elemClass, int... sizes) {
        System.out.println("\n\n\n------------------" + elemClass.getSimpleName().toUpperCase() + "------------------------------------");
        for (int size : sizes) {
            System.out.print("Size: " + size);
            for (String type : types) {
                System.out.print("    " + type.toUpperCase() + ": " + getTimeOfSorting(getGeneratedRandomList(elemClass, size), type) + " milliseconds");
            }
            System.out.println();
        }
    }

    void outputAllTables(int... sizes) {
        final String[] types = {"bubble", "insertion", "selection"};
        for (Class elemClass : new Class[]{Double.class, Integer.class, Character.class}) {
            outputGenericTable(types, elemClass, sizes);
        }
    }
}
