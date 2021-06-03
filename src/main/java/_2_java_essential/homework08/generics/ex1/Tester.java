package _2_java_essential.homework08.generics.ex1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Tester {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        /**EX1*/
        System.out.println("EX1");
        Integer[] ints = {1, 2, 3, 10, 12, 0, 12, 9, 14};
        System.out.println("Array " + ints[0].getClass().getSimpleName() + " :\n" + Arrays.toString(ints));
        List<Integer> intList = GenericMethods.getListFromArray(ints);
        System.out.println("List " + intList.get(0).getClass().getSimpleName() + " :");
        GenericMethods.outputList(intList);



        /**EX2*/
        System.out.println("\n\n\n\nEX2");
        String[][][] strings3DArray = {{{"fish","cat"}, {"parrot","dog","crab"}},
                                {{"elephant","lion"}, {"tiger"}},
                                {{"dragon","lizard"}, {"bird","lobster"}}};
        List<String> stringsList = GenericMethods.getListFrom3DArray(strings3DArray);
        System.out.println("List " + stringsList.get(0).getClass().getSimpleName() + " :");
        GenericMethods.outputList(stringsList);



        /**EX3*/
        System.out.println("\n\n\n\nEX3");
        List<String> stringList = new LinkedList<>();
        stringList.add("fish");stringList.add("cat");stringList.add("dog");stringList.add("parrot");stringList.add("dragon");stringList.add("elephant");
        System.out.println("List " + stringList.get(0).getClass().getSimpleName() + " :");
        GenericMethods.outputList(stringList);
        String[] strings = GenericMethods.getArrayFromList(stringList);
        System.out.println("\nArray " + strings[0].getClass().getSimpleName() + " :\n" + Arrays.toString(strings));



        /**4*/
        System.out.println("\n\n\n\nEX4");
        List<String> stringList2 = new LinkedList<>();
        stringList2.add("fish");stringList2.add("cat");stringList2.add("dog");stringList2.add("parrot");stringList2.add("dragon");stringList2.add("elephant");
        System.out.println("List " + stringList2.get(0).getClass().getSimpleName() + " :");
        GenericMethods.outputList(stringList2);
        String[] strings2 = GenericMethods.getArrayFromListEverySecondElem(stringList2);
        System.out.println("\nArray " + strings2[0].getClass().getSimpleName() + " :\n" + Arrays.toString(strings2));




        /**EX6*/
        System.out.println("\n\n\n\nEX6");
        Employee employee = new Employee(1, "Ярослав", "Сержан", 20, 10000, false, new Contact("446-464-44","ya.serzhan@gmail.com"));
        Node<String> node1 = new Node<>("HelloWorld!!!");
        Node<Integer> node2 = new Node<>(1000);
        Node<Employee> node3 = new Node<>(employee);
        System.out.println("Node<" + node1.getElem().getClass().getSimpleName() + "> = " + node1);
        System.out.println("Node<" + node2.getElem().getClass().getSimpleName() + "> = " + node2);
        System.out.println("Node<" + node3.getElem().getClass().getSimpleName() + "> = " + node3);



        /**EX7*/
        System.out.println("\n\n\n\nEX7");
        OtherNode<Double, String> node4 = new OtherNode<>(11.111, "HelloWorld!!!");
        OtherNode<String, Employee> node5 = new OtherNode<>("Something", employee);
        OtherNode<Contact, Integer> node6 = new OtherNode<>(new Contact("123-12-12", "qwe@gmail.com"),10);
        System.out.println("OtherNode<" + node4.getKey().getClass().getSimpleName() + "," + node4.getElem().getClass().getSimpleName() + "> = " + node4);
        System.out.println("OtherNode<" + node5.getKey().getClass().getSimpleName() + "," + node5.getElem().getClass().getSimpleName() + "> = " + node5);
        System.out.println("OtherNode<" + node6.getKey().getClass().getSimpleName() + "," + node6.getElem().getClass().getSimpleName() +  "> = " + node6);


    }
}
