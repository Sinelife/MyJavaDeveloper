package _2_java_essential.homework04.ex1;

import java.util.*;

class Tester {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.print("Пустой ли список? - " + integers.isEmpty() + "  ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        integers.remove(3);
        System.out.print("Удаляем элемент с индексом 3. ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        integers.remove(Integer.valueOf(6));
        System.out.print("Удаляем элемент 6. ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        integers.remove(Integer.valueOf(666));
        System.out.print("Удаляем элемент 666. ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        integers.set(7, 1);
        System.out.print("Меняем значения елемента по индексу 7 на 1. ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        integers.set(1, 10);
        System.out.print("Меняем значения елемента по индексу 1 на 10. ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        integers.add(5);
        System.out.print("Добавляем элемент 5. ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        integers.add(-5);
        System.out.print("Добавляем элемент -5. ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        integers.add(1, 14);
        System.out.print("Добавляем элемент 14 в список по индексу 1. ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        List<Integer> list1 = new LinkedList<>(Arrays.asList(0, 23, 44, 0, 99, 22, 12, 8, -1, 99, 99, -1));
        integers.addAll(list1);
        System.out.print("Добавляем " + list1 + " в список. ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        System.out.print("Входит ли 100 в наш список? -  " + integers.contains(100) + ". ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        System.out.print("Входит ли 99 в наш список? -  " + integers.contains(99) + ". ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        List<Integer> list2 = new LinkedList<>(Arrays.asList(1, 10, 100));
        System.out.print("Входит ли " + list2 + " в на список? -  " + integers.containsAll(list2) + ". ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        List<Integer> list3 = new LinkedList<>(Arrays.asList(1, 23, 99));
        System.out.print("Входит ли " + list3 + " в на список? -  " + integers.containsAll(list3) + ". ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        Set<Integer> set1 = new HashSet<>(Arrays.asList(0, -1, 22));
        integers.removeAll(set1);
        System.out.print("Удаляем элементы" + set1 + " из нашего списка. ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 8, 12, 99));
        integers.retainAll(set2);
        System.out.print("Удаляем элементы кроме " + set2 + " . ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        Integer[] array = integers.toArray(new Integer[]{});
        System.out.print("Array: " + Arrays.toString(array) + "   ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        integers.clear();
        System.out.print("Очищаем список от всех элементов. ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");

        System.out.print("Пустой ли список? - " + integers.isEmpty() + "  ");
        System.out.println("List: " + integers + "  Size: " + integers.size() + "\n");
    }
}
