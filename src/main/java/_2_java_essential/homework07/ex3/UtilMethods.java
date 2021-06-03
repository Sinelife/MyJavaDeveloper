package _2_java_essential.homework07.ex3;

import java.lang.reflect.Field;
import java.util.*;

class UtilMethods {

    /**
     * Метод, для получения самого часто втсречаемого животного в
     * масиве животных
     */
    public static String getMostMetAnimal(List<Animal> animals) {
        List<AnimalArrayData> dataList = getListAnimalArrayData(animals);
        int max = dataList.get(0).getNumOfAnimalInArray();
        String maxAnimal = dataList.get(0).getAnimalName();
        for (AnimalArrayData animalArrayData : dataList) {
            int newMax = animalArrayData.getNumOfAnimalInArray();
            String newMaxAnimal = animalArrayData.getAnimalName();
            if(max < newMax) {
                max = newMax;
                maxAnimal = newMaxAnimal;
            }
        }
        return maxAnimal;
    }







    /**
     * Метод, для получения списка данных AnimalArrayDataList
     */
    public static List<AnimalArrayData> getListAnimalArrayData(List<Animal> animals) {
        List<AnimalArrayData> dataList = new ArrayList<>();
        for (Animal animal : animals) {
            if(!animalArrayDataListContainsType(dataList, animal.getClass().getSimpleName())) {
                dataList.add(new AnimalArrayData(animal.getClass().getSimpleName()));
                addFieldNamesAndTypesToAnimalArrayDataList(dataList, animal);
            }
        }
        addAnimalsToAnimalArrayData(dataList, animals);
        return dataList;
    }


    /**
     * Метод, для добавления животных и их количества в список данных
     * AnimalArrayDataList
     */
    private static void addAnimalsToAnimalArrayData(List<AnimalArrayData> dataList, List<Animal> animals) {
        for (Animal animal : animals) {
            for (AnimalArrayData animalArrayData : dataList) {
                if(animal.getClass().getSimpleName().equals(animalArrayData.getAnimalName())) {
                    animalArrayData.getAnimals().add(animal);
                    animalArrayData.increaseNumOfAnimalInArray();
                }
            }
        }
    }


    /**
     * Метод, для проверки есть ли данный тип животного в списке данных
     * AnimalArrayDataList
     */
    private static boolean animalArrayDataListContainsType(List<AnimalArrayData> dataList, String animalName) {
        for (AnimalArrayData animalArrayData : dataList) {
            if (animalArrayData.getAnimalName().equals(animalName)) {
                return true;
            }
        }
        return false;
    }


    /**
     * Метод, для добавления названий полей и типов полей в список данных
     * AnimalArrayDataList
     */
    private static void addFieldNamesAndTypesToAnimalArrayDataList(List<AnimalArrayData> dataList, Animal animal) {
        List<String> fieldNames = getFieldNames(animal);
        List<String> fieldTypes = getFieldTypes(animal);
        for (AnimalArrayData animalArrayData : dataList) {
            if(animal.getClass().getSimpleName().equals(animalArrayData.getAnimalName())) {
                animalArrayData.getAnimalFieldNames().addAll(fieldNames);
                animalArrayData.getAnimalFieldTypes().addAll(fieldTypes);
            }
        }
    }


    /**
     * Метод, для получения списка названий полей данного животного
     */
    private static List<String> getFieldNames(Animal animal) {
        Field[] fields = animal.getClass().getDeclaredFields();
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields) {
            fieldNames.add(field.getName());
        }
        return fieldNames;
    }

    /**
     * Метод, для получения типов полей данного животного
     */
    private static List<String> getFieldTypes(Animal animal) {
        Field[] fields = animal.getClass().getDeclaredFields();
        List<String> fieldTypes = new ArrayList<>();
        for (Field field : fields) {
            if(!fieldTypes.contains(field.getType().getName())) {
                fieldTypes.add(field.getType().getSimpleName());
            }
        }
        return fieldTypes;
    }
}
