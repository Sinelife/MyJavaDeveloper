package _2_java_essential.homework04.ex2;

import java.util.*;

class Tester {

    private static final int LIST_SIZE = 4_000_000;

    public static void main(String[] args) {
        TimeCounterService service = new TimeCounterService();
        service.countTimeForAllMethodSeveralTimes(new ArrayList<>(), LIST_SIZE);
        service.countTimeForAllMethodSeveralTimes(new LinkedList<>(), LIST_SIZE);
    }
}
