package _2_java_essential.homework02.ex2;

class Dwarf extends Hero{
    private String townName;

    Dwarf(String name, String surname, int age, int attack, int health, double damageReduction, String townName) {
        super(name, surname, age, attack, health, damageReduction);
        this.townName = townName;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }
}
