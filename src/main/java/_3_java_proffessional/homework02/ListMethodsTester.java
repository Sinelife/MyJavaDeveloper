package _3_java_proffessional.homework02;

import _3_java_proffessional.homework00.ex1.MyArrayList;

import java.util.List;


/**Клас вызывающий метод run() класа TesterOfMethodsOfMyChosenList*/

public class ListMethodsTester {
    public static void main(String[] args) {
        List myArrayList = new MyArrayList();
        List myLinkedList = new MyLinkedList();

        //cюда можно подставить имя того списка, который нужно протестировать
        MethodsOfChosenLisrService t = new MethodsOfChosenLisrService(myLinkedList);
        t.run();
    }
}
