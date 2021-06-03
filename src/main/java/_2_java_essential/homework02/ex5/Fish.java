package _2_java_essential.homework02.ex5;

class Fish extends Animal {
    private double weight;

    Fish(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    void takeAction(Animal animal){
        int k = random.nextInt(100) + 1;
        double coefficient = 1;
        if (k > 0 && k <= 20) {
            System.out.println("Рыбка сьела очень хорошую еду\n");
            coefficient += 0.1;
        } else if (k > 20 && k <= 80) {
            System.out.println("Рыбка сьела обычную еду\n");
            coefficient += 0.02;
        } else {
            System.out.println("Рыбка сьела плохую еду");
        }
        this.weight *= coefficient;
    }

    @Override
    String getActionDescription() {
        return "Покормить рыбку.";
    }

    @Override
    String getAnimalTypeName() {
        return "рыбку";
    }

    @Override
    public String toString() {
        return "Рыбка (" +
                super.toString() +
                " вес = " + weight +
                ')';
    }
}
