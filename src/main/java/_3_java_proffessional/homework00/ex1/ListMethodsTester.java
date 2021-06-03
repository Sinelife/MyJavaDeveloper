package _3_java_proffessional.homework00.ex1;

import _3_java_proffessional.homework02.MyLinkedList;

import java.util.List;


/**Клас вызывающий метод run() класа TesterOfMethodsOfMyChosenList*/

public class ListMethodsTester {
    public static void main(String[] args) {
        List myArrayList = new MyArrayList();
        List myLinkedList = new MyLinkedList();

        //cюда можно подставить имя того списка, который нужно протестировать
        MethodsOfChosenLisrService t = new MethodsOfChosenLisrService(myArrayList);
        t.run();
    }
}
