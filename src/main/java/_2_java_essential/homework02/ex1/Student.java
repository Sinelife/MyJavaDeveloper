package _2_java_essential.homework02.ex1;

final class Student extends Human {
    private String specialization;
    private double averageMark;

    Student(String name, int age, String surname, String sex, String specialization, double averageMark) {
        super(name, age, surname, sex);
        this.specialization = specialization;
        this.averageMark = averageMark;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


    @Override
    public String toString() {
        return "Student{" +
                "specialization='" + specialization + '\'' +
                ", averageMark=" + averageMark +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is " + name + ". I am student.");
    }
}
