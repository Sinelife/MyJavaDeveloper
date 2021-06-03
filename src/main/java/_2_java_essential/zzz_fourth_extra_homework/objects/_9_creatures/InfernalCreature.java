package _2_java_essential.zzz_fourth_extra_homework.objects._9_creatures;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public class InfernalCreature extends Creature {
    private DemonType demonType;
    private String secretName;
    private int demonMagicPower;

    public InfernalCreature(String name, int age, DemonType demonType, String secretName, int demonMagicPower) {
        super(name, age);
        this.demonType = demonType;
        this.secretName = secretName;
        this.demonMagicPower = demonMagicPower;
        this.might = getCountedMight();
    }

    public InfernalCreature() {}

    @Override
    public String toString() {
        return demonType.getTypeName() + "(" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", might=" + might +
                ", secretName='" + secretName + '\'' +
                ", demonMagicPower=" + demonMagicPower +
                ")\n";
    }

    @Override
    protected int getCountedMight() {
        return demonMagicPower + demonType.getPandemoniumPower() * 2;
    }

    @Override
    public Creature getGeneratedElem() {
        return new InfernalCreature(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(10, 1_300),
                service.getGeneratedEnumValue(DemonType.IMP),
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(100, 2_000)
        );
    }

    enum  DemonType {
        IMP("Бес", 2),
        DEMON("Демон", 60),
        SUCCUBUS("Сукуб", 100),
        INCUBUS("Инкуб", 120),
        ARCHDEMON("Архидемон", 200),
        DEVIL("Дьявол", 300),
        ARСHDEVIL("Архидьявол", 450),
        PANDEMONIUS("Пандемониус", 550);

        private String typeName;
        private int pandemoniumPower;

        DemonType(String typeName, int pandemoniumPower) {
            this.typeName = typeName;
            this.pandemoniumPower = pandemoniumPower;
        }

        public String getTypeName() {
            return typeName;
        }

        public int getPandemoniumPower() {
            return pandemoniumPower;
        }
    }
}
