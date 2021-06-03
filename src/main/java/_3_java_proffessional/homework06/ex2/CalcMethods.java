package _3_java_proffessional.homework06.ex2;

import java.util.List;

interface CalcMethods {

    int plus(int a, int b);

    int minus(int a, int b);

    int multiply(int a, int b);

    int arraySum(int... elems);

    int listSum(List<Integer> list);

    int factorial(int num);

    double getPI();
}
