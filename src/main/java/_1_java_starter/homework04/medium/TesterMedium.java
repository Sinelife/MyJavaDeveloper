package _1_java_starter.homework04.medium;

import java.util.Arrays;

class TesterMedium {
    public static void main(String[] args) {

        /**EX11*/
        System.out.println("\n\n\nEX11");
        int[] array = MethodsMedium.fibbonachiAll(10);
        System.out.println(Arrays.toString(array));


        /**EX12*/
        System.out.println("\n\n\nEX12");
        System.out.println(MethodsMedium.calculator(10, 10, '+'));
        System.out.println(MethodsMedium.calculator(100, 10, '-'));
        System.out.println(MethodsMedium.calculator(10, 20, '*'));
        System.out.println(MethodsMedium.calculator(1000, 25, '/'));
        System.out.println(MethodsMedium.calculator(10, 0, '/'));


        /**EX13*/
        System.out.println("\n\n\nEX13");
        int[] arr1 = {1,4,7,9,11,-8,0,-9,4};
        System.out.println(Arrays.toString(arr1));
        MethodsMedium.ex13(arr1);
        System.out.println(Arrays.toString(arr1));


        /**EX14*/
        System.out.println("\n\n\nEX14");
        System.out.println(Arrays.toString(arr1));
        MethodsMedium.swapMaxMinOfArray(arr1);
        System.out.println(Arrays.toString(arr1));


        /**EX15*/
        System.out.println("\n\n\nEX15");
        System.out.println("Второе макстимальное -" + MethodsMedium.secondMax(arr1));


        /**EX16*/
        System.out.println("\n\n\nEX16");
        int[] arr2 = {1,2,3,4,5,6,7,8};
        int[] arr3 = {2,2,2,4,4,4,-10};
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(MethodsMedium.sumTwoArrays(arr2,arr3)));


        /**EX17*/
        System.out.println("\n\n\nEX17");
        System.out.println(Arrays.toString(arr2));
        System.out.println(MethodsMedium.ex17(arr2));


        /**EX18*/
        System.out.println("\n\n\nEX18");
        MethodsMedium.drawRectangle(10,7);


        /**EX19(не работает)*/
        System.out.println("\n\n\nEX19");
        MethodsMedium.drawTriangle(20, 13);



        /**EX20*/
        System.out.println("\n\n\nEX20");
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println("Сума всех элементов всех масивов - " + MethodsMedium.sumOfAllArraysElements(arr2, arr2, arr3));

    }

}
