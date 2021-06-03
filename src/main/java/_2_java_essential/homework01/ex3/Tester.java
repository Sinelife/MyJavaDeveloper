package _2_java_essential.homework01.ex3;

import java.util.*;

class Tester {

    public static void main(String[] args) {

        String[] towns = {"Киев", "Харьков", "Днепр", "Одесса", "Львов", "Донецк"};
        Country ukraine = new Country("Украина","Киев", 42_200_000, 603_628, true, towns);
        System.out.println("Название страны: " + ukraine.getName());
        System.out.println("Столица страны: " + ukraine.getCapital());
        System.out.println("Население страны: " + ukraine.getPopulation());
        System.out.println("Площадь страны: " + ukraine.getSquare());
        System.out.println("Страна светская? - " + ukraine.isSecular());
        System.out.println("Большие города - " + Arrays.toString(ukraine.getBigTowns()));



        String[] newTowns = {"Новый Киев", "Новый Харьков", "Новый Днепр", "Новый Одесса", "Новый Львов", "Новый Донецк"};
        ukraine.setName("Великая Украинская Империя");
        ukraine.setCapital("Новый Киев");
        ukraine.setPopulation(1_000_000_000);
        ukraine.setSquare(10_000_000);
        ukraine.setSecular(false);
        ukraine.setBigTowns(newTowns);
        System.out.println(ukraine);


        Country usa = new Country("США", "Вашингтон", 327_200_000, 9_834_000, true, new String[]{"Вашингтон", "Нью-Йорк", "Сиэтл", "Лос-Анджелес", "Даллас"});
        Country japan = new Country("Япония", "Токио", 126_800_000, 377_973, true, new String[]{"Токио", "Иокогама", "Осака", "Нагоя"});
        Country china = new Country("Китай", "Пекин", 1_386_000_000, 9_597_000, true, new String[]{"Чунцын", "Пекин", "Шанхай", "Тяньдзинь"});
        Country southKorea = new Country("Южная Корея", "Сеул", 51_470_000, 100_210, true, new String[]{"Сеул", "Пусан", "Инчхон"});
        List<Country> countries = new ArrayList<>(Arrays.asList(usa, japan, china, southKorea, ukraine));

        System.out.println("\n\n\n");
        String tokyo = "Токио", seoul = "Сеул";
        System.out.println("Страна в которой столица " + tokyo + ": " + Country.getCountryByCapital(countries, tokyo));
        System.out.println("Страна в которой столица " + seoul + ": " + Country.getCountryByCapital(countries, seoul));


        System.out.println("\n\n");
        String sietle = "Сиэтл", shanghai = "Шанхай";
        System.out.println("Страна в которой есть город " + shanghai + ": " + Country.getCountryByTown(countries, shanghai));
        System.out.println("Страна в которой есть город " + sietle + ": " + Country.getCountryByTown(countries, sietle));


        System.out.println("\n\n");
        System.out.println("Светские страны: " + Country.getAllSecularCountries(countries));


        System.out.println("\n\n");
        int four = 4, six = 6;
        System.out.println("Страны в которых " + four + " больших городов: " + Country.getAllCountriesWithNBigTowns(countries, four));
        System.out.println("Страны в которых " + six + " больших городов: " + Country.getAllCountriesWithNBigTowns(countries, six));


        System.out.println("\n\n");
        System.out.println("Площади стран на человека");
        for (Country country : countries) {
            System.out.println(country.getName() + ": " + country.getPopulationOnSquare() + " км^2/человека");
        }
    }
}
