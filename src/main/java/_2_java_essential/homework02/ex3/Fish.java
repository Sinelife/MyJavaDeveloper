package _2_java_essential.homework02.ex3;

class Fish extends Animal {
    private double weight;

    Fish(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    void eatFood(){
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
    public String toString() {
        return "Рыбка (" +
                super.toString() +
                " вес = " + weight +
                ')';
    }
}
