package _2_java_essential.homework06._3_exceptions.ex6;

class Student {

    private String name;
    private String surname;
    private String secondName;
    private int age;
    private double mark;

    Student(String name, String surname, String secondName, int age, double mark) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.age = age;
        this.mark = mark;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
