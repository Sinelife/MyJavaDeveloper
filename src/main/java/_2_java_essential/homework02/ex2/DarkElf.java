package _2_java_essential.homework02.ex2;

class DarkElf extends Elf{
    private static final int POISON_DAMAGE = 20;
    private String lordName;

    DarkElf(String name, String surname, int age, int attack, int health, double damageReduction, String clanName, String lordName) {
        super(name, surname, age, attack, health, damageReduction, clanName);
        this.lordName = lordName;
    }

    public String getLordName() {
        return lordName;
    }

    public void setLordName(String lordName) {
        this.lordName = lordName;
    }
}
