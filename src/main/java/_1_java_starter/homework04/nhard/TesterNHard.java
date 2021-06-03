package _1_java_starter.homework04.nhard;

import _1_java_starter.homework04.easy.MethodsEasy;

import java.util.Arrays;

class TesterNHard {
    public static void main(String[] args) {

        /**EX21*/
        System.out.println("\n\n\nEX21");
        double[] complex1 = {10,5};
        double[] complex2 = {2,3};
        MethodsEasy.complexOutput(complex1);
        MethodsEasy.complexOutput(complex2);
        double[] devideComplex = MethodsHard.devideComplex(complex1,complex2);
        MethodsEasy.complexOutput(devideComplex);


        /**EX22*/
        System.out.println("\n\n\nEX22");
        for (int i = 0; i < 10; i++) {
            System.out.println("fib[" + i + "] = " + MethodsHard.recursiveFib(i));
        }


        /**EX23*/
        System.out.println("\n\n\nEX23");
        for (int i = 0; i < 10; i++) {
            System.out.println("pow(2, " + i + ") = " + MethodsHard.recursivePow(2,i));
        }


        /**EX24*/
        System.out.println("\n\n\nEX24");
        int[] ar1 = {3, 0, 9, 1, 5, 7, -4, -2, -9};
        System.out.println("Not sorted" + Arrays.toString(ar1));
        System.out.println("Sorted" + Arrays.toString(MethodsHard.bubbleSort(ar1)));


        /**EX25*/
        System.out.println("\n\n\nEX25");
        int[] ar2 = {3, 0, 9, 1, 5, 7, -4, -2, -9};
        System.out.println("Not sorted" + Arrays.toString(ar2));
        System.out.println("Sorted" + Arrays.toString(MethodsHard.insertionSort(ar2)));



        /**EX26*/
        System.out.println("\n\n\nEX26");
        int[] ar3 = {3, 0, 9, 1, 5, 7, -4, -2, -9};
        System.out.println("Not sorted" + Arrays.toString(ar3));
        System.out.println("Sorted" + Arrays.toString(MethodsHard.selectionSort(ar3)));



        /**Ex27*/
        System.out.println("\n\n\nEX27");
        MethodsHard.drawTrapetion(15,25,7);


        /**Ex28*/
        System.out.println("\n\n\nEX28");
        int[] arr28 = {1,3,5,7,8,8,8,0,-1,6,3,1};
        System.out.println(Arrays.toString(arr28));
        int[][] uniqueElem = MethodsHard.ex28(arr28);
        for (int i = 0; i < uniqueElem.length; i++) {
            System.out.println("Число " + uniqueElem[i][0] + " встречаеться " + uniqueElem[i][1] + " раз");
        }


        /**EX29*/
        System.out.println("\n\n\nEX29");
        int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{0,10,0},{1,1,1},{2,2,3}};
        System.out.println("a - " + Arrays.deepToString(array1));
        System.out.println("b - " + Arrays.deepToString(array2));
        System.out.println("sum - " + Arrays.deepToString(MethodsHard.matrixSum(array1,array2)));



        /**EX30*/
        System.out.println("\n\n\nEX30");
        int[] arr1 = {1,4,7,8};
        int[] arr2 = {4,2,0};
        System.out.println("EX30 = " + Arrays.toString(MethodsHard.ex30(arr1, arr2)));
    }
}
