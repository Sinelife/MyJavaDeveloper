package _2_java_essential.homework01.ex4.aggregation;

import java.util.*;

class MethodsWarrior {

    /**
     * Метод, для получения из списка воиов всех воинов с определенным оружием.
     */
    public static List<Warrior> getWarriorsWithChosenWeapon(List<Warrior> warriors, Weapon chosenWeapon){
        List<Warrior> chosenWarriors = new ArrayList<>();
        for (Warrior warrior : warriors) {
            for (Weapon weapon : warrior.getWeapons()) {
                if(weapon.equals(chosenWeapon)){
                    chosenWarriors.add(warrior);
                    break;
                }
            }
        }
        return chosenWarriors;
    }



    /**
     * Метод, для получения из списка воинов всех воинов с определенным типом оружия.
     */
    public static List<Warrior> getWarriorsWithWeaponType(List<Warrior> warriors, String weaponType){
        List<Warrior> chosenWarriors = new ArrayList<>();
        for (Warrior warrior : warriors) {
            for (Weapon weapon : warrior.getWeapons()) {
                if(weapon.getType().equals(weaponType)){
                    chosenWarriors.add(warrior);
                    break;
                }
            }
        }
        return chosenWarriors;
    }


    /**
     * Метод, для получения всех уникальных оружий из списка воинов.
     */
    public static List<Weapon> getUniqueWeapons(List<Warrior> warriors){
        List<Weapon> uniqueWeapons = new LinkedList<>();
        for (Warrior warrior : warriors) {
            for (Weapon weapon : warrior.getWeapons()) {
                if(!uniqueWeapons.contains(weapon)){
                    uniqueWeapons.add(weapon);
                }
            }
        }
        return uniqueWeapons;
    }
}
