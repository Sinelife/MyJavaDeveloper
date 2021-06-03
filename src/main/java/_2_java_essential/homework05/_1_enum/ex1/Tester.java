package _2_java_essential.homework05._1_enum.ex1;

import java.util.*;

class Tester {
    public static void main(String[] args) {
        List<Human> humans = HumanMethods.getHumanList();
        HumanMethods.outputHumanList(humans);


        /**EX1*/
        System.out.println("\n\n\nEX1");
        String sex = "Девушка";
        System.out.println("Список людей пола " + sex);
        List girlList = HumanMethods.getAllHumansOfChoosenSex(humans,sex);
        HumanMethods.outputHumanList(girlList);


        /**EX2*/
        System.out.println("\n\n\nEX2");
        String str ="Япония,Южная Корея,Китай";
        System.out.println("Список людей из выбраных стран");
        System.out.println("Выбраные страны - " + str);
        List listFromCountries = HumanMethods.getAllHumansOfChosenCountries(humans, str);
        HumanMethods.outputHumanList(listFromCountries);


        /**EX3*/
        System.out.println("\n\n\nEX3");
        System.out.println("Список людей отсортированый по странам");
        HumanMethods.sortHumanByCountry(humans);
        HumanMethods.outputHumanList(humans);


        /**EX4*/
        System.out.println("\n\n\nEX4");
        System.out.println("Список людей отсортированый по странам и по возрасту");
        HumanMethods.sortHumanByCountryAndAge(humans);
        HumanMethods.outputHumanList(humans);
    }



}
