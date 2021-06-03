package _2_java_essential.homework05._2_inner_nested_classes.ex4;

class SpaceShip {
    private String name;
    private String type;
    private Engine engine;
    private Weapon weapon;

    public SpaceShip(String name, String type) {
        this.name = name;
        this.type = type;
    }

    SpaceShip(String name, String type, Engine engine, Weapon weapon) {
        this.name = name;
        this.type = type;
        this.engine = engine;
        this.weapon = weapon;
    }

    SpaceShip() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "SpaceShip{" + '\n' +
                " name='" + name + '\n' +
                " type='" + type + '\n' +
                " engine=" + engine + '\n' +
                " weapon=" + weapon + '\n' +
                '}';
    }


    public void reloadWeapon() {
        Reloader reloader = new Reloader();
        reloader.reload();
    }

    public void updateEngine() {
        Updater updater = new Updater();
        updater.update();
    }

    public void shoot(int number) {
        if (number > weapon.shoots) {
            number = weapon.shoots;
            weapon.shoots = 0;
        } else {
            weapon.shoots -= number;
        }
        System.out.println("Произведено " + number + " выстрелов!");

    }


    static class Engine {
        private String engineName;
        private int speedInKmInSec;
        private double speedInLightYearInSec;

        Engine(String engineName, int speedInKmInSec, double speedInLightYearInSec) {
            this.engineName = engineName;
            this.speedInKmInSec = speedInKmInSec;
            this.speedInLightYearInSec = speedInLightYearInSec;
        }

        public String getEngineName() {
            return engineName;
        }

        public void setEngineName(String engineName) {
            this.engineName = engineName;
        }

        public int getSpeedInKmInSec() {
            return speedInKmInSec;
        }

        public void setSpeedInKmInSec(int speedInKmInSec) {
            this.speedInKmInSec = speedInKmInSec;
        }

        public double getSpeedInLightYearInSec() {
            return speedInLightYearInSec;
        }

        public void setSpeedInLightYearInSec(double speedInLightYearInSec) {
            this.speedInLightYearInSec = speedInLightYearInSec;
        }


        @Override
        public String toString() {
            return "Engine{" +
                    "engineName='" + engineName + '\'' +
                    ", speedInKmInSec=" + speedInKmInSec +
                    ", speedInLightYearInSec=" + speedInLightYearInSec +
                    '}';
        }
    }


    class Weapon {
        String weaponName;
        String weaponType;
        int shoots;
        int damage;

        Weapon(String weaponName, String weaponType, int shoots, int damage) {
            this.weaponName = weaponName;
            this.weaponType = weaponType;
            this.shoots = shoots;
            this.damage = damage;
        }


        public String getWeaponName() {
            return weaponName;
        }

        public void setWeaponName(String weaponName) {

            this.weaponName = weaponName;
        }

        public String getWeaponType() {
            return weaponType;
        }

        public void setWeaponType(String weaponType) {
            this.weaponType = weaponType;
        }

        public int getShoots() {
            return shoots;
        }

        public void setShoots(int shoots) {
            this.shoots = shoots;
        }

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        @Override
        public String toString() {
            return "Weapon{" +
                    "weaponName='" + weaponName + '\'' +
                    ", weaponType='" + weaponType + '\'' +
                    ", shoots=" + shoots +
                    ", damage=" + damage +
                    '}';
        }

        public String getShipInfo() {
            return SpaceShip.this.toString();
        }

        public String getEngineInfo() {
            return SpaceShip.this.engine.toString();
        }

    }

    private boolean updatePoint = true;


    private class Reloader {
        private void reload() {
            weapon.shoots += 10;
            System.out.println("Оружие перезаряжено!Патронов - " + weapon.shoots);
        }
    }

    private class Updater {
        private void update() {
            if (updatePoint) {
                engine.speedInKmInSec *= 1.1;
                updatePoint = false;
                System.out.println("Двигатель был улучшен!!!");
            } else {
                System.out.println("Двигатель можно улучшить лишь раз.");
            }
        }
    }

}