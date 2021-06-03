package _2_java_essential.homework01.ex6;

import java.util.*;

class TownMethods {

    /**
     * Статический метод, который сообщает больше ли население первого города чем второго
     */
    static boolean isBiggerByPopulation(Town town1, Town town2){
        return town1.getPopulation() > town2.getPopulation();
    }


    /**
     * Статический метод, который возвращает плотность населения
     */
    static double getPopulationOnSquareMeter(Town town){
        return town.getPopulation() / town.getSquare();
    }


    /**
     * Статический метод, который получает города той же страны что и переданный
     */
    static List<Town> getAllTownsFromArrayWithSameCountry(Town chosenTown, Town[] allTowns){
        List<Town> townList = new LinkedList<>();
        for (Town town : allTowns) {
            if(town.getCountry().equals(chosenTown.getCountry())){
                townList.add(town);
            }
        }
        return townList;
    }


    /**
     * Метод, который выводит масив городов
     */
    static void outputArray(Town[] towns){
        int counter = 1;
        for (Town town : towns) {
            System.out.println(counter++ + ")" +town);
        }
    }
}
