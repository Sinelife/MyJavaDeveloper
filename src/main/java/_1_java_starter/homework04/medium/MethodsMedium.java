package _1_java_starter.homework04.medium;

import _1_java_starter.homework04.easy.MethodsEasy;

public class MethodsMedium {

    /**EX11*/
    public static int[] fibbonachiAll(int digit){
        int[] result = new int[digit];
        for (int i = 0; i < result.length; i++) {
            result[i] = MethodsEasy.fibbonachi(i);
        }
        return result;
    }

    /**EX12*/
    public static String calculator(int a, int b, char op){
        switch(op){
            case '+':
                return String.valueOf(a + b);
            case '-':
                return String.valueOf(a - b);
            case '*':
                return String.valueOf(a * b);
            case '/':
                if(b == 0){
                   return "Ошибка.Делить на ноль нельзя!!!";
                }
                return String.valueOf(a / b);
        }
        return "Ошибка.Такой операции нет.";
    }

    /**EX13*/
    public static int indexMaxOfArray(int[] array){
        int maxIndex = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int[] ex13(int[] array){
        int max = MethodsEasy.maxOfArray(array);
        for (int i = 0; i < array.length; i++) {
            if(max == array[i]){
                array[i] *= 10;
            }
        }
        return array;
    }

    /**EX14*/
    public static int indexMinOfArray(int[] array){
        int minIndex = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static int[] swapMaxMinOfArray(int[] array){
        int maxIndex = indexMaxOfArray(array);
        int minIndex = indexMinOfArray(array);
        swap(array, maxIndex, minIndex);
        return array;
    }

    /**EX15*/
    public static int secondMax(int[] array){
        int max = MethodsEasy.maxOfArray(array);
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if(secondMax < array[i] && array[i] < max){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    /**EX16*/
    public static int[] sumOfSmallerAndBiggerArray(int[] a, int[] b){
        int[] sum = new int[b.length];
        int i = 0;
        for (; i < a.length; i++) {
            sum[i] = a[i] + b[i];
        }
        for(; i < b.length; i++){
            sum[i] = b[i];
        }
        return sum;
    }
    public static int[] sumTwoArrays(int[] a, int[] b){
        int[] sum;
        if(a.length <= b.length){
            sum = sumOfSmallerAndBiggerArray(a, b);
        }
        else {
            sum = sumOfSmallerAndBiggerArray(b, a);
        }
        return sum;
    }


    /**EX17*/
    public static int indexSecondMax(int[] array){
        int secondMax = secondMax(array);
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if(secondMax == array[i]){
                result = i;
                break;
            }
        }
        return result;
    }
    public static int ex17(int[] array){
        return indexMaxOfArray(array) + indexMinOfArray(array) + indexSecondMax(array);
    }

    /**EX18*/
    public static void drawLine(int size){
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void drawTwoSymbolsWithSpacesBetween(int size){
        for (int i = 0; i < size; i++) {
            if(i == 0 || i == size - 1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void drawRectangle(int width, int height){
        for (int i = 0; i < height; i++) {
            if(i == 0 || i == height - 1){
                drawLine(width);
            }
            else{
                drawTwoSymbolsWithSpacesBetween(width);
            }
        }
    }

    /**EX19*/
    public static void drawTriangle(int a, int height) {
        drawLine(1);
        drawMiddleTriangle(a, height);
        drawLine(a);
    }

    public static void drawMiddleTriangle(int down, int height){
        for (int i = 0; i < height; i++) {
            int temp = (i * down / height);
            System.out.print("*");
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }


    /**EX20*/
    public static int sumOfAllArraysElements(int[]... arrayOfArrays){
        int sum = 0;
        for (int i = 0; i < arrayOfArrays.length; i++) {
            sum += MethodsEasy.sumOfArray(arrayOfArrays[i]);
        }
        return sum;
    }
}
