package _3_java_proffessional.homework06.ex3;


import _3_java_proffessional.homework06.ex3.annotations.MyClass;
import _3_java_proffessional.homework06.ex3.annotations.MyField;
import _3_java_proffessional.homework06.ex3.annotations.MyMethod;

import java.util.List;
import java.util.NoSuchElementException;

@MyClass(name = "Студент")
class Student {


    private String name;

    @MyField(name = "фамилия")
    private String surname;

    @MyField(name = "возраст")
    private Integer age;

    @MyField(name = "средний бал")
    private Double averageMark;

    @MyField(name = "пол")
    private Gender gender;

    private Student() {}

    private Student(String name, String surname, Integer age, Double averageMark, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageMark = averageMark;
        this.gender = gender;
    }


    @MyMethod
    private String getMarkInLetter() {
        if (averageMark > 90) {
            return "A";
        } else if (averageMark > 80) {
            return "B";
        } else if (averageMark > 70) {
            return "C";
        } else if (averageMark > 64) {
            return "D";
        } else if (averageMark > 59) {
            return "E";
        } else if (averageMark >= 0) {
            return "F";
        }
        throw new NoSuchElementException("Оценка может быть только от 0 до 100");
    }

    @MyMethod
    private static double getAverageMarkOfList(List<Student> students) {
        double sum = 0;
        for (Student student : students) {
            sum += student.averageMark;
        }
        return sum / students.size();
    }

    @MyMethod
    private static Student getStudentWithTheBestMark(List<Student> students) {
        Student maxStudent = students.get(0);
        for (Student student : students) {
            if (student.averageMark > maxStudent.averageMark) {
                maxStudent = student;
            }
        }
        return maxStudent;
    }

    @MyMethod
    private static void sortStudentsByMark(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i; j < students.size(); j++) {
                if(students.get(j).averageMark < students.get(i).averageMark){
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }
}
