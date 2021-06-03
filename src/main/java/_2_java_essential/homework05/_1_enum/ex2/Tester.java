package _2_java_essential.homework05._1_enum.ex2;

import java.util.*;

class Tester {
    public static void main(String[] args) {
        List<Personage> list = Personage.getInitializedList();
        Personage silvi = new Personage("Сильви", "Сильверсол", Race.SILFID, Gender.GIRL, "Магия Серебряных Сильфидов", 55);
        Personage.output(list, "");
        list.add(silvi);

        /**EX1*/
        System.out.println("\n\n\nEX1");
        List<Personage> list1 = silvi.getPersonagesWithSameMagic(list);
        Personage.output(list1, "");


        /**EX2*/
        System.out.println("\n\n\nEX2");
        List<List<Personage>> listOfLists = Personage.getListsOfRaces(list);
        Personage.output(listOfLists);


        /**EX3*/
        System.out.println("\n\n\nEX3");
        List<Personage> superiorList = Personage.getPersonagesByRaceStatus(list, RaceRang.SUPERIOR_RACE);
        List<Personage> highList = Personage.getPersonagesByRaceStatus(list, RaceRang.HIGH_RACE);
        List<Personage> normalList = Personage.getPersonagesByRaceStatus(list, RaceRang.NORMAL_RACE);
        System.out.println("Высшая раса");
        Personage.output(superiorList, "");
        System.out.println("\nСредняя раса");
        Personage.output(highList, "");
        System.out.println("\nОбычная раса");
        Personage.output(normalList, "");


        /**EX4*/
        System.out.println("\n\n\nEX4");
        Map<String, Integer> map = Personage.getMapOfPersonagesByRaces(list);
        Personage.output(map);

    }
}
