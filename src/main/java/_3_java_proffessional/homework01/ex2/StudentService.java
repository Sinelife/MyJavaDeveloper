package _3_java_proffessional.homework01.ex2;

import _3_java_proffessional.homework00.ex3.Student;

import java.util.Scanner;

public class StudentService {
    private MyExtraCollection<Student> students;
    private Scanner sc = new Scanner(System.in);

    public StudentService() {
        students = new HugeStack<>();
    }

    public void run() {
        int itemNum = -1;
        while (itemNum != 0) {
            outputMessage();
            itemNum = inputParameter(0,4);
            switch (itemNum) {
                case 0:
                    break;
                case 1:
                    outputAllStudents();
                    break;
                case 2:
                    addNewStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    deleteSomeStudents();
            }
        }
    }

    private void outputMessage() {
        System.out.println("МЕНЮ");
        System.out.println("1)Вывести всех студентов");
        System.out.println("2)Добавить нового студента");
        System.out.println("3)Удалить студента");
        System.out.println("4)Удалить заданое количество студентов");
    }

    private void deleteSomeStudents() {
        System.out.println("Введите количество студентов для удаления");
        int number = inputParameter(0, students.size());
        students.removeAll(number);
    }

    private void deleteStudent() {
        students.remove();
    }

    private void addNewStudent() {
        System.out.println("Введите имя студента");
        String name = sc.next();
        System.out.println("Введите фамилию студента");
        String surname = sc.next();
        System.out.println("Введите возраст студента");
        int age = inputParameter(0, 120);
        System.out.println("Введите бал студента");
        double mark = sc.nextDouble();
        students.add(new Student(name, surname, age, mark));
    }

    private void outputAllStudents() {
        System.out.println("Все студенты");
        output();
    }


    private void output() {
        int counter = 1;
        for (Student student : students) {
            System.out.println(counter++ + ")" + student);
        }
    }



    /**   проверка корректности диапазонов и символов при вводе */
    private int inputParameter(int from, int to) {
        int i;
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число.Повторите ввод.");
                sc.next();
            }
            i = Integer.valueOf(sc.next());
            if (i >= from && i <= to) {
                break;
            } else {
                System.out.println("Вы ввели число не входящее в диапазон. Повторите ввод.");
            }
        }
        return i;
    }
}
