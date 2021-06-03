package _2_java_essential.homework01.ex5;

import java.util.Random;

class Human {
    private static String planet = "Земля";

    private String name;
    private String surname;
    private int age;
    private String gender;
    private int money;


    Human(String name, String surname, int age, String gender, int money) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }



    /**
     * 1) Нестатический метод прибавления денег двух людей.
     */
    public int twoHumonSum(Human human){
        return this.money + human.getMoney();
    }

    /**
     * 2) Нестатический метод смены фамилии первого человека на фамилию второго.
     */
    public void changeSurnameToOther(Human human){
        this.surname = human.surname;
    }


    /**
     * 3) Нестатический метод, для смены имени человека на рандомное.
     */
    public void changeNameToRandom(){
        this.name = getRandomWord();
    }

    private String getRandomWord(){
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
     * 4) Нестатический метод, для вывода информации про человека.
     */
    @Override
    public String toString() {
        String res = "";
        res += name + " "
                + surname + ", "
                + gender + ", "
                + age + "лет, "
                + money + "$, ("
                + planet + ").";
        return res;
    }


    /**
     * 5) Нестатический метод для смены планеты человека.
     */
    public void changePlanet(String planet){
        this.planet = planet;
    }

    public String getPlanet() {
        return planet;
    }
}
