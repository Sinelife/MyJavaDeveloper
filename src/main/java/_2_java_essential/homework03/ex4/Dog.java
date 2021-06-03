package _2_java_essential.homework03.ex4;

import java.util.*;

class Dog extends Animal {
    private final String DOG = "Собака " + name;
    private int scaryLevel = 3;

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getTypeAndName() {
        return DOG;
    }

    @Override
    public String getActionDescription() {
        return "Испугать попугая.";
    }

    @Override
    public String getAnimalTypeName() {
        return "собаку";
    }

    private void increaseScaryLevel() {
        scaryLevel = scaryLevel == 9 ? scaryLevel : scaryLevel + 1;
    }

    @Override
    public void takeAction(Animal[] animals) {
        System.out.println("Выберите папугая, которого надо испугать собаке " + this.getName());
        int counter = 1;
        List<Animal> parrots = getAllParrots(animals);
        for (Animal parrot : parrots) {
            System.out.println(counter++ + ")" + parrot.getName());
        }
        int number = sc.nextInt();
        if (number > 0 && number <= parrots.size()) {
            scaryParrot(parrots.get(number - 1));
        }
    }

    private List<Animal> getAllParrots(Animal[] animals) {
        List<Animal> parrots = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Parrot) {
                parrots.add(animal);
            }
        }
        return parrots;
    }

    private void scaryParrot(Animal parrot) {
        int k = random.nextInt(100) + 1;
        double chance = (double) scaryLevel / 10;
        if (k > 0 && k < 100 * chance) {
            System.out.println(DOG + " успешно испугала папугая\n");
            parrot.getInfluenceFromOther();
            increaseScaryLevel();
        } else {
            System.out.println(DOG + " не смогла испугать папугая\n");
        }
    }

    @Override
    public String toString() {
        return "Собака( " +
                super.toString() +
                " уровень запугивания = " + scaryLevel +
                ')';
    }

    @Override
    public void introduce() {
        System.out.println(DOG + " представляется.");
        for (int i = 0; i < scaryLevel; i++) {
            System.out.print("Гав!");
        }
        System.out.println("\n");
    }

    @Override
    public void extraAbility() {
        System.out.println(DOG + " применяет суперспособность.");
        int num = random.nextInt(4) + 10;
        for (int i = 0; i < num; i++) {
            System.out.print("Гав!");
        }
        System.out.println("Аууууууу!\n");
    }
}
