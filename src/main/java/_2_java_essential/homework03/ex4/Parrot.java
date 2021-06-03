package _2_java_essential.homework03.ex4;
import java.util.*;

class Parrot extends Animal {
    private String parrotString = "Папугай " + name;
    private List<String> words;

    Parrot(String name, int age) {
        super(name, age);
        this.words = new ArrayList<>(Collections.singletonList("попугай"));
    }

    @Override
    public String getTypeAndName() {
        return parrotString;
    }

    public List<String> getWords() {
        return words;
    }

    @Override
    public String getActionDescription() {
        return "Научить попугая словам.";
    }

    @Override
    public String getAnimalTypeName() {
        return "папугая";
    }

    @Override
    void takeAction(Animal[] animal) {
        System.out.println("Введите слово, которому хотите научить.");
        String newWord = sc.next();
        System.out.println(parrotString + " выучил слово - " + newWord + "\n");
        this.words.add(newWord);
    }

    @Override
    void getInfluenceFromOther() {
        if (!words.isEmpty()) {
            System.out.println(parrotString + " испугался и забывает слово.\n");
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

    @Override
    public void introduce() {
        System.out.println(parrotString + " представляется. ");
        List<String> bufferList = new ArrayList<>(words);
        Collections.sort(bufferList);
        System.out.println(bufferList + "\n");
    }

    @Override
    public void extraAbility() {
        System.out.println(parrotString + " применил суперспособность. ");
        String temp = name;
        int index = random.nextInt(words.size());
        name = words.get(index);
        words.add(temp);
        parrotString = "Папугай " + name;
        System.out.println("Имя попугая теперь " + name + "\n");
    }
}
