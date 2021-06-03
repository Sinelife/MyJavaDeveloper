package _2_java_essential.zzz_fourth_extra_homework.objects._9_creatures;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.STRING;

public class Human extends EarthCreature {
    private String specialization;
    private Magic magic;

    public Human(String name, int age, String surname, String specialization, Magic magic) {
        super(name, age, surname);
        this.specialization = specialization;
        this.magic = magic;
        this.might = getCountedMight();
    }

    public Human() {}

    @Override
    public String toString() {
        return "Человек(" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", might=" + might +
                " specialization='" + specialization + '\'' +
                ", magic=(" + magic.getMagicType().getType() + ", " + magic.getMagicRank().getRank() + ")" +
                ")\n";
    }

    @Override
    protected int getCountedMight() {
        return (int) (3 * magic.getMagicType().getMagicPower() * magic.getMagicRank().getCoefficient());
    }

    @Override
    public Creature getGeneratedElem() {
        return new Human(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(10, 240),
                service.getGeneratedString(NAME),
                service.getGeneratedString(STRING),
                new Magic().getGeneratedElem()
            );
    }

    private class Magic extends AbstractEntity<Magic> {
        private MagicType magicType;
        private MagicRank magicRank;

        public Magic(MagicType magicType, MagicRank magicRank) {
            this.magicType = magicType;
            this.magicRank = magicRank;
        }

        public Magic() { }

        public MagicType getMagicType() {
            return magicType;
        }

        public MagicRank getMagicRank() {
            return magicRank;
        }

        @Override
        public String toString() {
            return magicType.getType() + ", " + magicRank.getRank();
        }

        @Override
        public int compareTo(Magic o) {
            return 0;
        }

        @Override
        public Magic getGeneratedElem() {
            return new Magic(
                    service.getGeneratedEnumValue(MagicType.ELEMENTAL_MAGIC),
                    service.getGeneratedEnumValue(MagicRank.MAGE)
            );
        }
    }

    enum MagicType {
        ELEMENTAL_MAGIC("Стихийная магия", 220),
        RUNE_MAGIC("Руническая магия", 300),
        ANATHEMA_MAGIC("Проклятая магия", 250),
        ARTIFACT_MAGIC("Артефактная магия", 230),
        NECROMANCY("Некромантия", 260),
        CORRUPTION("Порча", 320);

        private String type;
        private int magicPower;

        MagicType(String type, int magicPower) {
            this.type = type;
            this.magicPower = magicPower;
        }

        public String getType() {
            return type;
        }

        public int getMagicPower() {
            return magicPower;
        }
    }

    enum MagicRank {
        APPRENTICE("Ученик", 1.0),
        WIZARD("Волшебник", 1.2),
        MAGE("Маг", 1.4),
        ARCHMAGE("Архимаг",1.6),
        LEGENDARY_MAGE("Легендарный маг", 2.0);

        private String rank;
        private double coefficient;

        MagicRank(String rank, double coefficient) {
            this.rank = rank;
            this.coefficient = coefficient;
        }

        public String getRank() {
            return rank;
        }

        public double getCoefficient() {
            return coefficient;
        }
    }

}
