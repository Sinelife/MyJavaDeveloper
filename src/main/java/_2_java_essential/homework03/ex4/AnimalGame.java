package _2_java_essential.homework03.ex4;
import java.util.*;

class AnimalGame {
    private Animal[] animals;

    /**
     * Конструктор
     */
    AnimalGame(Animal[] animals) {
        this.animals = animals;
    }

    /**
     * Главный метод для запсука игры
     */
    public void run() {
        while (true) {
            outputMainMenu();
            int chosen = sc.nextInt();
            if (chosen > 0) {
                animalMenu(animals[chosen - 1]);
            } else {
                break;
            }
        }
    }

    /**
     * Метод, для вывода главного меню
     */
    private void outputMainMenu() {
        int counter = 1;
        System.out.println("Меню(Выберите животное, с которым хотите работать)");
        for (Animal animal : animals) {
            System.out.println(counter++ + ")" + animal.getTypeAndName());
        }
    }

    private void animalMenu(Animal animal) {
        boolean isNotEnd = true;
        while (isNotEnd) {
            System.out.println("Выберите что хотите сделать(" + animal.getTypeAndName() + ")");
            System.out.println("1)Посмотреть информацию про " + animal.getAnimalTypeName() +".");
            System.out.println("2)" + animal.getActionDescription());
            System.out.println("3)" + animal.getTypeAndName() + " представиться.");
            System.out.println("4)" + animal.getTypeAndName() + " выполнит особое действие.");
            System.out.println("0)Назад.");
            int chosen = sc.nextInt();
            switch (chosen) {
                case 1:
                    System.out.println(animal);
                    break;
                case 2:
                    animal.takeAction(animals);
                    break;
                case 3:
                    animal.introduce();
                    break;
                case 4:
                    animal.extraAbility();
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

    /**
     * Метод, для получения масива животных заполненого определенными
     * значениями
     */
    static Animal[] initializeAnimalArray() {
        Animal[] animals = new Animal[9];

        animals[0] = new Dog("Тузик", 3);
        animals[1] = new Fish("Немо", 2, 0.56);
        animals[2] = new Parrot("Кеша", 2);

        animals[3] = new Parrot("Петя", 3);
        animals[4] = new Dog("Боббик", 9);
        animals[5] = new Fish("Дори", 4, 0.86);

        animals[6] = new Parrot("Вася", 5);
        animals[7] = new Fish("Марлин", 4, 0.97);
        animals[8] = new Parrot("Витя", 6);

        return animals;
    }

    private final static Scanner sc = new Scanner(System.in);
}
