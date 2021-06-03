package _2_java_essential.zzz_fourth_extra_homework.objects._3_employee;
import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;
import java.util.*;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.*;

public class Student extends AbstractEntity<Student> {
    private String name;
    private String surname;
    private int age;
    private List<SubjectMark> markList;
    private Double avgMark;

    public Student() {}

    public Student(String name, String surname, int age, List<SubjectMark> markList) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.markList = markList;
        this.avgMark = getAverageMark();
    }

    private Double getAverageMark() {
        double points = 0;
        int creditNum = 0;
        for (SubjectMark subjectMark : markList) {
            creditNum += subjectMark.credits;
            points += subjectMark.mark * subjectMark.credits;
        }
        return points / creditNum;
    }

    @Override
    public int compareTo(Student o) {
        return this.avgMark.compareTo(o.avgMark);
    }

    @Override
    public Student getGeneratedElem() {
        ArrayList<SubjectMark> list = new ArrayList<>();
        int num = service.getGeneratedInteger(3, 8);
        for (int i = 0; i < num; i++) {
            list.add(new SubjectMark().getGeneratedElem());
        }
        return new Student(
                service.getGeneratedString(NAME),
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(18, 60),
                list
        );
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", markList=" + markList +
                ", avgMark=" + avgMark +
                '}';
    }

    private static class SubjectMark extends AbstractEntity<SubjectMark> {
        private String subjectName;
        private int mark;
        private int credits;

        public SubjectMark() {}

        public SubjectMark(String subjectName, int mark, int credits) {
            this.subjectName = subjectName;
            this.mark = mark;
            this.credits = credits;
        }

        @Override
        public String toString() {
            return subjectName + ": " + mark + ", " + credits + "cr. ";
        }

        @Override
        public int compareTo(SubjectMark o) {
            return 0;
        }

        @Override
        public SubjectMark getGeneratedElem() {
            return new SubjectMark(
                    service.getGeneratedString(SUBJECT),
                    service.getGeneratedInteger(60, 100),
                    service.getGeneratedInteger(1, 8)
            );
        }
    }
}
