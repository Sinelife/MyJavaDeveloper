package _3_java_proffessional.homework01.ex1;

import java.util.*;

public class Tester {

    public static void main(String[] args) {
        System.out.println("EX1");
        Map<Integer, Student> students = getFilledHashMap();
        HashMapsMethods.output(students);
        List<Student> list = HashMapsMethods.getStudentsWithSameNames(students);
        System.out.println(list);
        list = HashMapsMethods.getStudentsWithSameNamesEntrySet(students);
        System.out.println(list);
        list = HashMapsMethods.getStudentsWithSameNamesValues(students);
        System.out.println(list);


        System.out.println("\n\n\n\n\n\n\nEX2");
        Map<String, Student> otherStudents = getFilledOtherHashMap();
        HashMapsMethods.deleteSomeStudents(otherStudents);
        HashMapsMethods.output(otherStudents);
        otherStudents = getFilledOtherHashMap();
        HashMapsMethods.deleteSomeStudentsEntrySet(otherStudents);
        HashMapsMethods.output(otherStudents);
        otherStudents = getFilledOtherHashMap();
        HashMapsMethods.deleteSomeStudentsKeys(otherStudents);
        HashMapsMethods.output(otherStudents);
    }




    private static Map<Integer, Student> getFilledHashMap() {
        Map<Integer, Student> students = new HashMap<>();
        students.put(1, new Student("Yaroslav", "Serzhan", 22, 79));
        students.put(2, new Student("Alexander", "Yaroshepta", 21, 88));
        students.put(3, new Student("Nikolay", "Belov", 21, 90));
        students.put(4, new Student("Fedor", "Fedorenko", 30, 67));
        students.put(5, new Student("Valeria", "Gurina", 14, 99));
        students.put(6, new Student("Jack", "Johnson", 16, 69));
        students.put(7, new Student("Jack", "Petrov", 34, 74));
        students.put(8, new Student("Maxim", "Vitkovskiy", 21, 83));
        students.put(9, new Student("Anna", "Ovdienko", 19, 84));
        students.put(10, new Student("Maxim", "Ovdienko", 34, 94));
        return students;
    }

    private static Map<String, Student> getFilledOtherHashMap() {
        Map<String, Student> students = new HashMap<>();
        students.put("Lera", new Student("Valeria", "Gurina", 14, 99));
        students.put("PP", new Student("Petr", "Petrov", 34, 74));
        students.put("Max", new Student("Maxim", "Vitkovskiy", 21, 83));
        students.put("A", new Student("Anna", "Ovdienko", 19, 84));
        students.put("Yasia", new Student("Yaroslav", "Serzhan", 22, 79));
        students.put("Alex", new Student("Alexander", "Yaroshepta", 21, 88));
        students.put("Nick", new Student("Nikolay", "Belov", 21, 90));
        students.put("Fed", new Student("Fedor", "Fedorenko", 30, 67));
        students.put("Jj", new Student("Jack", "Johnson", 16, 69));
        return students;
    }
}
