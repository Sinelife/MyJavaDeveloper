package _2_java_essential.homework03.ex4;

class Fish extends Animal {
    private final String FISH = "Рыбка " + name;
    private double weight;

    Fish(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    public String getTypeAndName() {
        return FISH;
    }

    @Override
    public String getActionDescription() {
        return "Покормить рыбку.";
    }

    @Override
    public String getAnimalTypeName() {
        return "рыбку";
    }

    @Override
    void takeAction(Animal[] animal){
        int k = random.nextInt(100) + 1;
        double coefficient = 1;
        if (k > 0 && k <= 20) {
            System.out.println(FISH + " сьела очень хорошую еду\n");
            coefficient += 0.1;
        } else if (k > 20 && k <= 80) {
            System.out.println(FISH + " сьела обычную еду\n");
            coefficient += 0.02;
        } else {
            System.out.println(FISH + " сьела плохую еду\n");
        }
        this.weight *= coefficient;
    }

    @Override
    public String toString() {
        return "Рыбка(" + super.toString() + " вес = " + weight + ')';
    }

    @Override
    public void introduce() {
        System.out.println(FISH + " представляется.");
        System.out.println("Буль-Буль!\n");
    }

    @Override
    public void extraAbility() {
        System.out.println(FISH + " использует суперспособность.");
        int i = random.nextInt(100);
        weight = i % 2 == 0 ? weight * 2 : weight / 2;
        System.out.println("Теперь " + FISH + " весит " + weight + "\n");
    }
}
