package _2_java_essential.homework01.ex4.aggregation;


import java.util.Arrays;

class Warrior {
    private String name;
    private String surname;
    private int age;
    private Weapon[] weapons;

    Warrior(String name, String surname, int age, Weapon[] weapons) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weapons = weapons;
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

    public Weapon[] getWeapons() {
        return weapons;
    }

    public void setWeapon(Weapon[] weapons) {
        this.weapons = weapons;
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weapons=" + Arrays.toString(weapons) +
                "}\n";
    }
}
