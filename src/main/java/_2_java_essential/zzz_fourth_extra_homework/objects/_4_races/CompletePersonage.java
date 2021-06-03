package _2_java_essential.zzz_fourth_extra_homework.objects._4_races;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.STRING;
import static _2_java_essential.zzz_fourth_extra_homework.objects._4_races.Gender.BOY;
import static _2_java_essential.zzz_fourth_extra_homework.objects._4_races.MagicType.ABSORPTION_MAGIC;
import static _2_java_essential.zzz_fourth_extra_homework.objects._4_races.Race.SILFID;

public class CompletePersonage extends Personage {
    private Weapon weapon;
    private Anathema anathema;

    public CompletePersonage(String name, String surname, Race race, Gender gender, MagicType magicType, int age, Weapon weapon, Anathema anathema) {
        super(name, surname, race, gender, magicType, age);
        this.weapon = weapon;
        this.anathema = anathema;
    }

    public CompletePersonage() { }

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

    public class Weapon extends AbstractEntity<Weapon> {
        private String name;
        private String type;
        private String powerType;
        private Rune rune;

        public Weapon(String name, String type, String powerType, Rune rune) {
            this.name = name;
            this.type = type;
            this.powerType = powerType;
            this.rune = rune;
        }

        public Weapon() { }

        @Override
        public int compareTo(Weapon o) {
            return 0;
        }

        @Override
        public Weapon getGeneratedElem() {
            return new Weapon(
                    service.getGeneratedString(NAME),
                    service.getGeneratedString(NAME),
                    service.getGeneratedString(NAME),
                    new Rune().getGeneratedElem()
            );
        }

        public class Rune extends AbstractEntity<Rune> {
            private String name;
            private String ability;

            public Rune(String name, String ability) {
                this.name = name;
                this.ability = ability;
            }

            public Rune() {}

            @Override
            public String toString() {
                return "Rune{" + "\n\t\t\t\t" +
                        "name='" + name + '\'' + "\n\t\t\t\t" +
                        ", ability='" + ability + '\'' + "\n\t\t\t\t" +
                        '}';
            }

            @Override
            public int compareTo(Rune o) {
                return 0;
            }

            @Override
            public Rune getGeneratedElem() {
                return new Rune(
                        service.getGeneratedString(NAME),
                        service.getGeneratedString(NAME)
                );
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

    public class Anathema extends AbstractEntity<Anathema> {
        private String name;
        private String effect;

        public Anathema(String name, String effect) {
            this.name = name;
            this.effect = effect;
        }

        public Anathema() {}

        @Override
        public String toString() {
            return "Anathema{" + "\n\t\t" +
                    "name='" + name + '\'' + "\n\t\t" +
                    ", effect='" + effect + '\'' + "\n\t\t" +
                    '}';
        }

        @Override
        public int compareTo(Anathema o) {
            return 0;
        }

        @Override
        public Anathema getGeneratedElem() {
            return new Anathema(
                    service.getGeneratedString(STRING),
                    service.getGeneratedString(STRING)
            );
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
                '\n';
    }

    @Override
    public Personage getGeneratedElem() {
        return new CompletePersonage(
                service.getGeneratedString(NAME),
                service.getGeneratedString(NAME),
                service.getGeneratedEnumValue(SILFID),
                service.getGeneratedEnumValue(BOY),
                service.getGeneratedEnumValue(ABSORPTION_MAGIC),
                service.getGeneratedInteger(0, 3000),
                new Weapon().getGeneratedElem(),
                new Anathema().getGeneratedElem()
        );
    }
}


