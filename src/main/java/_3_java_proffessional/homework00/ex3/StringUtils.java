package _3_java_proffessional.homework00.ex3;

public class StringUtils {

    public static boolean firstWordIsLess(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        for (int i = 0; i < cycleLength(str1, str2); i++) {
            return chars1[i] < chars2[i];
        }
        return false;
    }

    private static int cycleLength(String str1, String str2) {
        int cycleLength;
        if (str1.length() > str2.length()) {
            cycleLength = str2.length();
        } else {
            cycleLength = str1.length();
        }
        return cycleLength;
    }
}
