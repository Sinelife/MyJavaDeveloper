package _3_java_proffessional.homework01.ex2;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        StudentService service = new StudentService();
//        service.run();

        MyStack<String> stack = new MyStack<>();
        stack.add("Abbadon");
        stack.add("Asmodeus");
        stack.add("Beelzebub");
        stack.add("Astarot");
        stack.add("Astarta");

        System.out.println(stack + "\n");
        stack.remove();
        System.out.println(stack + "\n");


        HugeStack<String> hugeStack = new HugeStack<>();
        hugeStack.add("Abbadon");
        hugeStack.add("Asmodeus");
        hugeStack.add("Beelzebub");
        hugeStack.add("Astarot");
        hugeStack.add("Baal");
        hugeStack.add("Astarta");
        hugeStack.add("Samael");
        hugeStack.add("Abbesalom");
        hugeStack.add("Naberius");
        hugeStack.add("Lilith");
        hugeStack.add("Belfegor");
        hugeStack.add("Lucifer");
        System.out.println(hugeStack + "\n");

        hugeStack.remove();
        System.out.println(hugeStack + "\n");

        hugeStack.removeAll(3);
        System.out.println(hugeStack + "\n");

        List<String> list = new ArrayList<>();
        list.add("Haarsus");
        list.add("Baltazar");
        hugeStack.addAll(list);
        System.out.println(hugeStack + "\n");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Garagrot");
        map.put(2, "Leviafan");
        map.put(3, "Prozerpina");
        hugeStack.addAll(map);
        System.out.println(hugeStack + "\n");

    }
}
