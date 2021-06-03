package _3_java_proffessional.homework04.ex1;

class Student {
    private String name;
    private String surname;
    private int age;
    private double averageMark;
    private Gender gender;


    public Student(String name, String surname, int age, double averageMark, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageMark = averageMark;
        this.gender = gender;
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

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " "
                + surname + ", "
                + age + "лет, бал - "
                + averageMark + ", "
                + gender.getGender() + ".";
    }
}
