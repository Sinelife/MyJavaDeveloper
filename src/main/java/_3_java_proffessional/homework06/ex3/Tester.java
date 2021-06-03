package _3_java_proffessional.homework06.ex3;

import java.util.ArrayList;
import java.util.List;

class Tester {
    public static void main(String[] args) {
        StudentDecorator student = new StudentDecorator("Ярослав", "Сержан", 22, 78.6, Gender.BOY);
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAge());
        System.out.println(student.getAverageMark());
        System.out.println(student.getGender());
        System.out.println(student.toString());
        student.setName("Алина");
        student.setSurname("Черняева");
        student.setAge(20);
        student.setAverageMark(90.0);
        student.setGender(Gender.GIRL);
        System.out.println(student);
        System.out.println("Оценка в буквах " + student.getName() + student.getSurname() + " - " + student.getMarkInLetter());
        List<StudentDecorator> students = getInitializedList();
        System.out.println("Средний бал всех студентов списка - " + student.getAverageMarkOfList(students));
        System.out.println("Лучший ученик - " + student.getStudentWithTheBestMark(students));
        System.out.println("\n\n");
        System.out.println(students);
        student.sortStudentsByMark(students);
        System.out.println(students);
    }

    private static List<StudentDecorator> getInitializedList() {
        List<StudentDecorator> students = new ArrayList<>();
        students.add(new StudentDecorator("Ярослав", "Сержан", 22, 78.6, Gender.BOY));
        students.add(new StudentDecorator("Мария", "Кривоконь", 21, 81.2, Gender.GIRL));
        students.add(new StudentDecorator("Олександр", "Ярошепта", 21, 98.6, Gender.BOY));
        students.add(new StudentDecorator("Петр", "Петров", 28, 63.0, Gender.BOY));
        students.add(new StudentDecorator("Борис", "Мельник", 21, 89.9, Gender.BOY));
        return students;
    }
}
