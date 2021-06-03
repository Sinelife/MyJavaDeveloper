package _2_java_essential.homework02.ex4;

import java.util.*;

class Tester {
    private final static ListService service = new ListService();

    public static void main(String[] args) {
        LinkedList<String> badLinkedList = new LinkedList<>(Arrays.asList("Astaroth", "Astarta", "Beelzebub", "Asmodeus", "Lucifer", "Satan", "Baal", "Samael", "Lilith"));
        ArrayList<String> badArrayList = new ArrayList<>(Arrays.asList("Rafael", "Michael", "Gabriel", "Uriel", "Nakim", "Sarpentos", "Surmiel", "Nael"));

        System.out.println("MaxMin Array: " + Arrays.toString(service.getMaxMinArray(badArrayList)));
        System.out.println("MaxMin Array: " + Arrays.toString(service.getMaxMinArray(badLinkedList)));

        System.out.println("\n\n");
        System.out.println("Summary String: " + service.getStringsWithASum(badArrayList));
        System.out.println("Summary String: " + service.getStringsWithASum(badLinkedList));

        System.out.println("\n\n");
        System.out.println("Every second elem list: " + service.getListFromEverySecondElem(badArrayList));
        System.out.println("Every second elem list: " + service.getListFromEverySecondElem(badLinkedList));




        System.out.println("\n\n\n");
        List<String> goodLinkedList = new LinkedList<>(Arrays.asList("Astaroth", "Astarta", "Beelzebub", "Asmodeus", "Lucifer", "Satan", "Baal", "Samael", "Lilith"));
        List<String> goodArrayList = new ArrayList<>(Arrays.asList("Rafael", "Michael", "Gabriel", "Uriel", "Nakim", "Sarpentos", "Surmiel", "Nael"));

        System.out.println("MaxMin Array: " + Arrays.toString(service.getMaxMinArray(goodArrayList)));
        System.out.println("MaxMin Array: " + Arrays.toString(service.getMaxMinArray(goodLinkedList)));

        System.out.println("\n\n");
        System.out.println("Summary String: " + service.getStringsWithASum(goodArrayList));
        System.out.println("Summary String: " + service.getStringsWithASum(goodLinkedList));

        System.out.println("\n\n");
        System.out.println("Every second elem list: " + service.getListFromEverySecondElem(goodArrayList));
        System.out.println("Every second elem list: " + service.getListFromEverySecondElem(goodLinkedList));
    }


}
