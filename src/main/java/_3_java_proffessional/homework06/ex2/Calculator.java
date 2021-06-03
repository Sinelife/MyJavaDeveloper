package _3_java_proffessional.homework06.ex2;

import java.util.List;

class Calculator implements CalcMethods{

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int arraySum(int... elems) {
        int sum = 0;
        for (int elem : elems) {
            sum += elem;
        }
        return sum;
    }

    public int listSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }

    public int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    @Override
    public double getPI() {
        return Math.PI;
    }
}
