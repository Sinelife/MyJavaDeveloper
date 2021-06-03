package _2_java_essential.homework08.generics.ex7;

public class EarthCreature extends Creature {
    private String surname;

    public EarthCreature(String name, int age, String surname) {
        super(name, age);
        this.surname = surname;
    }

    public EarthCreature() {}
}
