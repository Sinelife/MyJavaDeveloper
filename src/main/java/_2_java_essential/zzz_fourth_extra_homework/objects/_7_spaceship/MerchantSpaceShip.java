package _2_java_essential.zzz_fourth_extra_homework.objects._7_spaceship;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.SPACESHIP_NAME;

public class MerchantSpaceShip extends SpaceShip {
    private int merchantRang;
    private int fails;

    public MerchantSpaceShip(String name, Weapon weapon, Engine engine, int carryingCapacity, int scannerPower, int tankCapacity, int merchantRang, int fails) {
        super(name, weapon, engine, carryingCapacity, scannerPower, tankCapacity);
        this.merchantRang = merchantRang;
        this.fails = fails;
    }

    public MerchantSpaceShip() { }

    @Override
    public String toString() {
        return "MerchantSpaceShip{" +
                "merchantRang=" + merchantRang +
                ", fails=" + fails +
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
        return this.engine.getSpeedInKms().compareTo(o.engine.getSpeedInKms());
    }

    @Override
    public SpaceShip getGeneratedElem() {
        return new MerchantSpaceShip(
                service.getGeneratedString(SPACESHIP_NAME),
                new Weapon().getGeneratedElem(),
                new Engine().getGeneratedElem(),
                service.getGeneratedInteger(100, 10_000),
                service.getGeneratedInteger(1000, 10_000),
                service.getGeneratedInteger(100, 100_000),
                service.getGeneratedInteger(1, 100_000),
                service.getGeneratedInteger(1, 1_000)
        );
    }
}
