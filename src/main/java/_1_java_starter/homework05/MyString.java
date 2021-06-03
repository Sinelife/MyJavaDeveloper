package _1_java_starter.homework05;

import java.util.Arrays;

public class MyString {

    /**
     * subString (от и до) - метод для вывода подстроки от елемента from до елемента  строки str
     */
    private static String subString(String str, int from, int to) {
        if (from < 0) {
            return "Ошибка ввода.Нижняя граница меньше нуля.";
        }
        if (to > str.length()) {
            return "Ошибка ввода.Верхняя граница больше длины строки.";
        }
        if (to < from) {
            return "Ошибка ввода.Нижняя граница больше верхней границы.";
        }
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = from; i < to; i++) {
            result += chars[i];
        }
        return result;
    }

    /**
     * subString (от) - метод для вывода подстроки от елемента from до конца строки str
     */
    private static String subString(int from, String str) {
        return subString(str, from, str.length());
    }

    /**
     * subString (до) - метод для вывода подстроки от начала и до елемента to строки str
     */
    private static String subString(String str, int to) {
        return subString(str, 0, to);
    }


    /**
     * trim - метод, который возвращает строку без пробелов в начале и конце строки
     */
    private static String trim(String str) {
        char[] chars = str.toCharArray();
        int newStart = 0;
        while (newStart < chars.length && chars[newStart] == ' ') {
            newStart++;
        }
        int newEnd = chars.length - 1;
        while (newStart < newEnd && chars[newEnd] == ' ') {
            newEnd--;
        }
        return subString(str, newStart, newEnd);
    }

    /**
     * trim (обрезать и внутринние) - метод,который возвращает строку без пробелов
     * в начале и конце строки. Также убирает лишние пробелы между словами если передаваемая
     * переменная deleteInsideToo == true
     */
    public static String trim(String str, boolean deleteInsideToo) {
        if (!deleteInsideToo) {
            return trim(str);
        }
        str = trim(str);
        String result = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
            if (chars[i] == ' ') {
                while (chars[i] == ' ') {
                    i++;
                }
                i--;
            }
        }
        return result;
    }


    /**
     * indexOf - метод для нахождения индекса первого вхождения элемента elem в строку
     */
    private static int indexOf(String str, char elem) {
        return indexOf(str, elem, 0);
    }

    /**
     * indexOf (от) - метод для нахождения индекса первого вхождения элемента elem в строку
     * начиная с элемента с индексом from
     */
    private static int indexOf(String str, char elem, int from) {
        char[] chars = str.toCharArray();
        if (from > chars.length) {
            return -1;
        }
        for (int i = from; i < chars.length; i++) {
            if (chars[i] == elem) {
                return i;
            }
        }
        return -1;
    }

    /**
     * lastIndexOf - метод для нахождения индекса последнего вхождения элемента elem в строку
     */
    private static int lastIndexOf(String str, char elem) {
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i] == elem) {
                return i;
            }
        }
        return -1;
    }


    /**
     * contains - метод для проверки на то входит ли вторая строка в первую
     */
    private static boolean contains(String strMain, String strSub) {
        return contains(strMain, strSub, 0);
    }

    /**
     * contains (от) - метод для проверки на то входит ли вторая строка в
     * подстроку первой строки, которая начинаеться с элемента с индексом from
     */
    private static boolean contains(String strMain, String strSub, int from) {
        String newStrMain = subString(from, strMain);
        if (strSub.length() > newStrMain.length()) {
            return false;
        }
        if(newStrMain.equals(strSub)) {
            return true;
        }
        char[] charsMain = newStrMain.toCharArray();
        char[] charsSub = strSub.toCharArray();
        int j = 0;
        for (int i = 0; i < charsMain.length; i++) {
            if (j == charsSub.length) {
                return true;
            }
            if (charsMain[i] != charsSub[j]) {
                j = 0;
            } else {
                j++;
            }
        }
        return false;
    }


    /**
     * toString(int[] arr) - метод для виводу масиву
     */
    private static String toString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            result += arr[i] + ", ";
        }
        result += arr[arr.length - 1] + "]";
        return result;
    }


    /**
     * replaceFirst - метод для замены первого вхождения слова на новое
     */
    private static String replaceFirst(String str, String oldWord, String newWord) {
        if (!contains(str, oldWord)) {
            System.out.println("Ошибка. Такого слова нет в строке");
            return str;
        }
        char[] chars = str.toCharArray();
        char[] charsOfOldWord = oldWord.toCharArray();
        int startOfOldWordIndex = indexOf(str, charsOfOldWord[0]);
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if (j == charsOfOldWord.length - 1) {
                //startOfOldWordIndex = i - charsOfOldWord.length + 1;
                break;
            }
            if (indexOf(str, charsOfOldWord[j]) == i) {
                j++;
            } else {
                j = 0;
            }
        }
        String result = "";
        if (startOfOldWordIndex > 0) {
            result = subString(str, 0, startOfOldWordIndex);
        }
        result += newWord + subString(str, startOfOldWordIndex + oldWord.length(), str.length());
        return result;
    }

    /**
     * replaceAll - метод для замены всех вхождений слова на новое
     */
    private static String replaceAll(String str, String oldWord, String newWord) {
        while (contains(str, oldWord)) {
            str = replaceFirst(str, oldWord, newWord);
        }
        return str;
    }


    /**
     * maxSimpleSubstring - метод, который находит наибольшую подстроку из двух строк
     */
    private static String maxSimpleSubstring(String str1, String str2) {
        String result = "";
        int maxLength = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = str1.length() - 1; j > i; j--) {
                String temp = subString(str1, i, j);
                //System.out.println(temp);
                if (str2.contains(temp) && maxLength < temp.length() /*&& !(contains(temp, " "))*/) {
                    result = temp;
                    maxLength = temp.length();
                    //System.out.println("===" + temp);
                }
            }
        }
        return result;
    }

    private static String maxSimpleSubstringV2(String str1, String str2) {
        String longerStr = getBiggerWord(str1, str2);
        String shorterStr = getSmallerWord(str1, str2);
        for(int i = shorterStr.length(); i > 0; i--) {
            for (int j = 0; j + i <= shorterStr.length(); j++) {
                String temp = subString(shorterStr, j, j + i);
                //System.out.println("i = " + i + ", j = " + j + " " + temp);
                if (longerStr.contains(temp)) {
                    return temp;
                }
            }
        }
        return "";
    }

    private static String getSmallerWord(String word1, String word2) {
        if (word1.length() < word2.length()) {
            return word1;
        }
        return word2;
    }

    /**
     * Отсортировать строки
     */
    private static String getBiggerWord(String word1, String word2) {
        if (word1.length() >= word2.length()) {
            return word1;
        }
        return word2;
    }

    private static boolean firstCharIsLess(char char1, char char2) {
        return char1 < char2;
    }

    private static boolean firstLess(String word1, String word2, boolean inAlphabetOrder){
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        String biggerWord = getBiggerWord(word1, word2);
        for (int i = 0; i < biggerWord.length(); i++) {
            if(inAlphabetOrder) {
                return firstCharIsLess(chars1[i], chars2[i]);
            }
            return !firstCharIsLess(chars1[i], chars2[i]);
        }
        return false;
    }

    public static void wordSort(String[] strings, boolean inAlphabetOrder){
        for (int i = 0; i < strings.length; i++) {
            for (int j = i; j < strings.length; j++) {
                if(firstLess(strings[j], strings[i], inAlphabetOrder)){
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
    }



    /**
     * Отсортировать двухмерный масив строк зигзагом
     */
    private static void zigzagSort(String[][] words) {
        for (int i = 0; i < words.length - 1; i += 2) {
            wordSort(words[i], true);
            wordSort(words[i + 1], false);
        }
    }

    private static void output(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                System.out.print(array[i] + "]\n");
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    private static void output(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            output(array[i]);
        }
    }



    public static void main(String[] args) {
        String str = "Hello, beautiful world!!";
        int from = 5;
        int to = 10;
        System.out.println("Строка:" + str);
        System.out.println("substring(str," + from + "," + to + ") =" + subString(str, 5, 10));
        System.out.println("substring(" + from + ",str) =" + subString(5, str));
        System.out.println("substring(str," + to + ") =" + subString(str, 10));
        System.out.println("\n");


        String str1 = "    Hello,   beautiful  world!!    ";
        System.out.println("Строка:" + str);
        System.out.println("trim(str) =" + trim(str1));
        System.out.println("trim(str,false) =" + trim(str1, false));
        System.out.println("trim(str,true) =" + trim(str1, true));
        System.out.println("\n");

        String str2 = "Hello, beautiful world and people!!";
        from = 6;
        System.out.println("Index of element('l') = " + indexOf(str2, 'l'));
        System.out.println("Index of element{'a') = " + indexOf(str2, 'a'));
        System.out.println("Index of element('z') = " + indexOf(str2, 'z'));
        System.out.println("Index of element('l' from index " + from + ") = " + indexOf(str2, 'l', 6));
        System.out.println("Index of element('a') from index " + from + ") = " + indexOf(str2, 'a', 6));
        System.out.println("Last index of element('l') = " + lastIndexOf(str2, 'l'));
        System.out.println("Last index of element('a') = " + lastIndexOf(str2, 'a'));
        System.out.println("\n");

        String strMain = "1234567890";
        String strSub1 = "34567";
        String strSub2 = "12";
        String strSub3 = "45678901";
        System.out.println(strMain + ".contains(" + strSub1 + ") = " + contains(strMain, strSub1));
        System.out.println(strMain + ".contains(" + strSub2 + ") = " + contains(strMain, strSub2));
        System.out.println(strMain + ".contains(" + strSub3 + ") = " + contains(strMain, strSub3));
        System.out.println(strMain + ".contains(" + strMain + ") = " + contains(strMain, strMain));
        System.out.println(strMain + ".contains(" + strSub1 + " from index 1) = " + contains(strMain, strSub1, 1));
        System.out.println(strMain + ".contains(" + strSub1 + " from index 3) = " + contains(strMain, strSub1, 3));
        System.out.println(strMain + ".contains(" + strSub2 + " from index 1) = " + contains(strMain, strSub2, 1));
        System.out.println(strMain + ".contains(" + strMain + " from index 1) = " + contains(strMain, strMain, 1));
        System.out.println("\n");

        int[] arr = {1, 4, 5, 9, 0, -3, 3};
        System.out.println("Масив: " + toString(arr) + "\n");

        String str3 = "Oh, Bye, world! Bye, sun, Bye!!!";
        System.out.println("До замены: " + str3);
        str3 = replaceAll(str3, "Bye", "Hello");
        System.out.println("После замены: " + str3);
        System.out.println("\n");

        String str100 = "hello world";
        String str101 = "worship hell";
        System.out.println("Первая строка: " + str100);
        System.out.println("Вторая строка: " + str101);
        System.out.println("Максимальное общее слово: " + maxSimpleSubstring(str100, str101));
        System.out.println("Максимальное общее слово: " + maxSimpleSubstringV2(str100, str101));



        System.out.println("\n\n\n");
        String[] words = {"Люцифер", "Сатана", "Асмодей", "Левиафан", "Бельфегор", "Вельзевул", "Астарот", "Баал"};
        wordSort(words, true);
        output(words);
        wordSort(words, false);
        output(words);


        System.out.println("\n\n\n");
        String[][] wordArray = {
                {"Fish", "Apple", "Ant"},
                {"Dragon", "Colossus", "Titan", "Gigant"},
                {"Insect", "Cat", "Crab", "Lobster"},
                {"Zebra", "Lion", "Giraffe", "Hippopotamus"}
        };
        zigzagSort(wordArray);
        output(wordArray);


        System.out.println("\n\n\n");
        String[][] sleeping  = {
//                Todo ;-)
                {"Многие", "долгожители", "уверяют,"},
                {"что", "именно", "качественный,", "умеренный", "по длительности"},
                { "сон", "дал",  "им", "возможность", "отпраздновать"},
                { "сотый", "день", "рождения"},
                { "и сохранить", "крепкое", "здоровье."}
        };
        zigzagSort(sleeping);
        output(sleeping);



        System.out.println("\n\n\n");
        String[] strArray = {"qwer", "fghj", "abcef", "zghj", "tyfug", "fgjh"};
        System.out.println(Arrays.toString(strArray));
        MyString.wordSort(strArray, true);
        System.out.println(Arrays.toString(strArray));

        String str30 = "hello World weuiwr";
        String str40 = "worshiweuiwrp hell";
        System.out.println(maxSimpleSubstringV2(str30, str40));
    }


}
