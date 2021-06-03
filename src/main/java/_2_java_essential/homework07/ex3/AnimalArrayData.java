package _2_java_essential.homework07.ex3;

import java.util.*;

class AnimalArrayData {

    private List<Animal> animals;
    private String animalName;
    private int numOfAnimalInArray;
    private List<String> animalFieldNames;
    private List<String> animalFieldTypes;


    AnimalArrayData(String animalName) {
        this.animalName = animalName;
        this.numOfAnimalInArray = 0;
        this.animals = new ArrayList<>();
        this.animalFieldNames = new ArrayList<>();
        this.animalFieldTypes = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumOfAnimalInArray() {
        return numOfAnimalInArray;
    }

    public void setNumOfAnimalInArray(int numOfAnimalInArray) {
        this.numOfAnimalInArray = numOfAnimalInArray;
    }

    public void increaseNumOfAnimalInArray() {
        this.numOfAnimalInArray++;
    }

    public List<String> getAnimalFieldNames() {
        return animalFieldNames;
    }

    public void setAnimalFieldNames(List<String> animalFieldNames) {
        this.animalFieldNames = animalFieldNames;
    }

    public List<String> getAnimalFieldTypes() {
        return animalFieldTypes;
    }

    public void setAnimalFieldTypes(List<String> animalFieldTypes) {
        this.animalFieldTypes = animalFieldTypes;
    }

    @Override
    public String toString() {
        return "AnimalArrayData{" +
                "\n  animals = " + animals +
                "\n  animalName = '" + animalName + '\'' +
                "\n  numOfAnimalInArray = " + numOfAnimalInArray +
                "\n  animalFieldNames = " + animalFieldNames +
                "\n  animalFieldTypes = " + animalFieldTypes +
                "}\n\n\n\n";
    }
}
