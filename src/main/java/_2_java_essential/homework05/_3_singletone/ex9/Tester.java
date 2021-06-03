package _2_java_essential.homework05._3_singletone.ex9;

import  _2_java_essential.homework05._3_singletone.ex9.Multiverse.*;

public class Tester {
    public static void main(String[] args) {
        God god = God.getGod();
        god.createDemiGod();
        god.createDemiGod();

        DemiGod firstDemigod = DemiGod.getDemiGod(1);
        DemiGod secondDemigod = DemiGod.getDemiGod(2);
        DemiGod thirdDemigod = DemiGod.getDemiGod(3);
        System.out.println(firstDemigod + "  " + secondDemigod + "  " + thirdDemigod);


        Civilization humans = new Civilization("Люди", CivilizationType.ZERO, CivilizationRaceType.BIOLOGICAL, StateType.DEMOCRACY, 7_600_000_000L, LifeSpan.MORTAL_LOWEST, "Асгарды", true);
    }
}
