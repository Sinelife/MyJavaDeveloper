package _2_java_essential.homework02.ex6;

import java.util.*;

class DragonMethods {


    /**3.1)метод, который сортирует масив драконов по имени. */
    private static String getSmallerWord(String word1, String word2){
        return word1.length() <= word2.length() ? word1 : word2;
    }

    private static boolean firstLess(String word1, String word2){
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        String smallerWord = getSmallerWord(word1, word2);
        for (int i = 0; i < smallerWord.length(); i++) {
            if(chars1[i] < chars2[i]){
                return true;
            } else if(chars1[i] > chars2[i]){
                return false;
            }
        }
        return false;
    }

    static void sortDragonsByName(List<Dragon> dragons) {
        for (int i = 0; i < dragons.size(); i++) {
            for (int j = i; j < dragons.size(); j++) {
                if(firstLess(dragons.get(j).getName(), dragons.get(i).getName())){
                    Dragon temp = dragons.get(i);
                    dragons.set(i, dragons.get(j));
                    dragons.set(j, temp);
                }
            }
        }
    }




    /**3.2)методы, которые получают из масива драконов только гидр, водных драконов и драконов смерти.*/
    static List<DeathDragon> getAllDeathDragons(List<Dragon> dragons) {
        List<DeathDragon> list = new ArrayList<>();
        for (Dragon dragon : dragons) {
            if (dragon instanceof DeathDragon) {
                list.add((DeathDragon) dragon);
            }
        }
        return list;
    }

    static List<Hydra> getAllHydras(List<Dragon> dragons) {
        List<Hydra> list = new ArrayList<>();
        for (Dragon dragon : dragons) {
            if (dragon instanceof Hydra) {
                list.add((Hydra) dragon);
            }
        }
        return list;
    }

    static List<WaterDragon> getAllWaterDragons(List<Dragon> dragons) {
        List<WaterDragon> list = new ArrayList<>();
        for (Dragon dragon : dragons) {
            if (dragon instanceof WaterDragon) {
                list.add((WaterDragon) dragon);
            }
        }
        return list;
    }



    /**3.3)метод, который получает из массива драконов всех гидр с количеством голов большим чем определенное число.*/
    static List<Hydra> getAllHydrasWithHeadsMoreThanNumber(List<Dragon> dragons, int headNumber) {
        List<Hydra> list = new ArrayList<>();
        for (Dragon dragon : dragons) {
            if (dragon instanceof Hydra && ((Hydra) dragon).getHeadNum() > headNumber) {
                list.add((Hydra) dragon);
            }
        }
        return list;
    }



    /**3.4)метод, который получает из масива*/
    /** -всех гидр у которых количество голов больше среднего количества голов всех гидр*/
    static List<Hydra> getAllHydrasWithMoreThanAverageHeadsNum(List<Dragon> dragons) {
        List<Hydra> hydras = getAllHydras(dragons);
        int averageHeadNum = getAverageHeadNum(hydras);
        List<Hydra> chosenHydras = new ArrayList<>();
        for (Hydra hydra : hydras) {
            if (hydra.getHeadNum() >= averageHeadNum) {
                chosenHydras.add(hydra);
            }
        }
        return chosenHydras;
    }

    private static int getAverageHeadNum(List<Hydra> hydras) {
        int sum = 0;
        for (Hydra hydra : hydras) {
            sum += hydra.getHeadNum();
        }
        System.out.println("Average HeadNum: " + (sum / hydras.size()));
        return sum / hydras.size();
    }

    /**3.5)метод, который получает из масива*/
    /**-всех драконов смерти, сила смерти которых в два и больше раз больше заданого числа.*/
    static List<DeathDragon> getAllPowerfulDeathDragons(List<Dragon> dragons, int power) {
        List<DeathDragon> deathDragons = getAllDeathDragons(dragons);
        List<DeathDragon> powerfulDragons = new ArrayList<>();
        for (DeathDragon dragon : deathDragons) {
            if (dragon.getDeathPower() >= power * 2) {
                powerfulDragons.add(dragon);
            }
        }
        return powerfulDragons;
    }


    /**3.6)метод, который получает из масива*/
    /**-всех водных драконов длина тела которого больше 3/4 всех водных драконов.*/
    static List<WaterDragon> getAllWaterDragonsInFirstQuater(List<Dragon> dragons) {
        List<WaterDragon> waterDragons = getAllWaterDragons(dragons);
        sortByBodyLength(waterDragons);
        List<WaterDragon> longDragons = new ArrayList<>();
        for (int i = 0; i < waterDragons.size() / 4; i++) {
            longDragons.add(waterDragons.get(i));
        }
        return longDragons;
    }

    private static void sortByBodyLength(List<WaterDragon> waterDragons) {
        for (int i = 0; i < waterDragons.size(); i++) {
            for (int j = i; j < waterDragons.size(); j++) {
                if (waterDragons.get(j).getBodyLength() > waterDragons.get(i).getBodyLength()) {
                    WaterDragon temp = waterDragons.get(i);
                    waterDragons.set(i, waterDragons.get(j));
                    waterDragons.set(j, temp);
                }
            }
        }
    }


    /**3.7)методы, которые подсчитывают время сортировки масива*/
    static String getTimeOfDragonListSort(List<Dragon> dragons, String sortType) {
        long start = System.currentTimeMillis();
        sortDragons(dragons, sortType);
        long end = System.currentTimeMillis();
        return (double)(end - start) / 1000 + " seconds";
    }

    private static void sortDragons(List<Dragon> dragons, String sortType) {
        SortService service = new SortService(dragons);
        service.sort(0, dragons.size() - 1, sortType);
    }
}
