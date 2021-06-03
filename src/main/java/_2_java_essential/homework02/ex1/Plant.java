package _2_java_essential.homework02.ex1;

class Plant extends Organism {
    Plant(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    /**статические методы не наследуются*/
    public static void fade() {

    }
}
