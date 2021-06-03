package _2_java_essential.zzz_fourth_extra_homework.objects._7_spaceship;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.SPACESHIP_NAME;

public class TransportSpaceShip extends SpaceShip {
    private String corporationName;

    public TransportSpaceShip(String name, Weapon weapon, Engine engine, int carryingCapacity, int scannerPower, int tankCapacity, String corporationName) {
        super(name, weapon, engine, carryingCapacity, scannerPower, tankCapacity);
        this.corporationName = corporationName;
    }

    public TransportSpaceShip() { }

    @Override
    public String toString() {
        return "TransportSpaceShip{" +
                "corporationName='" + corporationName + '\'' +
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
        return this.carryingCapacity.compareTo(o.carryingCapacity);
    }

    @Override
    public SpaceShip getGeneratedElem() {
        return new TransportSpaceShip(
                service.getGeneratedString(SPACESHIP_NAME),
                new Weapon().getGeneratedElem(),
                new Engine().getGeneratedElem(),
                service.getGeneratedInteger(100, 10_000),
                service.getGeneratedInteger(1000, 10_000),
                service.getGeneratedInteger(100, 100_000),
                service.getGeneratedString(NAME) + " Corporation"
        );
    }
}
