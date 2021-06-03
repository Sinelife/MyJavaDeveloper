package _2_java_essential.homework02.ex5;
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

    @Override
    void takeAction(Animal animal) {
        System.out.println("Введите слово, которому хотите научить.");
        String newWord = sc.next();
        System.out.println("Папугай выучил слово - " + newWord + "\n");
        this.words.add(newWord);
    }

    @Override
    void getInfluenceFromOther() {
        if (!words.isEmpty()) {
            int index = words.size() == 1 ? 0 : random.nextInt(words.size() - 1);
            words.remove(index);
        } else {
            System.out.println("Папугаю нечего забывать\n");
        }
    }

    @Override
    String getActionDescription() {
        return "Научить попугая словам.";
    }

    @Override
    String getAnimalTypeName() {
        return "папугая";
    }

    @Override
    public String toString() {
        return "Папугай (" +
                super.toString() +
                " все слова = " + words +
                ')';
    }

    private static final Scanner sc = new Scanner(System.in);
}
