package _2_java_essential.homework06._1_anonymous_classes.ex3;

import java.util.*;

class Student {
    private String name;
    private String surname;
    private int age;
    private List<MarkSubjectObject> marks;

    Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<MarkSubjectObject> getMarks() {
        return marks;
    }

    public void setMarks(List<MarkSubjectObject> marks) {
        this.marks = marks;
    }

    public int getSummaryMark() {
        int sumMark = 0;
        for (MarkSubjectObject mark : marks) {
            sumMark += mark.mark;
        }
        return sumMark;
    }

    public int getSummaryMarkIncludeCredits() {
        int sumMark = 0;
        for (MarkSubjectObject mark : marks) {
            sumMark += mark.mark * mark.credits;
        }
        return sumMark;
    }


    public int getSummaryCreditsNum() {
        int sumCredits = 0;
        for (MarkSubjectObject mark : marks) {
            sumCredits += mark.credits;
        }
        return sumCredits;
    }

    static class MarkSubjectObject {
        private String subjectName;
        private double credits;
        private int mark;

        MarkSubjectObject(String subjectName, double credits, int mark) {
            this.subjectName = subjectName;
            this.credits = credits;
            this.mark = mark;
        }
    }


    public void getInitializedMarks() {
        marks = new ArrayList<>();
        marks.add(new MarkSubjectObject("Math", 2, 90));
        marks.add(new MarkSubjectObject("C++", 4, 77));
        marks.add(new MarkSubjectObject("Java", 4, 97));
        marks.add(new MarkSubjectObject("C#", 3, 81));
        marks.add(new MarkSubjectObject("Assembler", 1, 61));
    }

}
