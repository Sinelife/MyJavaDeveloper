package _2_java_essential.zzz_fourth_extra_homework.objects._5_organism;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.STRING;

public final class Student extends Human {
    private String specialization;
    private double averageMark;

    public Student(String name, int age, String surname, Gender gender, String specialization, double averageMark) {
        super(name, age, surname, gender);
        this.specialization = specialization;
        this.averageMark = averageMark;
    }

    public Student() {}

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
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public Organism getGeneratedElem() {
        return new Student(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(1, 50),
                service.getGeneratedString(NAME),
                service.getGeneratedGender(),
                service.getGeneratedString(STRING),
                service.getGeneratedDouble(60, 100)
        );
    }
}
