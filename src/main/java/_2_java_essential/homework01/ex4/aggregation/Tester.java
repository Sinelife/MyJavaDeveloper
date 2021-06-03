package _2_java_essential.homework01.ex4.aggregation;

import java.util.*;

class Tester {
    public static void main(String[] args) {
        Weapon armageddonSword = new Weapon("Armageddon Sword", "sword");
        Weapon steelSword = new Weapon("Steel Sword", "sword");
        Weapon goldSword = new Weapon("Gold Sword", "sword");
        Weapon silverSword = new Weapon("Silver Sword", "sword");
        Weapon steelSpear= new Weapon("Steel Spear", "spear");
        Weapon goldSpear = new Weapon("Gold Spear", "spear");
        Weapon silverSpear = new Weapon("Silver Spear", "spear");
        Weapon steelKnife= new Weapon("Steel Knife", "knife");
        Weapon goldKnife = new Weapon("Gold Knife", "knife");
        Weapon silverKnife = new Weapon("Silver Knife", "knife");


        Warrior gilbert = new Warrior("Gilbert", "Dargon", 35, new Weapon[]{armageddonSword, steelKnife, silverKnife});
        Warrior hensword = new Warrior("Hensword", "Lighter", 65, new Weapon[]{steelSword, silverSpear, goldKnife, silverKnife});
        Warrior joanna = new Warrior("Joanna", "Rivers", 23, new Weapon[]{goldSword, goldKnife, goldSpear});
        Warrior cristian = new Warrior("Cristian", "Locker", 29, new Weapon[]{steelSpear, silverSword, goldSword, steelSword});

        List<Warrior> warriors = new ArrayList<>(Arrays.asList(gilbert, hensword, joanna, cristian));



        System.out.println("Warriors with weapon " + goldSword.getName());
        System.out.println(MethodsWarrior.getWarriorsWithChosenWeapon(warriors, goldSword));
        System.out.println("Warriors with weapon " + silverKnife.getName());
        System.out.println(MethodsWarrior.getWarriorsWithChosenWeapon(warriors, silverKnife));
        System.out.println("Warriors with weapon " + armageddonSword.getName());
        System.out.println(MethodsWarrior.getWarriorsWithChosenWeapon(warriors, armageddonSword));


        System.out.println("\n\n");
        for (String s : new String[]{"spear", "knife", "sword"}) {
            System.out.println("Warriors with weapon " + s);
            System.out.println(MethodsWarrior.getWarriorsWithWeaponType(warriors, s));
        }


        System.out.println("\n\n");
        System.out.println("Unique Weapons:" + MethodsWarrior.getUniqueWeapons(warriors));

    }
}
