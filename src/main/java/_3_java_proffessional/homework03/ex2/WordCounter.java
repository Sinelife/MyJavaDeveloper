package _3_java_proffessional.homework03.ex2;

import _1_java_starter.homework05.MyString;

import java.util.*;

public class WordCounter {

    private List<String> words;
    private String text;

    public WordCounter(String text) {
        this.text = text;
        this.words = new ArrayList<>();
    }


    /**
     * Метод для получения списка слов из текста
     */
    private List<String> getWordListFromText() {
        List<String> words = new ArrayList<>();
        text = MyString.trim(text, true) + (char)0;
        char[] chars = text.toCharArray();
        String word = "";
        for (char c : chars) {
            if(c == ' ' || c == (char)0) {
                words.add(word);
                word = "";
            } else {
                word += c;
            }
        }
        return words;
    }

    /**
     * Метод для получения хешмапы где ключ это слово, а колиечство
     * его встреч в тексте значение
     */
    private Map<String, Integer> getMapOFWordsAndNums() {
        words = getWordListFromText();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                Integer value = map.get(word);
                map.put(word, ++value);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    /**
     * Метод для вывода результатов подсчета на екран
     */
    public void outputResult() {
        Set<Map.Entry<String, Integer>> entries = getMapOFWordsAndNums().entrySet();
        System.out.println("   Всего слов - " + getWordNumber());
        System.out.println("   Уникальных слов - " + getUniqueWordNumber());
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    /**
     * Метод возвращающий количество слов
     */
    private int getWordNumber() {
        return words.size();
    }

    /**
     * Метод возвращающий количество уникальных слов
     */
    private int getUniqueWordNumber() {
        return new HashSet<>(words).size();
    }
}
