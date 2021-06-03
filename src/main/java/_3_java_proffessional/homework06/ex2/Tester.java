package _3_java_proffessional.homework06.ex2;

import java.util.ArrayList;
import java.util.List;

class Tester {
    public static void main(String[] args) {
        CalculatorAdapter calculator = new CalculatorAdapter();
        System.out.println(calculator.getPI());
        System.out.println(calculator.plus(100, 200));
        System.out.println(calculator.minus(100, 200));
        System.out.println(calculator.multiply(100, 200));
        System.out.println(calculator.factorial(5));
        System.out.println(calculator.arraySum(100, 200, 300, 1));
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(11);list.add(100);list.add(10);
        System.out.println(calculator.listSum(list));
    }
}
