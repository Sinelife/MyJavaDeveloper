package _3_java_proffessional.homework02;

import java.util.*;

public class Tester {

    public static void main(String[] args) {
        List<String> list = new MyLinkedList<>(MyLinkedList.Iterators.STRANGE_ITERATOR);
        list.add("Qwerty");
        list.add("Asdfgh");
        list.add("Yuiop");
        list.add("Nemo");
        list.add("Granny");
        list.add("Mummy");

        Iterator iterator = list.iterator();
        int counter = 0;
        while(iterator.hasNext()) {
            iterator.next();
            if(counter == 2) {
                iterator.remove();
            }
            counter++;
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
