package _2_java_essential.homework03.ex1;

import java.util.List;

final class SchoolChild extends Human {
    private List<Integer> marks;
    private String schoolName;

    SchoolChild(String name, int age, String surname, String sex, List<Integer> marks, String schoolName) {
        super(name, age, surname, sex);
        this.marks = marks;
        this.schoolName = schoolName;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "SchoolChild{" +
                "marks=" + marks +
                ", schoolName='" + schoolName + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is " + name + ". I am school" + (sex.equals("male") ? "boy" : "girl") + " from school " + schoolName + ".");
    }

    @Override
    int getLegsNum() {
        return 2;
    }
}
