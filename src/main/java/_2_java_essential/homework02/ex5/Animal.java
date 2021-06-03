package _2_java_essential.homework02.ex5;

import java.util.Random;
import java.util.Scanner;

class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void takeAction(Animal animal) { }

    void getInfluenceFromOther() { }

    String getActionDescription() {
        return "";
    }

    String getAnimalTypeName() {
        return "";
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

    void animalMenu(Animal animal) {
        boolean isNotEnd = true;
        while (isNotEnd) {
            System.out.println("Выберите что хотите сделать");
            System.out.println("1)Посмотреть информацию про " + this.getAnimalTypeName() + ".");
            System.out.println("2)" + this.getActionDescription());
            System.out.println("0)Назад.");
            int chosen = sc.nextInt();
            switch (chosen) {
                case 1:
                    System.out.println(this);
                    break;
                case 2:
                    this.takeAction(animal);
                    break;
                case 0:
                    isNotEnd = false;
                    break;
                default:
                    System.out.println("Не верный ввод");
                    break;
            }
        }
    }

    private static final Scanner sc = new Scanner(System.in);
    protected static Random random = new Random();
}
