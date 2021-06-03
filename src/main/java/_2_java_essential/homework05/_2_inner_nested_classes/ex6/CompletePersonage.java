package _2_java_essential.homework05._2_inner_nested_classes.ex6;


import java.util.*;

class CompletePersonage extends Personage {

    private Weapon weapon;
    private Anathema anathema;

    CompletePersonage(String name, String surname, Race race, Gender gender, String magicType, int age, Weapon weapon, Anathema anathema) {
        super(name, surname, race, gender, magicType, age);
        this.weapon = weapon;
        this.anathema = anathema;
    }

    CompletePersonage() {

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Anathema getAnathema() {
        return anathema;
    }

    public void setAnathema(Anathema anathema) {
        this.anathema = anathema;
    }

    static class Weapon {
        private String name;
        private String type;
        private String powerType;
        private Rune rune;

        Weapon(String name, String type, String powerType, Rune rune) {
            this.name = name;
            this.type = type;
            this.powerType = powerType;
            this.rune = rune;
        }

        Weapon() {

        }

        class Rune {
            private String name;
            private String ability;

            Rune(String name, String ability) {
                this.name = name;
                this.ability = ability;
            }

            @Override
            public String toString() {
                return "Rune{" + "\n\t\t\t\t" +
                        "name='" + name + '\'' + "\n\t\t\t\t" +
                        ", ability='" + ability + '\'' + "\n\t\t\t\t" +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Weapon{" + "\n\t\t" +
                    "name='" + name + '\'' + "\n\t\t" +
                    ", type='" + type + '\'' + "\n\t\t" +
                    ", powerType='" + powerType + '\'' + "\n\t\t" +
                    ", rune=" + rune + "\n\t\t" +
                    '}';
        }
    }

    class Anathema {
        private String name;
        private String effect;

        Anathema(String name, String effect) {
            this.name = name;
            this.effect = effect;
        }

        @Override
        public String toString() {
            return "Anathema{" + "\n\t\t" +
                    "name='" + name + '\'' + "\n\t\t" +
                    ", effect='" + effect + '\'' + "\n\t\t" +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CompletePersonage{" + "\n" +
                "  name='" + name + '\'' + "\n" +
                "  surname='" + surname + '\'' + "\n" +
                "  race=" + race.getRace() + "\n" +
                "  gender=" + gender.getGender() + "\n" +
                "  magicType='" + magicType + '\'' + "\n" +
                "  age=" + age + "\n" +
                "  weapon=" + weapon + "\n" +
                "  anathema=" + anathema + "\n" +
                '}';
    }



    public List<CompletePersonage> getPersonagesWithSameAnathemaAbility(List<CompletePersonage> personages) {
        List<CompletePersonage> list = new ArrayList<>();
        for (CompletePersonage personage : personages) {
            if (personage.anathema != null && this.anathema.effect.equals(personage.anathema.effect)) {
                list.add(personage);
            }
        }
        return list;
    }

    public List<CompletePersonage> getPersonagesWithSameWeaponType(List<CompletePersonage> personages) {
        List<CompletePersonage> list = new ArrayList<>();
        for (CompletePersonage personage : personages) {
            if (this.weapon.type.equals(personage.weapon.type)) {
                list.add(personage);
            }
        }
        return list;
    }

    public List<CompletePersonage> getPersonagesWithSameWeaponRuneAbility(List<CompletePersonage> personages) {
        List<CompletePersonage> list = new ArrayList<>();
        for (CompletePersonage personage : personages) {
            if (this.weapon.rune.ability.equals(personage.weapon.rune.ability)) {
                list.add(personage);
            }
        }
        return list;
    }

    public static List<CompletePersonage> getPersonagesWithChosenWeaponPowerType(List<CompletePersonage> personages, List<String> powerTypes) {
        List<CompletePersonage> list = new ArrayList<>();
        for (CompletePersonage personage : personages) {
            if (powerTypes.contains(personage.weapon.powerType)) {
                list.add(personage);
            }
        }
        return list;
    }
}

enum Gender {
    GIRL("Девушка"),
    BOY("Парень");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}

enum Race {
    ELDAR("Эльдар", RaceRang.NORMAL_RACE),
    ELKAS("Элькас", RaceRang.NORMAL_RACE),
    NEPHELIM("Нефелим", RaceRang.SUPERIOR_RACE),
    SILFID("Сильфид", RaceRang.HIGH_RACE),
    ARCHONT("Архонт", RaceRang.HIGH_RACE);


    private String race;
    private RaceRang raceStatus;

    Race(String race, RaceRang raceStatus) {
        this.race = race;
        this.raceStatus = raceStatus;
    }

    public String getRace() {
        return race;
    }

    public RaceRang getRaceStatus() {
        return raceStatus;
    }
}

enum RaceRang {
    SUPERIOR_RACE("Высшая раса"),
    HIGH_RACE("Средняя раса"),
    NORMAL_RACE("Обычная раса");

    private String raceStatus;

    RaceRang(String raceStatus) {
        this.raceStatus = raceStatus;
    }

    public String getStatus() {
        return raceStatus;
    }
}


