package _2_java_essential.homework02.ex3;

import java.util.Random;

class Animal {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return name + '\'' +
                ", age = " + age + ", ";
    }

    protected static Random random = new Random();
}
