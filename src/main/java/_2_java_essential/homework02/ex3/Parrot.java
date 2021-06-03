package _2_java_essential.homework02.ex3;

import java.util.*;

class Parrot extends Animal {
    private List<String> words;

    Parrot(String name, int age) {
        super(name, age);
        initializeWords();
    }

    private void initializeWords(){
        words = new ArrayList<>(Collections.singletonList("попугай"));
    }

    public List<String> getWords() {
        return words;
    }

    void learnWord(String word) {
        System.out.println("Папугай выучил слово - " + word + "\n");
        this.words.add(word);
    }

    void forgot() {
        if (!words.isEmpty()) {
            int index = words.size() == 1 ? 0 : random.nextInt(words.size() - 1);
            words.remove(index);
        } else {
            System.out.println("Папугаю нечего забывать\n");
        }
    }

    @Override
    public String toString() {
        return "Папугай (" +
                super.toString() +
                " все слова = " + words +
                ')';
    }
}
