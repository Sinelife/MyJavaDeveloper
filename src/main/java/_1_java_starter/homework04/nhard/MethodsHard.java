package _1_java_starter.homework04.nhard;

import _1_java_starter.homework04.easy.MethodsEasy;
import _1_java_starter.homework04.medium.MethodsMedium;

class MethodsHard {

    /**
     * EX21
     */

    public static double[] devideComplex(double[] a, double[] b) {
        double[] result = new double[2];
        result[0] = ((a[0] * b[0]) + (a[1] * b[1])) / (b[0] * b[0] + b[1] * b[1]);
        result[1] = ((b[0] * a[1]) - (b[1] * a[0])) / (b[0] * b[0] + b[1] * b[1]);
        return result;
    }

    /**
     * EX22
     */
    public static int recursiveFib(int digit) {
        if (digit == 0) {
            return 0;
        }
        if (digit == 1) {
            return 1;
        }
        return recursiveFib(digit - 1) + recursiveFib(digit - 2);
    }

    /**
     * EX23
     */
    public static int recursivePow(int digit, int digitPow) {
        if (digitPow == 0) {
            return 1;
        }
        return recursivePow(digit, --digitPow) * digit;
    }

    /**
     * EX24
     */
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    MethodsMedium.swap(array, i, j);
                }
            }
        }
        return array;
    }


    /**
     * EX25
     */
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                MethodsMedium.swap(array, j, j - 1);
                j--;
            }
        }
        return array;
    }


    /**
     * EX26
     */
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = i;
                    MethodsMedium.swap(array, j, minIndex);
                }
            }
        }
        return array;
    }


    /**
     * EX27
     */
    public static void drawTrapetion(int up, int down, int h) {
        MethodsMedium.drawLine(up);
        drawMiddleTrapetion(up, down, h);
        MethodsMedium.drawLine(down);
    }

    public static void drawMiddleTrapetion(int up, int down, int height){
        for (int i = 0; i < height - 1; i++) {
            int temp = (i * (down - up) / height) + (up - 1);
            System.out.print("*");
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    /**
     * EX28
     */
    public static int[][] ex28(int[] array) {
        int[] uniqueElements = new int[array.length];
        uniqueElements[0] = array[0];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= counter; j++) {
                if (array[i] == uniqueElements[j]) {
                    break;
                }
                if (array[i] != uniqueElements[j] && j == counter) {
                    counter++;
                    uniqueElements[counter] = array[i];
                }
            }
        }
        counter++;
        int[][] result = new int[counter][2];
        for (int i = 0; i < counter; i++) {
            result[i][0] = uniqueElements[i];
            for (int j = 0; j < array.length; j++) {
                if (uniqueElements[i] == array[j]) {
                    result[i][1]++;
                }
            }
        }
        return result;
    }

    /**
     * EX29
     */
    public static int[][] matrixSum(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    /**
     * EX30
     */
    public static int[] ex30(int[]... arrayOfArrays) {
        int[] result = new int[arrayOfArrays.length * 4];
        for (int i = 0, j = 0; i < arrayOfArrays.length; i++, j += 4) {
            result[j] = MethodsEasy.sumOfArray(arrayOfArrays[i]);
            result[j + 1] = indexArraySum(arrayOfArrays[i].length);
            result[j + 2] = MethodsEasy.maxOfArray(arrayOfArrays[i]);
            result[j + 3] = minOfArray(arrayOfArrays[i]);
        }
        return result;
    }


    public static int indexArraySum(int length) {
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += i;
        }
        return result;
    }


    public static int minOfArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
