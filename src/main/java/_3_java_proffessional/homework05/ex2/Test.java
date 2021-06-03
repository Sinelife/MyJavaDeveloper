package _3_java_proffessional.homework05.ex2;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.add(12);
        stack.add(20);
        stack.add(32);
        stack.add(54);
        stack.add(77);
        stack.add(99);

        List<Integer> list = new MyArrayList<>();
        list.add(100);
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);


        System.out.println(stack.getTop() + "\n");
        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }

        ListAdapter<Integer> stackFromList = new ListAdapter<>(list);
        System.out.println("\n\n" + stackFromList.getTop() + "\n");
        for (Integer integer : stackFromList) {
            System.out.print(integer + " ");
        }
    }
}
