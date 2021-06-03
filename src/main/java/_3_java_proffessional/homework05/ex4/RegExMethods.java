package _3_java_proffessional.homework05.ex4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExMethods {

    private static String getWithoutExtraSpaces(String str) {
        return str.trim().replaceAll("\\s{2,}", " ");
    }


    /**
     * Ex1
     */
    static String getOnlyLetOrNumFromStr(String str, String token) {
        String res;
        switch (token) {
            case "number":
                res = str.replaceAll("[^0-9 ]", "");
                break;
            case "letter":
                res = str.replaceAll("[^a-zA-Z ]", "");
                break;
            default:
                res = str.replaceAll("[^a-zA-Z0-9 ]", "");
                break;
        }
        return getWithoutExtraSpaces(res);
    }


    private static Set<String> getSetOfWordsWhichOccurNM(List<String> list, int min, int max) {
        Set<String> set = new HashSet<>();
        for (String word : list) {
            int num = getNumOfWordMet(word, list);
            if (num != 0 && num >= min && num <= max) {
                set.add(word);
            }
        }
        return set;
    }


    /**
     * Ex2
     */
    static String getOnlyWordsWithOccurNM(String str, int min, int max) {
        str = getOnlyLetOrNumFromStr(str, "");
        return getCollectionToString(
                getSetOfWordsWhichOccurNM(
                        new ArrayList<>(Arrays.asList(str.split(" "))),
                        min,
                        max));
    }

    private static int getNumOfWordMet(String word, List<String> words) {
        int number = 0;
        List<String> copyList = new ArrayList<>(words);
        while(true) {
            if(copyList.contains(word)) {
                number++;
                copyList.remove(word);
            } else {
                break;
            }
        }
        return number;
    }


    /**
     * Ex3
     */
    static String getOnlyWords3And7Interval(String str) {
        str = getOnlyLetOrNumFromStr(str, "");
        return str.replaceAll("\\b\\w{1,2}\\b", "")
                .replaceAll("\\b\\w{7,30}\\b", "")
                .trim()
                .replaceAll("\\s{2,}", " ");
    }



    /**
     * Ex4
     */
    static String getWordsWhichStartOnLetter(String str, char symbol) {
        str = getOnlyLetOrNumFromStr(str, "letter");
        return getCollectionToString(
                getSetOfWordsWithFirstLetter(
                        new ArrayList<>(Arrays.asList(str.split(" "))), symbol));}

    /**
     * Ex5
     */
    static String getWordsWhichEndsOnLetter(String str, char symbol) {
        str = getOnlyLetOrNumFromStr(str, "letter");
        return getCollectionToString(
                getSetOfWordsWithLastLetter(
                        new ArrayList<>(Arrays.asList(str.split(" "))), symbol));}


    /**
     * Ex6
     */
    static String getWordsWhichHasLetter(String str, char symbol) {
        str = getOnlyLetOrNumFromStr(str, "letter");
        return getCollectionToString(
                getSetOfWordsWithLetter(
                        new ArrayList<>(Arrays.asList(str.split(" "))), symbol));}


    /**
     * Ex7
     */
    static String getWordsWhichHasLetters(String str, char[] symbols) {
        str = getOnlyLetOrNumFromStr(str, "letter");
        return getCollectionToString(
                getSetOfWordsWithLetters(
                        new ArrayList<>(Arrays.asList(str.split(" "))), symbols));}

    /**
     * Ex8
     */
    static String getWordsWhichIsNotInList(String str, List<String> list) {
        str = getOnlyLetOrNumFromStr(str, "letter");
        return getCollectionToString(
                getSetOfWordsWithoutWords(
                        new ArrayList<>(Arrays.asList(str.split(" "))), list));}

    private static Set<String> getSetOfWordsWithoutWords(List<String> list, List<String> exceptionList) {
        Set<String> set = new HashSet<>();
        for (String word : list) {
            if (!exceptionList.contains(word)) {
                set.add(word);
            }
        }
        return set;
    }


    private static Set<String> getSetOfWordsWithFirstLetter(List<String> list, char symbol) {
        Set<String> set = new HashSet<>();
        for (String word : list) {
            if (firstLetterIsSymbol(word, symbol)) {
                set.add(word);
            }
        }
        return set;
    }


    private static Set<String> getSetOfWordsWithLastLetter(List<String> list, char symbol) {
        Set<String> set = new HashSet<>();
        for (String word : list) {
            if (lastLetterIsSymbol(word, symbol)) {
                set.add(word);
            }
        }
        return set;
    }


    private static Set<String> getSetOfWordsWithLetter(List<String> list, char symbol) {
        Set<String> set = new HashSet<>();
        for (String word : list) {
            if (wordHasLetter(word, symbol)) {
                set.add(word);
            }
        }
        return set;
    }


    private static Set<String> getSetOfWordsWithLetters(List<String> list, char[] symbols) {
        Set<String> set = new HashSet<>();
        for (String word : list) {
            if (wordHasLetters(word, symbols)) {
                set.add(word);
            }
        }
        return set;
    }


    private static boolean firstLetterIsSymbol(String word, char symbol) {
        return nLetterIsSymbol(word, symbol, 0);
    }

    private static boolean lastLetterIsSymbol(String word, char symbol) {
        return nLetterIsSymbol(word, symbol, word.length() - 1);
    }

    private static boolean wordHasLetter(String word, char symbol) {
        for (int i = 0; i < word.length(); i++) {
            if (nLetterIsSymbol(word, symbol, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean wordHasLetters(String word, char[] symbols) {
        for (char symbol : symbols) {
            if (!wordHasLetter(word, symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean nLetterIsSymbol(String word, char symbol, int index) {
        return word.indexOf(symbol) == index;
    }


    private static <T> String getCollectionToString(Collection<T> collection) {
        StringBuilder res = new StringBuilder();
        for (T t : collection) {
            res.append(t).append(" ");
        }
        return res.toString();
    }


    /**
     * Ex9
     */
    static String getOnlyDates(String str) {
        Matcher m = Pattern.compile("(\\d{4}-\\d{2}-\\d{2})", Pattern.CASE_INSENSITIVE).matcher(str);
        String res = "";
        while (m.find()) {
            res += m.group(1) + " ";
        }
        return res;
    }

    /**
     * Ex10
     */
    static String getDatesAndTime(String str) {
        String res = getOnlyDates(str);
        Matcher m = Pattern.compile("(\\d{2}:\\d{2})", Pattern.CASE_INSENSITIVE).matcher(str);
        while (m.find()) {
            res += m.group(1) + " ";
        }
        return res;
    }
}
