package _3_java_proffessional.homework00.ex2;

import java.util.Iterator;

public class Tester {

    public static void main(String[] args) {
        MyTinyArrayList<String> list = new MyTinyArrayList<>();
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
