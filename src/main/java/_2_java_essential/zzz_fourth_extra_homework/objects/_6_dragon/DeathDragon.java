package _2_java_essential.zzz_fourth_extra_homework.objects._6_dragon;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public class DeathDragon extends Dragon {
    private int deathPower;

    public DeathDragon(String name, int age, int deathPower) {
        super(name, age);
        this.deathPower = deathPower;
    }

    public DeathDragon() {}

    int getDeathPower() {
        return deathPower;
    }

    public void setDeathPower(int deathPower) {
        this.deathPower = deathPower;
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

    @Override
    public Dragon getGeneratedElem() {
        return new DeathDragon(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(1, 10_000),
                service.getGeneratedInteger(300, 6_000)
        );
    }
}
