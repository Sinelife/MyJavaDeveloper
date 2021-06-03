package _1_java_starter.homework04;

import java.util.Scanner;

class APolindrom {
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        char[] arrays = word.toCharArray();
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] != arrays[arrays.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        System.out.println(APolindrom.isPalindrome(word));
    }
}
