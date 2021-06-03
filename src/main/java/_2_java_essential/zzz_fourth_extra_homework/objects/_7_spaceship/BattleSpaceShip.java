package _2_java_essential.zzz_fourth_extra_homework.objects._7_spaceship;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.SPACESHIP_NAME;

public class BattleSpaceShip extends SpaceShip {
    private int battleRank;

    public BattleSpaceShip(String name, Weapon weapon, Engine engine, int carryingCapacity, int scannerPower, int tankCapacity, int battleRank) {
        super(name, weapon, engine, carryingCapacity, scannerPower, tankCapacity);
        this.battleRank = battleRank;
    }

    public BattleSpaceShip() {}

    @Override
    public String toString() {
        return "BattleSpaceShip{" +
                "battleRank=" + battleRank +
                ", name='" + name + '\'' +
                ", weapon=" + weapon +
                ", engine=" + engine +
                ", carryingCapacity=" + carryingCapacity +
                ", scannerPower=" + scannerPower +
                ", tankCapacity=" + tankCapacity +
                '\n';
    }

    @Override
    public int compareTo(SpaceShip o) {
        return this.weapon.getType().getPower().compareTo(o.weapon.getType().getPower());
    }

    @Override
    public SpaceShip getGeneratedElem() {
        return new BattleSpaceShip(
                service.getGeneratedString(SPACESHIP_NAME),
                new Weapon().getGeneratedElem(),
                new Engine().getGeneratedElem(),
                service.getGeneratedInteger(100, 10_000),
                service.getGeneratedInteger(1000, 10_000),
                service.getGeneratedInteger(100, 100_000),
                service.getGeneratedInteger(10, 4_000)
        );
    }
}
