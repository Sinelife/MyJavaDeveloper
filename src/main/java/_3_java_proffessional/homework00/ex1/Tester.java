package _3_java_proffessional.homework00.ex1;

import java.util.Iterator;
import java.util.List;

public class Tester {

    public static void main(String[] args) {
        List<String> list = new MyArrayList<>(MyArrayList.Iterators.STRANGE_ITERATOR);
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
