package _2_java_essential.homework01.ex5;

import java.util.Random;

class HumanMethods {

    /**
     * 1) Статический метод прибавления денег двух людей.
     */
    static int twoHumonSum(Human human1, Human human2){
        return human1.getMoney() + human2.getMoney();
    }

    /**
     * 2) Статический метод смены фамилии первого человека на фамилию второго.
     */
    static void changeSurnameToOther(Human human1, Human human2){
        human1.setSurname(human2.getSurname());
    }


    /**
     * 3) Статический метод, для смены имени человека на рандомное.
     */
    static void changeNameToRandom(Human human){
        String randomName = getRandomWord();
        human.setName(randomName);
    }

    private static String getRandomWord(){
        String randomName = "";
        Random rand = new Random();
        int nameLength = rand.nextInt(10);
        for (int i = 0; i < nameLength; i++) {
            String letter = "";
            letter += (char)(rand.nextInt(25) + 97);
            if(i == 0){
                letter = letter.toUpperCase();
            }
            randomName += letter;
        }
        return randomName;
    }


    /**
     * 4) Статический метод, для вывода информации про человека.
     */
    public static String toString(Human human) {
        String res = "";
        res += human.getName() + " "
                + human.getSurname() + ", "
                + human.getGender() + ", "
                + human.getAge() + "лет, "
                + human.getMoney() + "$, ("
                + human.getPlanet() + ").";
        return res;
    }


    /**
     * 5) Статический метод для смены планеты человека.
     */
    static void changePlanet(Human human, String planet){
        human.changePlanet(planet);
    }
}
