package _3_java_proffessional.homework03.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Tester {

    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();
    private static List<Integer> list3 = new ArrayList<>();

    public static void main(String[] args) {
        initialize();
        Set<Integer> set = new MySet<>();
        System.out.println("isEmpty? - " + set.isEmpty());
        System.out.println(set + " = " + set.size());

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(100);


        set.addAll(list1);
        System.out.println("isEmpty? - " + set.isEmpty());
        System.out.println(set + " = " + set.size());

        set.remove(100);
        System.out.println(set + " = " + set.size());

        set.removeAll(list1);
        System.out.println(set + " = " + set.size());


        System.out.println("set.contains(1) - " + set.contains(1));
        System.out.println("set.contains(10) - " + set.contains(10));

        System.out.println("set.contains(" + list2 + ") - " + set.containsAll(list2));
        System.out.println("set.contains(" + list3 + ") - " + set.containsAll(list3));

        set.retainAll(list3);
        System.out.println(set + " = " + set.size());

        System.out.println(set + " = " + set.size());
        System.out.println("isEmpty? - " + set.isEmpty());

    }

    private static void initialize() {
        list1.add(100);
        list1.add(101);
        list1.add(110);


        list2.add(1);
        list2.add(3);
        list2.add(4);

        list3.add(10);
        list3.add(2);
        list3.add(1);
    }
}
