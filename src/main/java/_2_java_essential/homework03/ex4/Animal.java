package _2_java_essential.homework03.ex4;

import java.util.*;

abstract class Animal implements Extra {
    protected String name;
    protected int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getTypeAndName();

    public abstract String getActionDescription();

    public abstract String getAnimalTypeName();

    void takeAction(Animal[] animal) { }

    void getInfluenceFromOther() { }

    public abstract void introduce();

    @Override
    public String toString() {
        return name + '\'' +
                ", age = " + age + ", ";
    }

    protected static final Random random = new Random();
    protected static final Scanner sc = new Scanner(System.in);
}
