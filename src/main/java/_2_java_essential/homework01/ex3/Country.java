package _2_java_essential.homework01.ex3;

import java.util.*;

class Country {

    private String name;
    private String capital;
    private int population;
    private double square;
    private boolean isSecular;
    private String[] bigTowns;


    Country(String name, String capital, int population, double square, boolean isSecular, String[] bigTowns) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.square = square;
        this.isSecular = isSecular;
        this.bigTowns = bigTowns;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getCapital() {
        return capital;
    }

    void setCapital(String capital) {
        this.capital = capital;
    }

    int getPopulation() {
        return population;
    }

    void setPopulation(int population) {
        this.population = population;
    }

    double getSquare() {
        return square;
    }

    void setSquare(double square) {
        this.square = square;
    }

    boolean isSecular() {
        return isSecular;
    }

    void setSecular(boolean secular) {
        isSecular = secular;
    }

    String[] getBigTowns() {
        return bigTowns;
    }

    void setBigTowns(String[] bigTowns) {
        this.bigTowns = bigTowns;
    }


    @Override
    public String toString() {
        return "Country{" +
                "name = " + name +
                ", capital = " + capital +
                ", population = " + population +
                ", square = " + square +
                ", isSecular = " + isSecular +
                ", bigTowns = " + Arrays.toString(bigTowns) +
                "}\n";
    }


    /**
     * Метод, который получает страну по столице
     */
    static Country getCountryByCapital(List<Country> list, String capital) {
        for (Country country : list) {
            if (country.getCapital().equals(capital)) {
                return country;
            }
        }
        return null;
    }

    /**
     * Метод, который получает квадратные километры страны на человека
     */
    double getPopulationOnSquare() {
        return this.square / this.population;
    }

    /**
     * Метод, который получает страну по городу
     */
    static Country getCountryByTown(List<Country> list, String townName) {
        for (Country country : list) {
            for (String town : country.getBigTowns()) {
                if (town.equals(townName)) {
                    return country;
                }
            }
        }
        return null;
    }

    /**
     * Метод, который получает список светских стран
     */
    static List<Country> getAllSecularCountries(List<Country> list) {
        List<Country> countries = new ArrayList<>();
        for (Country country : list) {
            if (country.isSecular()) {
                countries.add(country);
            }
        }
        return countries;
    }

    /**
     * Метод, который получает страны с н-ным количеством больших городов
     */
    static List<Country> getAllCountriesWithNBigTowns(List<Country> list, int number) {
        List<Country> countries = new ArrayList<>();
        for (Country country : list) {
            if (country.getBigTowns().length == number) {
                countries.add(country);
            }
        }
        return countries;
    }
}
