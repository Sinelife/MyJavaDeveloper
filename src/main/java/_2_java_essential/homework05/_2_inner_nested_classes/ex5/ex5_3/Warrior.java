package _2_java_essential.homework05._2_inner_nested_classes.ex5.ex5_3;

import java.util.*;

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

    static class Weapon {
        private String name;
        private String type;

        Weapon(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }


        @Override
        public String toString() {
            return "Weapon{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Weapon)) return false;
            Weapon weapon = (Weapon) o;
            return Objects.equals(getName(), weapon.getName()) &&
                    Objects.equals(getType(), weapon.getType());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getType());
        }
    }
}
