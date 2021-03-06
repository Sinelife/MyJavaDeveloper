package _2_java_essential.homework08.generics.ex7;
import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.*;

public class Human extends EarthCreature {
    private String specialization;
    private Magic magic;

    public Human(String name, int age, String surname, String specialization, Magic magic) {
        super(name, age, surname);
        this.specialization = specialization;
        this.magic = magic;
    }

    public Human() {}

    @Override
    public String toString() {
        return "Human{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", might=" + might +
                "specialization='" + specialization + '\'' +
                ", magic=(" + magic.getMagicType().getType() + ", " + magic.getMagicRank().getRank() + ")" +
                '\n';
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
        ELEMENTAL_MAGIC("?????????????????? ??????????", 220),
        RUNE_MAGIC("???????????????????? ??????????", 300),
        ANATHEMA_MAGIC("?????????????????? ??????????", 250),
        ARTIFACT_MAGIC("?????????????????????? ??????????", 230),
        NECROMANCY("??????????????????????", 260),
        CORRUPTION("??????????", 320);

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
        APPRENTICE("????????????", 1.0),
        WIZARD("??????????????????", 1.2),
        MAGE("??????", 1.4),
        ARCHMAGE("??????????????",1.6),
        LEGENDARY_MAGE("?????????????????????? ??????", 2.0);

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
