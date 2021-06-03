package _2_java_essential.homework02.ex2;

class ForestElf extends Elf {
    private int druidPower;

    ForestElf(String name, String surname, int age, int attack, int health, double damageReduction, String clanName, int druidPower) {
        super(name, surname, age, attack, health, damageReduction, clanName);
        this.druidPower = druidPower;
    }

    public int getDruidPower() {
        return druidPower;
    }

    public void setDruidPower(int druidPower) {
        this.druidPower = druidPower;
    }
}
