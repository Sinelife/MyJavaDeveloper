package _2_java_essential.homework02.ex3;

import java.util.Scanner;

class Game {

    private Dog dog;
    private Fish fish;
    private Parrot parrot;

    Game(Dog dog, Fish fish, Parrot parrot) {
        this.dog = dog;
        this.fish = fish;
        this.parrot = parrot;
    }

    public void run() {
        boolean isNotEnd = true;
        while (isNotEnd) {
            System.out.println("Меню(Выберите животное, с которым хотите работать)");
            System.out.println("1)Собака " + dog.getName());
            System.out.println("2)Папугай " + parrot.getName());
            System.out.println("3)Рыбка " + fish.getName());
            System.out.println("0)Выход.");
            int chosen = sc.nextInt();
            switch (chosen) {
                case 1:
                    dogMenu();
                    break;
                case 2:
                    parrotMenu();
                    break;
                case 3:
                    fishMenu();
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

    private void dogMenu() {
        boolean isNotEnd = true;
        while (isNotEnd) {
            System.out.println("Выберите что хотите сделать");
            System.out.println("1)Посмотреть информацию про собаку.");
            System.out.println("2)Испугать попугая.");
            System.out.println("0)Назад.");
            int chosen = sc.nextInt();
            switch (chosen) {
                case 1:
                    System.out.println(dog);
                    break;
                case 2:
                    dog.scaryParrot(parrot);
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


    private void parrotMenu() {
        boolean isNotEnd = true;
        while (isNotEnd) {
            System.out.println("Выберите что хотите сделать");
            System.out.println("1)Посмотреть информацию про попугая.");
            System.out.println("2)Научить попугая словам.");
            System.out.println("0)Назад.");
            int chosen = sc.nextInt();
            switch (chosen) {
                case 1:
                    System.out.println(parrot);
                    break;
                case 2:
                    System.out.println("Введите слово, которому хотите научить.");
                    String newWord = sc.next();
                    parrot.learnWord(newWord);
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


    private void fishMenu() {
        boolean isNotEnd = true;
        while (isNotEnd) {
            System.out.println("Выберите что хотите сделать");
            System.out.println("1)Посмотреть информацию про рыбку.");
            System.out.println("2)Покормить рыбку.");
            System.out.println("0)Назад.");
            int chosen = sc.nextInt();
            switch (chosen) {
                case 1:
                    System.out.println(fish);
                    break;
                case 2:
                    fish.eatFood();
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
}

