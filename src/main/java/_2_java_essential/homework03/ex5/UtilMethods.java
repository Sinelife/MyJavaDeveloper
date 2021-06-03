package _2_java_essential.homework03.ex5;

import _2_java_essential.homework03.ex5.shapes.Shape;

public class UtilMethods {

    private static String getSmallerWord(String word1, String word2){
        return word1.length() <= word2.length() ? word1 : word2;
    }

    public static boolean firstLessOrEquals(String word1, String word2){
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        String smallerWord = getSmallerWord(word1, word2);
        for (int i = 0; i < smallerWord.length(); i++) {
            if(chars1[i] < chars2[i]){
                return true;
            } else if(chars1[i] > chars2[i]){
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swap(Shape[] array, int i, int j) {
        Shape temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
