package _2_java_essential.homework02.ex2;

class Hero{
    private String name;
    private String surname;
    private int age;
    private int attack;
    private int health;
    private double damageReduction;

    Hero(String name, String surname, int age, int attack, int health, double damageReduction) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.attack = attack;
        this.health = health;
        this.damageReduction = damageReduction;
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(double damageReduction) {
        this.damageReduction = damageReduction;
    }
}
