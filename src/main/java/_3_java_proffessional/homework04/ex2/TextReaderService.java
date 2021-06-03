package _3_java_proffessional.homework04.ex2;

import java.io.*;
import java.util.*;

class TextReaderService {

    private static List<Character> vocalLetters = Arrays.asList('a', 'e', 'o', 'i', 'u');
    private String text;
    private File file;

    TextReaderService(String path) {
        this.file = new File(path);
        this.text = getTextFromFile();
    }

    /**
     * Метод, для выбора что именно нужно получить из считываемого файла
     */
    String read(ReadVariants variant) {
        if (variant.equals(ReadVariants.ALL_TEXT)) {
            return getTextFromFile();
        } else if (variant.equals(ReadVariants.HALF_OF_TEXT)) {
            return getHalfTextFromFile();
        } else if (variant.equals(ReadVariants.ALL_NUMBERS)) {
            return getAllNumbersFromFile();
        } else if (variant.equals(ReadVariants.ALL_WORDS_ON_LETTERS_M_N)) {
            return getAllWordsWithSpecificFirstLetter();
        } else if (variant.equals(ReadVariants.ALL_WORDS_MORE_THAN_8_LETTERS)) {
            return getAllWordsWithMoreThan8Letters();
        } else if (variant.equals(ReadVariants.ALL_SYMBOLS_NOT_NUM_OR_LETTER)) {
            return getTextWithoutNumbersAndLetters();
        } else if (variant.equals(ReadVariants.ALL_WORDS_SORTED_IN_ALPHABET)) {
            return getSortedByNameWords();
        } else if (variant.equals(ReadVariants.ALL_WORDS_WITH_2_VOCAL_LETTERS_AND_SORTED_BY_LENGTH)) {
            return getSortedByLegthWordsWith2VocalLetters();
        }
        throw new IllegalStateException("Нет такого пункта в перечислении ReadVariants.");
    }

    /**
     * 1) Метод, для получения из файла всего текста
     */
    private String getTextFromFile() {
        Reader reader;
        String text = "";
        try {
            reader = new FileReader(file);
            int c;
            while ((c = reader.read()) != -1) {
                text += (char) c;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }


    /**
     * 2) Метод, для получения из файла всего половины текста
     */
    private String getHalfTextFromFile() {
        char[] chars = getTextFromFile().toCharArray();
        String result = "";
        for (int i = 0; i < chars.length / 2; i++) {
            result += chars[i];
        }
        return result;
    }


    /**
     * 3) Метод, для получения из файла всех чисел
     */
    private String getAllNumbersFromFile() {
        char[] chars = text.replaceAll("\\s{2,}", " ").toCharArray();
        String number = "";
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            if (symbolIsDigit(chars[i])) {
                number += chars[i];
            } else if (!symbolIsDigit(chars[i]) && i > 0 && symbolIsDigit(chars[i - 1])) {
                res += number + ", ";
                number = "";
            }
        }
        return res + number;
    }

    /**
     * Метод, который проверяет являеться ли символ цыфрой
     */
    private boolean symbolIsDigit(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }


    /**
     * 4)Метод, который получает все слова, которые начинаються на буквы m i n
     */
    private String getAllWordsWithSpecificFirstLetter() {
        String res = "";
        for (String word : getAllWordsFromText()) {
            if(wordHasFirstLetter(word, new char[]{'m', 'n'})) {
                res += word + ", ";
            }
        }
        return res;
    }

    /**
     * Метод, для проверки есть ли первая буква из масива символов в слове
     */
    private boolean wordHasFirstLetter(String word, char[] symbols) {
        for (char symbol : symbols) {
            if (word.indexOf(symbol) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод, для получения списка всех слов
     */
    private List<String> getAllWordsFromText() {
        List<String> list = new ArrayList<>(Arrays.asList(
                text.replaceAll("\\s{2,}", " ")
                        .replaceAll("[^a-zA-Z ]", "")
                        .split(" ")
        ));
        return getListWithOutEmptyElements(list);
    }

    /**
     * Метод, для удаления пустых строк из списка
     */
    private List<String> getListWithOutEmptyElements(List<String> list) {
        while (list.contains("")) {
            list.remove("");
        }
        return list;
    }



    /**
     * 5)Метод, который получает все слова больше чем из 8 букв
     */
    private String getAllWordsWithMoreThan8Letters() {
        String res = "";
        for (String word : getAllWordsFromText()) {
            if(word.length() > 8) {
                res += word + ", ";
            }
        }
        return res;
    }



    /**
     * 6)Метод, который получает все символы кроме букв и чисел
     */
    private String getTextWithoutNumbersAndLetters() {
        String res = "";
        char[] chars = text.toCharArray();
        for (char symbol : chars) {
            if (!isLetter(symbol) && !isDigit(symbol) && !isSpace(symbol)) {
                res += symbol;
            }
        }
        return res;
    }

    /**
     * Метод, который проверяет являеться ли символ отсупом
     */
    private boolean isSpace(char symbol) {
        return symbol == ' ';
    }

    /**
     * Метод, который проверяет являеться ли символ числом
     */
    private boolean isDigit(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }

    /**
     * Метод, который проверяет являеться ли символ буквой
     */
    private boolean isLetter(char symbol) {
        return (symbol >= 'a' && symbol <= 'z')
                || (symbol >= 'A' && symbol <= 'Z');
    }




    /**
     * 7) Метод, который получает отсортированые в алфавитном порядке слова
     */
    private String getSortedByNameWords() {
        List<String> list = getAllWordsFromText();
        Collections.sort(list);
        String res = "";
        for (String word : list) {
            res += word + ", ";
        }
        return res;
    }



    /**
     * 7) Метод, который получает отсортированые в по размеру слова, в которых
     * находиться не меньше двух гласных букв
     */
    private String getSortedByLegthWordsWith2VocalLetters() {
        List<String> list = getAllWordsFromTextWith2VocalLetters();
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        String res = "";
        for (String word : list) {
            res += word + ", ";
        }
        return res;
    }

    /**
     * Метод, который возвращает список слов, которые имеют минимум 2 гласные
     * буквы
     */
    private List<String> getAllWordsFromTextWith2VocalLetters() {
        List<String> list = new ArrayList<>();
        for (String word : getAllWordsFromText()) {
            if (wordHasNVocalLetters(word, 2)) {
                list.add(word);
            }
        }
        return list;
    }

    /**
     * Метод, который проверяет есть ли у слова n гласных букв
     */
    private boolean wordHasNVocalLetters(String word, int num) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (vocalLetters.contains(word.charAt(i))) {
                counter++;
            }
        }
        return counter >= num;
    }


    /**
     * Перечисления для вариантов считывания текста
     */
    enum ReadVariants {
        ALL_TEXT,
        HALF_OF_TEXT,
        ALL_NUMBERS,
        ALL_WORDS_ON_LETTERS_M_N,
        ALL_WORDS_MORE_THAN_8_LETTERS,
        ALL_SYMBOLS_NOT_NUM_OR_LETTER,
        ALL_WORDS_SORTED_IN_ALPHABET,
        ALL_WORDS_WITH_2_VOCAL_LETTERS_AND_SORTED_BY_LENGTH
    }


    
}
