package _2_java_essential.homework05._1_enum.ex3;

import java.util.*;


/**
 * Клас тестер, вызывающий метод run класа TimeCounter
 */
class Tester {
    private final static int LIST_SIZE = 5_000_000;

    public static void main(String[] args) {
        TimeCounter tc = new TimeCounter(new ArrayList<>(), LIST_SIZE);
        tc.run();
        tc = new TimeCounter(new LinkedList<>(), LIST_SIZE);
        tc.run();
    }
}
