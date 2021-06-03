package _2_java_essential.homework02.ex2;

class Human extends Hero {
    private static final int WIND_POWER = 40;

    private String title;

    Human(String name, String surname, int age, int attack, int health, double damageReduction, String title) {
        super(name, surname, age, attack, health, damageReduction);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
