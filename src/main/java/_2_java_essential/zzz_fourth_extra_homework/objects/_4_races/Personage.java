package _2_java_essential.zzz_fourth_extra_homework.objects._4_races;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;
import static _2_java_essential.zzz_fourth_extra_homework.objects._4_races.Gender.BOY;
import static _2_java_essential.zzz_fourth_extra_homework.objects._4_races.MagicType.ABSORPTION_MAGIC;
import static _2_java_essential.zzz_fourth_extra_homework.objects._4_races.Race.SILFID;

public class Personage extends AbstractEntity<Personage> {

    protected String name;
    protected String surname;
    protected Race race;
    protected Gender gender;
    protected MagicType magicType;
    protected int age;

    public Personage(String name, String surname, Race race, Gender gender, MagicType magicType, int age) {
        this.name = name;
        this.surname = surname;
        this.race = race;
        this.gender = gender;
        this.magicType = magicType;
        this.age = age;
    }

    public Personage() { }

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

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MagicType getMagicType() {
        return magicType;
    }

    public void setMagicType(MagicType magicType) {
        this.magicType = magicType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", race=" + race +
                ", gender=" + gender.getGender() +
                ", magicType='" + magicType.getType() + '\'' +
                ", age=" + age +
                '\n';
    }

    @Override
    public int compareTo(Personage o) {
        return this.magicType.getType().compareTo(o.magicType.getType());
    }

    @Override
    public Personage getGeneratedElem() {
        return new Personage(
                service.getGeneratedString(NAME),
                service.getGeneratedString(NAME),
                service.getGeneratedEnumValue(SILFID),
                service.getGeneratedEnumValue(BOY),
                service.getGeneratedEnumValue(ABSORPTION_MAGIC),
                service.getGeneratedInteger(0, 3000)
        );
    }
}
