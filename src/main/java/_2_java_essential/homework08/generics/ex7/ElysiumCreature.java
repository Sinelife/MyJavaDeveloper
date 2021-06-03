package _2_java_essential.homework08.generics.ex7;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public class ElysiumCreature extends Creature {
    private AngelType angelType;
    private int holyPower;
    private WingNum wingNum;

    public ElysiumCreature(String name, int age, AngelType angelType, int holyPower, WingNum wingNum) {
        super(name, age);
        this.angelType = angelType;
        this.holyPower = holyPower;
        this.wingNum = wingNum;
    }

    public ElysiumCreature() { }

    @Override
    protected int getCountedMight() {
        return holyPower + angelType.getGraceGodPower() * 10 + wingNum.getNum() * 50;
    }

    @Override
    public String toString() {
        return "ElysiumCreature{" +
                "angelType=" + angelType.getTypeName() +
                ", angelMagicPower=" + holyPower +
                ", wingNum=" + wingNum +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", might=" + might +
                '\n';
    }

    @Override
    public Creature getGeneratedElem() {
        return new ElysiumCreature(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(10, 1_300),
                service.getGeneratedEnumValue(AngelType.ANGEL),
                service.getGeneratedInteger(100, 1_300),
                service.getGeneratedEnumValue(WingNum.EIGHT)
        );
    }

    enum AngelType {
        SERAPH("Серафим", 35),
        CHERUBIM("Херувим", 30),
        THRONE("Престол", 35),
        DOMINION("Господство", 45),
        VIRTUE("Власть", 40),
        POWER("Сила", 50),
        PRINCIPALITY("Начало", 30),
        ARCHANGEL("Архангел", 100),
        ANGEL("Ангел", 10);

        private String typeName;
        private int graceGodPower;

        AngelType(String typeName, int graceGodPower) {
            this.typeName = typeName;
            this.graceGodPower = graceGodPower;
        }

        public String getTypeName() {
            return typeName;
        }

        public int getGraceGodPower() {
            return graceGodPower;
        }
    }

    public enum WingNum {
        TWO(2), FOUR(4), SIX(6), EIGHT(8);

        int num;

        WingNum(int num) {this.num = num;}

        public int getNum() {
            return num;
        }
    }
}
