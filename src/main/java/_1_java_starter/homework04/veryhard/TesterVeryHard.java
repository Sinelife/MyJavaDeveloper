package _1_java_starter.homework04.veryhard;

import _1_java_starter.homework04.easy.MethodsEasy;

import java.util.Arrays;


class TesterVeryHard {
    public static void main(String[] args) {

        /**EX31*/
        System.out.println("\n\n\nEX31");
        int[] arr31 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr31));
        int[][] result31 = MethodsVeryHard.ex31(arr31,3);
        System.out.println(Arrays.deepToString(result31));


        /**EX32*/
        System.out.println("\n\n\nEX32");
        int[] arr32 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr32));
        System.out.println("Sum = " + MethodsVeryHard.recursiveArrayElementSum(arr32));


        /**EX33*/
        System.out.println("\n\n\nEX33");
        int[] arr33 = {-100,34,0,12,13,5,-6};
        System.out.println(Arrays.toString(arr33));
        System.out.println("Max = " + MethodsVeryHard.recursiveMaxElementOfArray(arr33));


        /**EX34*/
        System.out.println("\n\n\nEX34");
        int[][] matrix1 = {{1,2,1},
                           {3,1,2}};
        int[][] matrix2 = {{1,2},
                           {1,1},
                           {2,1}};
        int[][] mtr1 = {{1,2,3},{3,4,5},{3,2,1}};
        int[][] mtr2 = {{5,6,1},{7,8,2},{4,1,5}};
        int[][] resultMatrix = MethodsVeryHard.matrixMultiply(mtr1, mtr2);
        MethodsEasy.output(mtr1);
        System.out.println();
        MethodsEasy.output(mtr2);
        System.out.println();
        MethodsEasy.output(resultMatrix);


        /**EX35*/
        System.out.println("\n\n\nEX35");
        MethodsVeryHard.outputAllTables(1_000, 10_000, 100_000);
    }
}
