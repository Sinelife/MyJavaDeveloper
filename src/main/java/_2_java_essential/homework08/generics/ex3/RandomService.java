package _2_java_essential.homework08.generics.ex3;

import java.util.*;

class RandomService {

    List<Dragon> getRandomizedDragonList(int number) {
        List<Dragon> dragons = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            dragons.add(getRandomizedDragon());
        }
        return dragons;
    }

    private Dragon getRandomizedDragon() {
        int dragonType = rand.nextInt(3);
        switch (dragonType) {
            case 0: return getRandomizedHydra();
            case 1: return getRandomizedDeathDragon();
            case 2: return getRandomizedWaterDragon();
        }
        return null;
    }

    private Dragon getRandomizedWaterDragon() {
        return new WaterDragon(getRandomName(), getRandomAge(), getRandomLength());
    }

    private Dragon getRandomizedDeathDragon() {
        return new DeathDragon(getRandomName(), getRandomAge(), getRandomDeathPower());
    }

    private Dragon getRandomizedHydra() {
        return new Hydra(getRandomName(), getRandomAge(), getRandomHeadNum());
    }

    private int getRandomAge() {
        return rand.nextInt(10000) + 1000;
    }

    private int getRandomHeadNum() {
        return rand.nextInt(20) + 6;
    }

    private int getRandomLength() {
        return (rand.nextInt(10000) + 1000) / 18;
    }

    private int getRandomDeathPower() {
        return rand.nextInt(1700) + 40;
    }


    private String getRandomName() {
        int partsNum = rand.nextInt(4) + 2;
        String name = "";
        for (int i = 0; i < partsNum; i++) {
            name += getRandomPart();
        }
        return getWordWithBigLetter(name);
    }

    private String getWordWithBigLetter(String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }

    private String getRandomPart() {
        int partType = rand.nextInt(10) + 1;
        return partType < 7 ? getBigPart() : getSmallPart();
    }

    private String getSmallPart() {
        return vocals[rand.nextInt(vocals.length)];
    }

    private String getBigPart() {
        return odds[rand.nextInt(odds.length)] + vocals[rand.nextInt(vocals.length)];
    }


    private static Random rand = new Random();
    private static String[] vocals = new String[]{"a", "o", "u", "i", "e", "y"};
    private static String[] odds = new String[]{"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
}
