package _2_java_essential.homework08.generics.ex7;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public class Dragon extends EarthCreature {
    private DragonType dragonType;
    private Color color;

    public Dragon(String name, int age, String surname, DragonType dragonType, Color color) {
        super(name, age, surname);
        this.dragonType = dragonType;
        this.color = color;
    }

    public Dragon() { }

    @Override
    public String toString() {
        return color.getColor() + " " + dragonType.getDragonType() + "{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", might=" + might +
                '\n';
    }

    @Override
    protected int getCountedMight() {
        return (int) (dragonType.getCoefficient() * color.getDragonPoints() * 4);
    }

    @Override
    public Creature getGeneratedElem() {
        return new Dragon(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(10, 240),
                service.getGeneratedString(NAME),
                service.getGeneratedEnumValue(DragonType.DRAGON),
                service.getGeneratedEnumValue(Color.BLACK)
        );
    }

    enum DragonType {
        WYVERN("Виверна", 1.1),
        HYDRA("Гидра", 1.15),
        DRACOLICH("Драколич", 1.2),
        DRAGON("Дракон", 1.25),
        DRAGONID("Драконид", 1.3);

        String dragonType;
        double coefficient;

        DragonType(String dragonType, double coefficient) {
            this.dragonType = dragonType;
            this.coefficient = coefficient;
        }

        public String getDragonType() {
            return dragonType;
        }

        public double getCoefficient() {
            return coefficient;
        }
    }

    enum Color {
        GREEN("Зеленый", 120),
        YELLOW("Желтый", 130),
        BLUE("Синий", 150),
        RED("Красный", 170),
        BROWN("Бурый", 180),
        WHITE("Белый", 200),
        BLACK("Черный", 230),
        BRONZE("Бронзовый", 240),
        SILVER("Серебряный", 260),
        GOLD("Золотой", 270),
        RUBY("Рубиновый", 285),
        EMERALD("Изумрудный", 290),
        SAPPHIRE("Сапфировый", 295),
        DIAMOND("Брилиантовый", 300);

        private String color;
        private int dragonPoints;

        Color(String color, int dragonPoints) {
            this.color = color;
            this.dragonPoints = dragonPoints;
        }

        public String getColor() {
            return color;
        }

        public int getDragonPoints() {
            return dragonPoints;
        }
    }
}
