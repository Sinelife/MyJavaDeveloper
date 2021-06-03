package _1_java_starter.homework04;

class Methods {
    /**
     * EX1
     */
    public static int fibbonachi(int digit) {
        if (digit == 0) {
            return 0;
        }
        if (digit == 1) {
            return 1;
        }
        int a0 = 0;
        int a1 = 1;
        int res;
        for (int i = 1; i < digit; i++) {
            int temp = a1 + a0;
            a0 = a1;
            a1 = temp;
        }
        return a1;
    }

    /**
     * EX2
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * EX3
     */
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * EX4
     */
    public static double averageOfArray(int[] array) {
        return (double) sumOfArray(array) / array.length;
    }

    /**
     * EX5
     */
    public static int ex5(int[] array) {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                result *= array[i];
            }
        }
        return result;
    }

    /**
     * EX6
     */
    public static int maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * EX7
     */
    public static double[] complexSum(double[] a, double[] b) {
        double[] sum = new double[2];
        sum[0] = a[0] + b[0];
        sum[1] = a[1] + b[1];
        return sum;
    }

    public static void complexOutput(double[] a) {
        if (a[1] < 0) {
            System.out.println(a[0] + "" + a[1] + "i");
        } else {
            System.out.println(a[0] + " + " + a[1] + "i");
        }
    }

    /**
     * EX8
     */
    public static int pow(int digit, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= digit;
        }
        return result;
    }

    /**
     * EX9
     */
    public static boolean isBigger(int a, int b) {
        if (b > a) {
            return true;
        }
        return false;
    }

    /**
     * EX10
     */
    public static void output(int[][] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[0].length - 1) {
                    System.out.print(", ");
                }
            }
            if (i != array.length - 1) {
                System.out.println("]");
            } else {
                System.out.print("]");
            }
        }
        System.out.println("]");
    }


    /**
     * EX11
     */
    public static int[] fibbonachiAll(int digit) {
        int[] result = new int[digit];
        for (int i = 0; i < result.length; i++) {
            result[i] = fibbonachi(i);
        }
        return result;
    }

    /**
     * EX12
     */
    public static double calculator(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;
    }

    /**
     * EX13
     */
    public static int indexMaxOfArray(int[] array) {
        int maxIndex = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void ex13(int[] array) {
        array[indexMaxOfArray(array)] *= 10;
    }

    /**
     * EX14
     */
    public static int indexMinOfArray(int[] array) {
        int minIndex = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swapMaxMinOfArray(int[] array) {
        int maxIndex = indexMaxOfArray(array);
        int minIndex = indexMinOfArray(array);
        swap(array, maxIndex, minIndex);

    }

    /**
     * EX15
     */
    public static int secondMax(int[] array) {
        int max = array[0];
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                secondMax = array[i];
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (secondMax < array[i] && array[i] < max) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    /**
     * EX16
     */
    public static int[] sumTwoArrays(int[] a, int[] b) {
        int[] sum;
        if (a.length <= b.length) {
            sum = new int[b.length];
            for (int i = 0; i < a.length; i++) {
                sum[i] = a[i] + b[i];
            }
            for (int i = a.length - 1; i < b.length; i++) {
                sum[i] = b[i];
            }
        } else {
            sum = new int[a.length];
            for (int i = 0; i < b.length; i++) {
                sum[i] = a[i] + b[i];
            }
            for (int i = b.length - 1; i < a.length; i++) {
                sum[i] = a[i];
            }
        }
        return sum;
    }

    /**
     * EX17
     */
    public static int indexSecondMax(int[] array) {
        int secondMax = secondMax(array);
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (secondMax == array[i]) {
                result += i;
                break;
            }
        }
        return result;
    }

    public static int ex17(int[] array) {
        return indexMaxOfArray(array) + indexMinOfArray(array) + indexSecondMax(array);
    }

    /**
     * EX18
     */
    public static void drawLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawTwoSymbolsWithSpacesBetween(int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                drawLine(width);
            } else {
                drawTwoSymbolsWithSpacesBetween(width);
            }
        }
    }

    /**
     * EX19
     */
    public static void drawTriangle(int a, int height) {
        drawLine(1);
        drawMiddleTriangle(a, height);
        drawLine(a);
    }

    public static void drawMiddleTriangle(int down, int height){
        for (int i = 0; i < height; i++) {
            int temp = (i * down / height) + 1;
            System.out.print("*");
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    /**
     * EX20
     */
    public static int sumOfAllArraysElements(int[]... arrayOfArrays) {
        int sum = 0;
        for (int i = 0; i < arrayOfArrays.length; i++) {
            sum += sumOfArray(arrayOfArrays[i]);
        }
        return sum;
    }


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
                    swap(array, i, j);
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
                swap(array, j, j - 1);
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
                    swap(array, j, minIndex);
                }
            }
        }
        return array;
    }


    /**
     * EX27
     */
    public static void drawTrapetion(int up, int down, int h) {
        drawLine(up);
        drawMiddleTrapetion(up, down, h);
        drawLine(down);
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
            result[j] = sumOfArray(arrayOfArrays[i]);
            result[j + 1] = indexArraySum(arrayOfArrays[i].length);
            result[j + 2] = maxOfArray(arrayOfArrays[i]);
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
    public static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static void mergeSort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    public static int[] mergeSort(int[] array){
        mergeSort(array, 0, array.length - 1);
        return array;
    }
}