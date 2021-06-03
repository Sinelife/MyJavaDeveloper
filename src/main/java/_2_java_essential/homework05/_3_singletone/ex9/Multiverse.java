package _2_java_essential.homework05._3_singletone.ex9;

import java.math.BigDecimal;
import java.util.*;

class Multiverse {
    private static God god;
    private List<Civilization> civilizations;

    static final class God {
        private static final God god = new God();

        public static God getGod() {
            return god;
        }

        public void createDemiGod() {
            int demigodNum = DemiGod.demiGods.size();
            DemiGod.demiGods.put(demigodNum + 1, new DemiGod(String.valueOf(demigodNum)));
        }
    }

    static final class DemiGod {
        private static HashMap<Integer, DemiGod> demiGods = new HashMap<>();
        private String name;

        DemiGod(String name) {
            this.name = name;
        }

        public static DemiGod getDemiGod(int demigodNumber) {
            if (demigodNumber > demiGods.size()) {
                return null;
            }
            return demiGods.get(demigodNumber);
        }
    }

    static class Civilization {
        private String name;
        private CivilizationType civilizationType;
        private CivilizationRaceType raceType;
        private StateType stateType;
        private long individualsNum;
        private LifeSpan lifeSpan;
        private String creator;
        private boolean isAlive;

        public Civilization(String name, CivilizationType civilizationType, CivilizationRaceType raceType, StateType stateType, long individualsNum, LifeSpan lifeSpan, String creator, boolean isAlive) {
            this.name = name;
            this.civilizationType = civilizationType;
            this.raceType = raceType;
            this.stateType = stateType;
            this.individualsNum = individualsNum;
            this.lifeSpan = lifeSpan;
            this.creator = creator;
            this.isAlive = isAlive;
        }
    }


    enum LifeSpan {
        MORTAL_LOWEST("Черезмерно низкая продолжительность жизни", BigDecimal.valueOf(0), BigDecimal.valueOf(100)),
        MORTAL_VERY_LOW("Очень низкая продолжительность жизни", BigDecimal.valueOf(101), BigDecimal.valueOf(1_000)),
        MORTAL_LOW("Низкая продолжительность жизни", BigDecimal.valueOf(1_001), BigDecimal.valueOf(10_000)),
        MORTAL_MEDIUM("Средняя продолжительность жизни",BigDecimal.valueOf(10_001), BigDecimal.valueOf(1_000_000)),
        MORTAL_HIGH("Высокая продолжительность жизни", BigDecimal.valueOf(1_000_001), BigDecimal.valueOf(100_000_000)),
        MORTAL_VERY_HIGH("Очень высокая продолжительность жизни",BigDecimal.valueOf(100_000_001), new BigDecimal("10_000_000_000")),
        MORTAL_HIGHEST("Высочайшая продолжительность жизни", new BigDecimal("10_000_000_001"), new BigDecimal("1_000_000_000_000")),
        NEARLY_IMMORTAL("Практически полное или полное бессмертие к времени", new BigDecimal("10_000_000_001"), new BigDecimal(Double.POSITIVE_INFINITY)),
        IMMORTAL("Полное бессмертие к времени и практиечски полное бессмертие ко всему остальному", new BigDecimal(Double.POSITIVE_INFINITY), new BigDecimal(Double.POSITIVE_INFINITY)),
        ABSOLUTELY_IMMORTAL("Абсолютное бессмертие", new BigDecimal(Double.POSITIVE_INFINITY), new BigDecimal(Double.POSITIVE_INFINITY));

        String description;
        BigDecimal minAge;
        BigDecimal maxAge;

        LifeSpan(String description, BigDecimal minAge, BigDecimal maxAge) {
            this.description = description;
            this.minAge = minAge;
            this.maxAge = maxAge;
        }
    }

    enum StateType {
        EMPIRE("Империя"),
        ARISTOCRACY("Аристократия"),
        DEMOCRACY("Демократия"),
        SWARM("Рой"),
        ANARCHY("Анархия"),
        UN_STATE("Отсутсвие государства");

        String name;

        StateType(String name) {
            this.name = name;
        }
    }

    enum CivilizationRaceType {
        ENERGY("Энергетические формы жизни"),
        BIOLOGICAL("Биологические формы жизни"),
        ARTIFICIAL("Искуственные формы жизни");

        String raceType;

        CivilizationRaceType(String raceType) {
            this.raceType = raceType;
        }
    }

    enum CivilizationType {
        ZERO("0-й тип", EnergyIntakeScale.SUB_PLANET),
        FIRST("1-й тип", EnergyIntakeScale.PLANET),
        SECOND("2-й тип", EnergyIntakeScale.STAR_SYSTEM),
        THIRD("3-й тип", EnergyIntakeScale.GALAXY),
        FOURTH("4-й тип", EnergyIntakeScale.GALAXY_SUPER_CLUSTER),
        FIFTH("5-й тип", EnergyIntakeScale.UNIVERSE),
        SIXTH("6-й тип", EnergyIntakeScale.MULTIVERSE);

        String type;
        EnergyIntakeScale intakeScale;

        CivilizationType(String type, EnergyIntakeScale intakeScale) {
            this.type = type;
            this.intakeScale = intakeScale;
        }
    }

    enum EnergyIntakeScale {
        SUB_PLANET("Суб-планетарный уровень"),
        PLANET("Планетарный уровень"),
        STAR_SYSTEM("Звездно-системный уровень"),
        GALAXY("Галактический уровень"),
        GALAXY_SUPER_CLUSTER("Уровень галактический сверхскоплений"),
        UNIVERSE("Вселенский уровень"),
        MULTIVERSE("Мультивселенский уровень");

        String level;

        EnergyIntakeScale(String level) {
            this.level = level;
        }
    }

}
