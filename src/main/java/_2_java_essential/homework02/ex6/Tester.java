package _2_java_essential.homework02.ex6;


import java.util.*;

class Tester {
    public static void main(String[] args) {
        RandomService service = new RandomService();

        List<Dragon> dragons = service.getRandomizedDragonList(40);
//        dragons.add(new Hydra("Алкия", 1000, 10));
//        dragons.add(new DeathDragon("Бифроз", 1300, 10000));
//        dragons.add(new WaterDragon("Ксолон", 2000, 100.5));
//        dragons.add(new Hydra("Гестрея", 2100, 15));
//        dragons.add(new WaterDragon("Долор", 1800, 89.8));
//        dragons.add(new DeathDragon("Касторс", 2300, 20000));

        /**EX1*/
        System.out.println("EX1");
        DragonMethods.sortDragonsByName(dragons);
        System.out.println(dragons);



        /**EX2*/
        System.out.println("\n\n\nEX2");
        System.out.println(DragonMethods.getAllDeathDragons(dragons));
        System.out.println(DragonMethods.getAllWaterDragons(dragons));
        System.out.println(DragonMethods.getAllHydras(dragons));


        /**EX3*/
        System.out.println("\n\n\nEX3");
        System.out.println(DragonMethods.getAllHydrasWithHeadsMoreThanNumber(dragons, 12));


        /**EX4*/
        System.out.println("\n\n\nEX4\n");
        System.out.println(DragonMethods.getAllHydrasWithMoreThanAverageHeadsNum(dragons) + "\n\n");
        System.out.println(DragonMethods.getAllPowerfulDeathDragons(dragons, 450) + "\n\n");
        System.out.println(DragonMethods.getAllWaterDragonsInFirstQuater(dragons));



        /**EX5*/
        System.out.println("\n\n\nEX5");
        List<Dragon> randDragons = service.getRandomizedDragonList(3_000_000);
        System.out.println("List filled");
        System.out.println("Sort by name: " + DragonMethods.getTimeOfDragonListSort(randDragons, "name"));
        System.out.println("Sort by age: " + DragonMethods.getTimeOfDragonListSort(randDragons, "age"));
        System.out.println("Sort by hashcode: " + DragonMethods.getTimeOfDragonListSort(randDragons, "hashcode"));

        System.out.println(service.getRandomizedDragonList(20));
    }
}
