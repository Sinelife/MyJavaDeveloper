package _2_java_essential.homework04.ex2;

import java.util.*;

class TimeCounterService {
    private static String str;
    private static final String STR_START = "     Start     |";
    private static final String STR_MIDDLE = "     Middle     |";
    private static final String STR_END = "      End      |";


    /**
     * Метод инициализирующий список
     */
    private void initializeList(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }


    /**
     * Метод, который подсчитывает время роботы всех методов(get, add, set, remove) в списке
     * list для трьох елементов - первого, последнего и того что посередине
     */
    public void countTimeForAllMethodSeveralTimes(List<Integer> list, int size) {
        initializeList(list, size);
        if (list instanceof LinkedList) {
            str = "  LinkedList[" + size + "]  |";
        }
        if (list instanceof ArrayList) {
            str = "  ArrayList[" + size + "]  |";
        }
        System.out.println(outputSymbols('-', str.length() + STR_START.length() + STR_MIDDLE.length() + STR_END.length() + 1));
        System.out.println("|" + str + STR_START + STR_MIDDLE + STR_END);
        System.out.println(outputSymbols('-', str.length() + STR_START.length() + STR_MIDDLE.length() + STR_END.length() + 1));
        countTimeForChosenMethodSeveralTimes(list, "get");
        countTimeForChosenMethodSeveralTimes(list, "add");
        countTimeForChosenMethodSeveralTimes(list, "remove");
        countTimeForChosenMethodSeveralTimes(list, "set");
        System.out.println("\n\n");
    }


    /**
     * Метод, который подсчитывает время роботы метода заданого переменной methodName в списке
     * list для трьох елементов - первого, последнего и того что посередине
     */
    private void countTimeForChosenMethodSeveralTimes(List<Integer> list, String methodName) {
        System.out.print("|" + outputForTable(str, methodName));
        System.out.print(outputForTable(STR_START, countTime(list, 0, methodName)));
        System.out.print(outputForTable(STR_MIDDLE, countTime(list, list.size() / 2, methodName)));
        System.out.print(outputForTable(STR_END, countTime(list, list.size() - 1, methodName)));
        System.out.println("\n" + outputSymbols('-', str.length() + STR_START.length() + STR_MIDDLE.length() + STR_END.length() + 1));

    }

    /**
     * Метод, который подсчитывает время роботы метода заданого переменной methodName в списке
     * list с индесом элемента elementIndex
     */
    private String countTime(List<Integer> list, int elementIndex, String methodName) {
        long start = 0;
        if (methodName.equals("add")) {
            start = System.nanoTime();
            list.add(elementIndex, 1000);
        } else if (methodName.equals("get")) {
            start = System.nanoTime();
            list.get(elementIndex);
        } else if (methodName.equals("set")) {
            start = System.nanoTime();
            list.set(elementIndex, 1000);
        } else if (methodName.equals("remove")) {
            start = System.nanoTime();
            list.remove(elementIndex);
        }
        long end = System.nanoTime();
        return String.valueOf((end - start) / 1_000_000) + " ms";
    }


    /**
     * Метод, который возвращает строку( в которой выбраный символ вводиться заданое количество раз
     */
    private String outputSymbols(char symbol, int numberOfSymbols) {
        String result = "";
        for (int i = 0; i < numberOfSymbols; i++) {
            result += symbol;
        }
        return result;
    }

    /**
     * Метод необходимый для коректного отображения таблицы. Он заполняет строку subStr пробелами
     * с обоих сторон пока длина subStr не станет равна mainStr
     */
    private String outputForTable(String mainStr, String subStr) {
        do {
            subStr = " " + subStr;
            if (subStr.length() == mainStr.length() - 1) {
                break;
            }
            subStr = subStr + " ";
        } while (subStr.length() < mainStr.length() - 1);
        subStr = subStr + "|";
        return subStr;
    }
}
