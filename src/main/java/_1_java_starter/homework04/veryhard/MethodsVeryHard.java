package _1_java_starter.homework04.veryhard;

import java.util.Random;

class MethodsVeryHard {

    /**
     * EX31
     */
    public static int[][] ex31(int[] array, int n) {
        int numOfArrays = array.length / n;
        int[][] resultArray = new int[n][numOfArrays];
        for (int i = 0; i < n; i++) {
            resultArray[i] = getEveryNElementFromArrayFromElement(array, n, i);
        }
        return resultArray;
    }

    public static int[] getEveryNElementFromArrayFromElement(int[] array, int n, int from) {
        int counter = 0;
        for (int i = from; i < array.length; i += n) {
            counter++;
            if (i + n > array.length - 1) {
                break;
            }
        }
        int[] result = new int[counter];
        int j = 0;
        int i = from;
        while (j < counter) {
            result[j] = array[i];
            j++;
            i += n;
        }
        return result;
    }


    /**
     * EX32
     */
    public static int recursiveArrayElementSum(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int[] newArray = getArrayFrom(array, 1);
        return recursiveArrayElementSum(newArray) + array[0];
    }

    public static int[] getArrayFrom(int[] array, int from) {
        int[] result = new int[array.length - from];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i + from];
        }
        return result;
    }


    /**
     * EX33
     */
    public static int recursiveMaxElementOfArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return recursiveMaxElementOfArray(array, array[0]);
    }

    public static int recursiveMaxElementOfArray(int[] array, int max) {
        if (array.length == 1) {
            return max;
        }
        int[] newArray = getArrayFrom(array, 1);
        if (array[0] > max) {
            max = array[0];
        }
        return recursiveMaxElementOfArray(newArray, max);
    }


    /**EX34*/
    public static int[][] matrixMultiply(int[][] matrixA, int[][] matrixB) {
        int[][] resultMatrix = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return resultMatrix;
    }




    /**EX35*/
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[i]) {
                    swap(array, i, j);
                }
            }
        }
    }

    private static void bubbleSort(char[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[i]) {
                    swap(array, i, j);
                }
            }
        }
    }

    private static void bubbleSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[i]) {
                    swap(array, i, j);
                }
            }
        }
    }


    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    private static void insertionSort(char[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    private static void insertionSort(double[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }


    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    private static void selectionSort(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    private static void selectionSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }


    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    private static long getTimeOfSorting(char[] chars, String sortType) {
        long start = System.currentTimeMillis();
        switch (sortType) {
            case "bubble":
                bubbleSort(chars);
                break;
            case "insertion":
                insertionSort(chars);
                break;
            default:
                selectionSort(chars);
                break;
        }
        return System.currentTimeMillis() - start;
    }

    private static long getTimeOfSorting(int[] ints, String sortType) {
        long start = System.currentTimeMillis();
        switch (sortType) {
            case "bubble":
                bubbleSort(ints);
                break;
            case "insertion":
                insertionSort(ints);
                break;
            default:
                selectionSort(ints);
                break;
        }
        return System.currentTimeMillis() - start;
    }

    private static long getTimeOfSorting(double[] doubles, String sortType) {
        long start = System.currentTimeMillis();
        switch (sortType) {
            case "bubble":
                bubbleSort(doubles);
                break;
            case "insertion":
                insertionSort(doubles);
                break;
            default:
                selectionSort(doubles);
                break;
        }
        return System.currentTimeMillis() - start;
    }


    private static char[] getGeneratedCharArray(int size) {
        Random rand = new Random();
        char[] chars = new char[size];
        for (int i = 0; i < size; i++) {
            chars[i] = (char) (rand.nextInt(120));
        }
        return chars;
    }

    private static int[] getGeneratedIntArray(int size) {
        Random rand = new Random();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = rand.nextInt(120_000);
        }
        return ints;
    }

    private static double[] getGeneratedDoubleArray(int size) {
        Random rand = new Random();
        double[] doubles = new double[size];
        for (int i = 0; i < size; i++) {
            doubles[i] = rand.nextDouble();
        }
        return doubles;
    }


    private static void outputCharTable(String[] types, int... sizes) {
        System.out.println("\n\n\n------------------CHARS------------------------------------");
        for (int size : sizes) {
            System.out.print("Size: " + size);
            for (String type : types) {
                System.out.print("    " + type.toUpperCase() + ": " + getTimeOfSorting(getGeneratedCharArray(size), type) + " milliseconds");
            }
            System.out.println();
        }
    }

    private static void outputIntTable(String[] types, int... sizes) {
        System.out.println("\n\n\n------------------INTEGERS------------------------------------");
        for (int size : sizes) {
            System.out.print("Size: " + size);
            for (String type : types) {
                System.out.print("    " + type.toUpperCase() + ": " + getTimeOfSorting(getGeneratedIntArray(size), type) + " milliseconds");
            }
            System.out.println();
        }
    }

    private static void outputDoubleTable(String[] types, int... sizes) {
        System.out.println("\n\n\n------------------DOUBLES------------------------------------");
        for (int size : sizes) {
            System.out.print("Size: " + size);
            for (String type : types) {
                System.out.print("    " + type.toUpperCase() + ": " + getTimeOfSorting(getGeneratedDoubleArray(size), type) + " milliseconds");
            }
            System.out.println();
        }
    }

    static void outputAllTables(int... sizes) {
        final String[] types = {"bubble", "insertion", "selection"};
        outputCharTable(types, sizes);
        outputIntTable(types, sizes);
        outputDoubleTable(types, sizes);

    }
}
