package _2_java_essential.zzz_fourth_extra_homework.objects._7_spaceship;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.SPACESHIP_NAME;

public class SpaceShip extends AbstractEntity<SpaceShip> {

    protected String name;
    protected Weapon weapon;
    protected Engine engine;
    protected Integer carryingCapacity;
    protected int scannerPower;
    protected int tankCapacity;

    public SpaceShip(String name, Weapon weapon, Engine engine, int carryingCapacity, int scannerPower, int tankCapacity) {
        this.name = name;
        this.weapon = weapon;
        this.engine = engine;
        this.carryingCapacity = carryingCapacity;
        this.scannerPower = scannerPower;
        this.tankCapacity = tankCapacity;
    }

    public SpaceShip() {}

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", engine=" + engine +
                ", carryingCapacity=" + carryingCapacity +
                ", scannerPower=" + scannerPower +
                ", tankCapacity=" + tankCapacity +
                '\n';
    }

    @Override
    public int compareTo(SpaceShip o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public SpaceShip getGeneratedElem() {
        return new SpaceShip(
                service.getGeneratedString(SPACESHIP_NAME),
                new Weapon().getGeneratedElem(),
                new Engine().getGeneratedElem(),
                service.getGeneratedInteger(100, 10_000),
                service.getGeneratedInteger(1000, 10_000),
                service.getGeneratedInteger(100, 100_000)
        );
    }

    class Weapon extends AbstractEntity<Weapon> {
        private SpaceWeaponType type;
        private int model;

        public Weapon(SpaceWeaponType type, int model) {
            this.type = type;
            this.model = model;
        }

        public Weapon() {}

        public SpaceWeaponType getType() {
            return type;
        }

        @Override
        public String toString() {
            return type.getType() + "-" + model;
        }

        @Override
        public int compareTo(Weapon o) {
            return 0;
        }

        @Override
        public Weapon getGeneratedElem() {
            return new Weapon(
                    service.getGeneratedEnumValue(SpaceWeaponType.ANNIHILATOR),
                    service.getGeneratedInteger(10, 1000)
            );
        }
    }

    class Engine extends AbstractEntity<Engine> {
        private String name;
        private Integer speedInKms;
        private int hyperSpeedPsc;

        public Engine(String name, Integer speedInKms, int hyperSpeedPsc) {
            this.name = name;
            this.speedInKms = speedInKms;
            this.hyperSpeedPsc = hyperSpeedPsc;
        }

        public Engine() { }

        public String getName() {
            return name;
        }

        public Integer getSpeedInKms() {
            return speedInKms;
        }

        public int getHyperSpeedPsc() {
            return hyperSpeedPsc;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "name='" + name + '\'' +
                    ", speedInKms=" + speedInKms +
                    ", hyperSpeedPsc=" + hyperSpeedPsc +
                    '}';
        }

        @Override
        public int compareTo(Engine o) {
            return 0;
        }

        @Override
        public Engine getGeneratedElem() {
            return new Engine(
                    service.getGeneratedString(NAME),
                    service.getGeneratedInteger(10_000_000, 2_000_000_000),
                    service.getGeneratedInteger(10, 1000)
            );
        }
    }

    enum SpaceWeaponType {
        ROCKET("Ракеты", 100),
        TORPEDO("Торпеды", 200),
        PLASMA("Плазменное оружие", 450),
        LASER("Лазерное оружие", 600),
        ENERGY("Энергетическое оружие", 800),
        DISINTEGRATOR("Дезентегратор", 1500),
        ANNIHILATOR("Анигилятор", 1700),
        DARK_MATTER("Темная материя", 3100);

        private String type;
        private Integer power;

        SpaceWeaponType(String type, Integer power) {
            this.type = type;
            this.power = power;
        }

        public Integer getPower() {
            return power;
        }

        public String getType() {
            return type;
        }
    }
}
