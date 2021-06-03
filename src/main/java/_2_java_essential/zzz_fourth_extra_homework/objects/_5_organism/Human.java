package _2_java_essential.zzz_fourth_extra_homework.objects._5_organism;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public class Human extends Animal {
    protected String surname;
    protected Gender gender;

    public Human(String name, int age, String surname, Gender gender) {
        super(name, age);
        this.surname = surname;
        this.gender = gender;
    }

    public Human() {}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "surname='" + surname + '\'' +
                ", gender='" + gender.getGender() + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public Organism getGeneratedElem() {
        return new Human(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(1, 120),
                service.getGeneratedString(NAME),
                service.getGeneratedEnumValue(Gender.BOY)
        );
    }
}
