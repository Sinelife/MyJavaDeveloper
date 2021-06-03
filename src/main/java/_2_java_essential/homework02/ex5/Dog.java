package _2_java_essential.homework02.ex5;

class Dog extends Animal {
    private int scaryLevel = 3;

    Dog(String name, int age) {
        super(name, age);
    }

    private void increaseScaryLevel() {
        scaryLevel = scaryLevel == 9 ? scaryLevel : scaryLevel + 1;
    }

    @Override
    void takeAction(Animal parrot) {
        int k = random.nextInt(100) + 1;
        double chance = (double) scaryLevel / 10;
        if (k > 0 && k < 100 * chance) {
            System.out.println("Собака успешно испугала папугая\n");
            parrot.getInfluenceFromOther();
            increaseScaryLevel();
        } else {
            System.out.println("Собака не смогла испугать папугая\n");
        }
    }

    @Override
    String getActionDescription() {
        return "Испугать попугая.";
    }

    @Override
    String getAnimalTypeName() {
        return "собаку";
    }

    @Override
    public String toString() {
        return "Собака( " +
                super.toString() +
                " уровень запугивания = " + scaryLevel +
                ')';
    }
}
