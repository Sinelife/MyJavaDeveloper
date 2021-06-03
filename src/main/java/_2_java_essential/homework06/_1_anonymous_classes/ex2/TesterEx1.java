package _2_java_essential.homework06._1_anonymous_classes.ex2;

import java.util.*;

class TesterEx1 {
    public static void main(final String[] args) {

        MyFunctions functions1 = new MyFunctions() {
            @Override
            public int increment(int n) {
                return ++n;
            }

            @Override
            public int decrement(int n) {
                return --n;
            }

            @Override
            public int twoIntsFunc(int a, int b) {
                return a + b;
            }

            @Override
            public int arrayFunc(int... array) {
                int sum = 0;
                for (int value : array) {
                    sum += value;
                }
                return sum;
            }

            @Override
            public void output(String message) {
                System.out.println("Стандартные функции");
            }
        };

        MyFunctions functions2 = new MyFunctions() {
            @Override
            public int increment(int n) {
                return n + 10;
            }

            @Override
            public int decrement(int n) {
                return n - 10;
            }

            @Override
            public int twoIntsFunc(int a, int b) {
                return a * b;
            }

            @Override
            public int arrayFunc(int... array) {
                int res = 1;
                for (int value : array) {
                    res *= value;
                }
                return res;
            }

            @Override
            public void output(String message) {
                System.out.println("Другие функции " + message);
            }
        };

        MyFunctions functions3 = new MyFunctions() {
            @Override
            public int increment(int n) {
                return 0;
            }

            @Override
            public int decrement(int n) {
                return 0;
            }

            @Override
            public int twoIntsFunc(int a, int b) {
                int result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                return result;
            }

            @Override
            public int arrayFunc(int... array) {
                int max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if(max < array[i]){
                        max = array[i];
                    }
                }
                return max;
            }

            @Override
            public void output(String message) {
                System.out.println("Совсем другие функции " + message);
            }
        };

        int n = 2;
        int m = 10;
        int[] array = {1,4,5,3,2};
        String message = "!!!!";

        /**Тест для functions1*/
        System.out.println("\n\n\nFunctions1");
        System.out.println("increment(" + n + ") = " + functions1.increment(n));
        System.out.println("decrement(" + n + ") = " + functions1.decrement(n));
        System.out.println("twoIntsFunc(" + n + ", " + m + ") = " + functions1.twoIntsFunc(n,m));
        System.out.println("arrayFunc(" + Arrays.toString(array) + ") = " + functions1.arrayFunc(array));
        functions1.output(message);



        /**Тест для functions2*/
        System.out.println("\n\n\nFunctions2");
        System.out.println("increment(" + n + ") = " + functions2.increment(n));
        System.out.println("decrement(" + n + ") = " + functions2.decrement(n));
        System.out.println("twoIntsFunc(" + n + ", " + m + ") = " + functions2.twoIntsFunc(n,m));
        System.out.println("arrayFunc(" + Arrays.toString(array) + ") = " + functions2.arrayFunc(array));
        functions2.output(message);



        /**Тест для functions3*/
        System.out.println("\n\n\nFunctions3");
        System.out.println("increment(" + n + ") = " + functions3.increment(n));
        System.out.println("decrement(" + n + ") = " + functions3.decrement(n));
        System.out.println("twoIntsFunc(" + n + ", " + m + ") = " + functions3.twoIntsFunc(n,m));
        System.out.println("arrayFunc(" + Arrays.toString(array) + ") = " + functions3.arrayFunc(array));
        functions3.output(message);
    }
}
