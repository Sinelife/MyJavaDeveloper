package _2_java_essential.homework02.ex1;

class Animal extends Organism {
    Animal(String name, int age) {
        super(name, age);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    protected void sayHello() {
        System.out.println();
    }

    private void evolve() {

    }
}
