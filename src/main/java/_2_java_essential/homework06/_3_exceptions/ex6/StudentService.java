package _2_java_essential.homework06._3_exceptions.ex6;

import java.util.*;

class StudentService {
    private final static int MAX_NUM = 4;
    private final static Scanner sc = new Scanner(System.in);
    private List<Student> students;

    StudentService() {
        this.students = new ArrayList<>();
    }


    void run() {
        while(true) {
            addStudent();
            output();
            if (students.size() == MAX_NUM) {
                throw new PersonGroupNumberException("Количество студентов в групе достигло масксимума!(MAX_NUM = " + MAX_NUM + ")");
            }
        }
    }

    private void addStudent() {
        String name;
        String surname;
        String secondName;
        int age;
        double mark;
        System.out.println("Введите имя");
        name = getInput();
        System.out.println("Введите фамилию");
        surname = getInput();
        System.out.println("Введите отчество");
        secondName = getInput();
        System.out.println("Введите возраст");
        age = sc.nextInt();
        System.out.println("Введите бал");
        mark = getMark();
        students.add(new Student(name, surname, secondName, age, mark));
    }

    private double getMark() {
        double mark = sc.nextDouble();
        if(mark > 60 && mark <= 100) {
            return mark;
        }
        throw new DigitSizeException("Бал может быть только от 60 до 100.");

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
        System.out.println("\n\n\nСписок студентов");
        for (Student student : students) {
            System.out.println(counter++ + ")" + student);
        }
        System.out.println("\n");
    }
}
