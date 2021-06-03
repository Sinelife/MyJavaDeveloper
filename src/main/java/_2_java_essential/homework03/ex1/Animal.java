package _2_java_essential.homework03.ex1;

abstract class Animal extends Organism {
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

    abstract void sayHello();

    abstract int getLegsNum();

    private void evolve() {

    }
}
