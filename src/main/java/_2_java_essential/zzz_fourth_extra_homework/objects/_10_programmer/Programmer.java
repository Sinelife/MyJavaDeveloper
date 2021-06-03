package _2_java_essential.zzz_fourth_extra_homework.objects._10_programmer;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.*;
import static _2_java_essential.zzz_fourth_extra_homework.objects._10_programmer.MyString.StringSortVariant.*;


public class Programmer extends AbstractEntity<Programmer> {
    private static ProgrammerSortVariant sortVariant = ProgrammerSortVariant.NAME_ALPHABET;
    private MyString name;
    private String surname;
    private Rank rank;
    private Integer salary;

    public Programmer(MyString name, String surname, Rank rank, int salary) {
        this.name = name;
        this.surname = surname;
        this.rank = rank;
        this.salary = salary;
    }

    public Programmer() { }

    @Override
    public String toString() {
        return "Programmer{" +
                "name=" + name +
                ", surname='" + surname + '\'' +
                ", rank=" + rank +
                ", salary=" + salary +
                "\n";
    }


    public static void setSortVariant(ProgrammerSortVariant sortVariant) {
        Programmer.sortVariant = sortVariant;
    }

    public static ProgrammerSortVariant getSortVariant() {
        return sortVariant;
    }

    @Override
    public int compareTo(Programmer o) {
        switch (sortVariant) {
            case RANK:
                return this.rank.rank.compareTo(o.rank.rank);
            case SALARY_DECREASE:
                return o.salary.compareTo(this.salary);
            case SALARY_INCREASE:
                return this.salary.compareTo(o.salary);
            case NAME_NON_ALPHABET:
                MyString.setSortVariant(NON_ALPHABET);
                break;
            case NAME_ALPHABET_FROM_END:
                MyString.setSortVariant(ALPHABET_FROM_END);
                break;
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public Programmer getGeneratedElem() {
        Rank rank = service.getGeneratedEnumValue(Rank.JUNIOR);
        return new Programmer(
                new MyString(service.getGeneratedString(NAME)),
                service.getGeneratedString(NAME),
                rank,
                service.getGeneratedInteger(rank.getMin(), rank.getMax())
        );
    }


    enum Rank {
        JUNIOR("Младший разработчик", 500, 1_200, 1),
        MIDDLE("Разработчик", 1_500, 2_400, 2),
        SENIOR("Старший разработчик", 3_000, 4_500, 3),
        TEAM_LEAD("Ведущий разработчик", 5_000, 8_000, 4),
        ARCHITECT("Архитектор", 10_000, 15_000, 5),
        MAIN_ARCHITECT("Главный архитектор", 21_000, 30_000, 6);

        private String name;
        private Integer min;
        private Integer max;
        private Integer rank;

        Rank(String name, int min, int max, int rank) {
            this.name = name;
            this.min = min;
            this.max = max;
            this.rank = rank;
        }

        public Integer getRank() {
            return rank;
        }

        public String getName() {
            return name;
        }

        public int getMax() {
            return max;
        }

        public int getMin() {
            return min;
        }
    }

    public enum ProgrammerSortVariant {
        NAME_ALPHABET,
        NAME_NON_ALPHABET,
        SALARY_INCREASE,
        SALARY_DECREASE,
        NAME_ALPHABET_FROM_END,
        RANK
    }
}
