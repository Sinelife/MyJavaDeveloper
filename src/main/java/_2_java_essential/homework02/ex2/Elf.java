package _2_java_essential.homework02.ex2;

class Elf extends Hero {
    private final static int NATURE_DAMAGE = 30;
    private String clanName;

    Elf(String name, String surname, int age, int attack, int health, double damageReduction, String clanName) {
        super(name, surname, age, attack, health, damageReduction);
        this.clanName = clanName;
    }

    public String getClanName() {
        return clanName;
    }

    public void setClanName(String clanName) {
        this.clanName = clanName;
    }
}
