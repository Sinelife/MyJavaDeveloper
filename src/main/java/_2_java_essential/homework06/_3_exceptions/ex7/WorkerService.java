package _2_java_essential.homework06._3_exceptions.ex7;

import java.util.*;

class WorkerService {

    private final static int MAX_NUM = 4;
    private final static Scanner sc = new Scanner(System.in);
    private List<Worker> workers;

    WorkerService() {
        this.workers = new ArrayList<>();
    }


    void run() {
        boolean isNotEnd = true;
        while(isNotEnd) {
            outputStartMessage();
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    output();
                    break;
                case 2:
                    deleteWorker();
                    break;
                case 3:
                    addWorker();
                    break;
                default:
                    isNotEnd = false;
                    break;
            }
        }
    }


    private void outputStartMessage() {
        System.out.println("Меню");
        System.out.println("1)Вывести всех работников");
        System.out.println("2)Удалить работника");
        System.out.println("3)Добавить работника");
        System.out.println("0)Выход.");
    }

    private void addWorker() {
        if (workers.size() < MAX_NUM) {
            String name;
            String surname;
            String secondName;
            int age;
            int salary;
            System.out.println("Введите имя");
            name = getInput();
            System.out.println("Введите фамилию");
            surname = getInput();
            System.out.println("Введите отчество");
            secondName = getInput();
            System.out.println("Введите возраст");
            age = sc.nextInt();
            System.out.println("Введите зарплату");
            salary = getSalary();
            workers.add(new Worker(name, surname, secondName, age, salary));
        } else {
            throw new PersonGroupNumberException("Количество работников в команде достигло масксимума!(MAX_NUM = " + MAX_NUM + ")");
        }
    }

    private int getSalary() {
        int salary = sc.nextInt();
        if (salary < 0) {
            throw new NumberLessThanZeroException("Зарплата не может быть меньше 0.");
        }
        return salary;
    }

    private void deleteWorker() {
        if(workers.size() > 0) {
            workers.remove(0);
        } else {
            throw new PersonGroupNumberException("Нельзя удалить работников из пустой команды.");
        }
    }

    private String getInput() {
        String word = sc.next();
        if(word.length() > 2 && word.length() < 16) {
            return word;
        }
        throw new WordLengthException("Слово слишком мало или слишком большое.");
    }

    private void output() {
        int counter = 1;
        System.out.println("\n\n\nСписок работников");
        for (Worker worker : workers) {
            System.out.println(counter++ + ")" + worker);
        }
        System.out.println("\n");
    }
}
