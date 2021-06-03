package _1_java_starter.homework04.easy;

public class MethodsEasy {
    /**EX1*/
    public static int fibbonachi(int digit) {
        if (digit == 0) {
            return 0;
        }
        if (digit == 1) {
            return 1;
        }
        int a0 = 0;
        int a1 = 1;
        for (int i = 1; i < digit; i++) {
            int temp = a1 + a0;
            a0 = a1;
            a1 = temp;
        }
        return a1;
    }

    /**EX2*/
    public static int sum(int a, int b) {
        return a + b;
    }

    /**EX3*/
    public static int sumOfArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**EX4*/
    public static double averageOfArray(int[] array){
        return (double)sumOfArray(array) / array.length;
    }

    /**EX5*/
    public static int ex5(int[] array){
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 3 == 0){
                result *= array[i];
            }
        }
        return result;
    }

    /**EX6*/
    public static int maxOfArray(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    /**EX7*/
    public static double[] complexSum(double[] a, double[] b){
        double[] sum = new double[2];
        sum[0] = a[0] + b[0];
        sum[1] = a[1] + b[1];
        return sum;
    }
    public static void complexOutput(double[] a){
        if(a[1] < 0){
            System.out.println(a[0] + "" +  a[1] + "i");
        }
        else {
            System.out.println(a[0] + " + " + a[1] + "i");
        }
    }

    /**EX8*/
    public static int pow(int digit, int n){
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= digit;
        }
        return result;
    }

    /**EX9*/
    public static boolean isBigger(int a, int b){
        if(b > a){
            return true;
        }
        return false;
    }

    /**EX10*/
    public static void output(int[][] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
                if(j != array[0].length - 1){
                    System.out.print(", ");
                }
            }
            if(i != array.length - 1) {
                System.out.println("]");
            }
            else{
                System.out.print("]");
            }
        }
        System.out.println("]");
    }

}
