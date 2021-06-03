package _1_java_starter.homework04.easy;

import java.util.Arrays;

class TesterEasy {
    public static void main(String[] args) {
        /**EX1*/
        System.out.println("\n\n\nEX1");
        for (int i = 0; i < 10; i++) {
            System.out.println("fibbonachi["  + i +  "] = "+ MethodsEasy.fibbonachi(i));
        }


        /**EX2*/
        System.out.println("\n\n\nEX2");
        int a = 100; int b = 12;
        System.out.println(a + " + " + b + " = " + MethodsEasy.sum(a,b));


        /**EX3*/
        System.out.println("\n\n\nEX3");
        int[] arr3 = {1,4,6,10,-5};
        System.out.println(Arrays.toString(arr3));
        System.out.println("Sum = " + MethodsEasy.sumOfArray(arr3));


        /**EX4*/
        System.out.println("\n\n\nEX4");
        int[] arr4 = {1,4,6,10,-5};
        System.out.println(Arrays.toString(arr4));
        System.out.println("Average = " + MethodsEasy.averageOfArray(arr4));


        /**EX5*/
        System.out.println("\n\n\nEX5");
        int[] arr5 = {1,4,6,10,-5,-6,};
        System.out.println(Arrays.toString(arr5));
        System.out.println(MethodsEasy.ex5(arr5));


        /**EX6*/
        System.out.println("\n\n\nEX6");
        int[] arr6 = {1,4,6,10,-5,-6,};
        System.out.println(Arrays.toString(arr6));
        System.out.println(MethodsEasy.maxOfArray(arr6));


        /**EX7*/
        System.out.println("\n\n\nEX7");
        double[] complex1 = {1,10};
        double[] complex2 = {4,-3};
        MethodsEasy.complexOutput(complex1);
        MethodsEasy.complexOutput(complex2);
        double[] complexSum = MethodsEasy.complexSum(complex1, complex2);
        MethodsEasy.complexOutput(complexSum);


        /**EX8*/
        System.out.println("\n\n\nEX8");
        for (int i = 0; i < 10; i++) {
            System.out.println(MethodsEasy.pow(i,3));
        }


        /**EX9*/
        System.out.println("\n\n\nEX9");
        int c = 10;
        int d = 12;
        System.out.println("d = " + d);
        System.out.println("c = " + c);
        System.out.println("d > c? - " + MethodsEasy.isBigger(c, d));
        System.out.println("c > d? - " + MethodsEasy.isBigger(d, c));


        /**EX10*/
        System.out.println("\n\n\nEX10");
        int[][] arr10 = {{0,6,8},{1,2,4},{1,11,12}};
        MethodsEasy.output(arr10);
    }
}
