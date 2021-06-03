package _2_java_essential.homework07.ex3;

import java.util.*;

class Tester {

    private static List<Animal> getSomeAnimalsList() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Jack", 12, ""));
        animals.add(new Dog("", 6, "", 14.2));
        animals.add(new Fish("", 3, ""));
        animals.add(new Dog("", 6, "", 14.2));
        animals.add(new Fish("", 3, ""));
        animals.add(new Fish("", 3, ""));
        animals.add(new Cat("Jack", 12, ""));
        return animals;
    }

    public static void main(String[] args) {
        List<Animal> animals = getSomeAnimalsList();

        List<AnimalArrayData> data = UtilMethods.getListAnimalArrayData(animals);
        System.out.println(Arrays.toString(data.toArray()));

        System.out.println("\n\n\n\nThe most popular animal - " + UtilMethods.getMostMetAnimal(animals));

    }
}
