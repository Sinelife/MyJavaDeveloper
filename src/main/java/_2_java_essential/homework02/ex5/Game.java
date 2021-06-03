package _2_java_essential.homework02.ex5;

import java.util.Scanner;

class Game {

    private Animal[] animals = new Animal[3];

    Game(Dog dog, Fish fish, Parrot parrot) {
        this.animals[0] = dog;
        this.animals[1] = parrot;
        this.animals[2] = fish;
    }

    public void run() {
        boolean isNotEnd = true;
        while (isNotEnd) {
            System.out.println("Меню(Выберите животное, с которым хотите работать)");
            System.out.println("1)Собака " + animals[0].getName());
            System.out.println("2)Папугай " + animals[1].getName());
            System.out.println("3)Рыбка " + animals[2].getName());
            System.out.println("0)Выход.");
            int chosen = sc.nextInt();
            if (chosen >=1 && chosen <= 3) {
                animals[chosen - 1].animalMenu(animals[1]);
            } else if (chosen == 0) {
                isNotEnd = false;
            }
        }
    }

    private static final Scanner sc = new Scanner(System.in);
}

