package _2_java_essential.homework01.ex6;

import java.util.LinkedList;
import java.util.List;

class Town {
    private static final String PLANET = "Земля";
    private static int townNum = 1_000_000;

    private String name;
    private String country;
    private int population;
    private double square;
    private boolean isCapital;

    Town(String name, String country, int population, double square, boolean isCapital) {
        this.name = name;
        this.country = country;
        this.population = population;
        this.square = square;
        this.isCapital = isCapital;
    }

    public static String getPlanet() {
        return PLANET;
    }

    public static void setTownNum(int townNum) {
        Town.townNum = townNum;
    }

    public static int getTownNum() {
        return townNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    @Override
    public String toString() {
        return "Town{" +
                "name = " + name  +
                ", country = " + country +
                ", population = " + population +
                ", square = " + square +
                ", isCapital = " + isCapital +
                ", planet = " + PLANET +
                '}';
    }



    /**
     * Нестатический метод, который сообщает больше ли население данного города чем переданого
     */
    boolean isBiggerByPopulation(Town town){
        return this.population > town.getPopulation();
    }


    /**
     * Нестатический метод, который возвращает плотность населения
     */
    double getPopulationOnSquareMeter(){
        return population / square;
    }



    /**
     * Нестатический метод, который получает города той же страны что и данный
     */
    List<Town> getAllTownsFromArrayWithSameCountry(Town[] allTowns){
        List<Town> townList = new LinkedList<>();
        for (Town town : allTowns) {
            if(town.getCountry().equals(this.country)){
                townList.add(town);
            }
        }
        return townList;
    }
}
