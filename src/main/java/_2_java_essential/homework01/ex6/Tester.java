package _2_java_essential.homework01.ex6;

import java.util.List;

class Tester {
    public static void main(String[] args) {
        Town odessa = new Town("Одесса", "Украина",  993_120, 162.4, false);
        Town tokyo = new Town("Токио", "Япония", 9_273_000, 2_188.3, true);


        /**EX1*/
        System.out.println("EX1");
        System.out.println(tokyo);
        System.out.println(odessa);
        System.out.println(tokyo.getName() + " имеет больше население " + odessa.getName() + "? - " + TownMethods.isBiggerByPopulation(tokyo, odessa));
        System.out.println(tokyo.getName() + " имеет больше население " + odessa.getName() + "? - " + tokyo.isBiggerByPopulation(odessa));



        /**EX2*/
        System.out.println("\n\n\nEX2");
        System.out.println("Плотность " + tokyo.getName() + " - " + TownMethods.getPopulationOnSquareMeter(tokyo));
        System.out.println("Плотность " + tokyo.getName() + " - " + tokyo.getPopulationOnSquareMeter());



        /**EX3*/
        System.out.println("\n\n\nEX3");
        Town[] towns = getTownArray();
        System.out.println("Масив городов");
        TownMethods.outputArray(towns);

        List<Town> townsFromOdessaCountry = TownMethods.getAllTownsFromArrayWithSameCountry(odessa, towns);
        System.out.println("\nМасив городов той же страны что и " + odessa.getName());
        System.out.println(townsFromOdessaCountry);

        List<Town> townsFromOdessaCountry2 = odessa.getAllTownsFromArrayWithSameCountry(towns);
        System.out.println("\nМасив городов той же страны что и " + odessa.getName());
        System.out.println(townsFromOdessaCountry2);

    }


    private static Town[] getTownArray(){
        return new Town[]{
                new Town("Киев", "Украина", 2_884_000, 839.2, true),
                new Town("Харьков", "Украина", 1_419_000, 350.1, false),
                new Town("Херсон", "Украина", 289_697, 135.7, false),
                new Town("Лондон", "Англия", 3_000_000, 1572.0, true),
                new Town("Оксфорд", "Англия", 150_200, 45.59, false),
                new Town("Кембридж", "Англия", 123_900, 115.6, false),
        };
    }
}
