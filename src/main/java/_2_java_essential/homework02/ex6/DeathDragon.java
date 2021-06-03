package _2_java_essential.homework02.ex6;

class DeathDragon extends Dragon {

    private int deathPower;

    DeathDragon(String name, int age, int deathPower) {
        super(name, age);
        this.deathPower = deathPower;
        this.hash = hashCode();
    }

    int getDeathPower() {
        return deathPower;
    }

    @Override
    public String toString() {
        return "DeathDragon{" +
                "name = " + name + ", " +
                "age = " + age + ", " +
                "deathPower = " + deathPower + ", " +
                "hashcode=" + hashCode() +
                "}\n";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + deathPower;
    }
}
