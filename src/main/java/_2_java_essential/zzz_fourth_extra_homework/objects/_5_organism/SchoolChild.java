package _2_java_essential.zzz_fourth_extra_homework.objects._5_organism;

import java.util.ArrayList;
import java.util.List;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.STRING;

public final class SchoolChild extends Human {
    private List<Integer> marks;
    private String schoolName;

    public SchoolChild(String name, int age, String surname, Gender gender, List<Integer> marks, String schoolName) {
        super(name, age, surname, gender);
        this.marks = marks;
        this.schoolName = schoolName;
    }

    public SchoolChild() {}

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
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Organism getGeneratedElem() {
        return new SchoolChild(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(1, 20),
                service.getGeneratedString(NAME),
                service.getGeneratedGender(),
                getGeneratedMarkList(),
                service.getGeneratedString(STRING)
        );
    }
    private List<Integer> getGeneratedMarkList() {
        List<Integer> marks = new ArrayList<>();
        int size = service.getGeneratedInteger(4, 12);
        for (int i = 0; i < size; i++) {
            marks.add(service.getGeneratedInteger(1, 12));
        }
        return marks;
    }
}
