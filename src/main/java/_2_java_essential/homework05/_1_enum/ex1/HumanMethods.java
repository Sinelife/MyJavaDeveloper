package _2_java_essential.homework05._1_enum.ex1;

import java.util.LinkedList;
import java.util.List;

class HumanMethods {

    /**
     * Метод, для заполнения данными списка людей
     */
    public static List<Human> getHumanList(){
        List<Human> list = new LinkedList<>();
        list.add(new Human("Виталий", "Волков", 40, Gender.BOY, Country.UKRAINE));
        list.add(new Human("Елена", "Волкова", 18, Gender.GIRL, Country.UKRAINE));
        list.add(new Human("Минасэ", "Инори", 23, Gender.GIRL, Country.JAPAN));
        list.add(new Human("Киану", "Ривз", 54, Gender.BOY, Country.USA));
        list.add(new Human("Анджела", "Ян Ин", 29, Gender.GIRL, Country.CHINA));
        list.add(new Human("Олейсей", "Иванов", 38, Gender.BOY, Country.UKRAINE));
        list.add(new Human("Илон", "Маск", 50, Gender.BOY, Country.USA));
        list.add(new Human("Хироюки", "Санада", 45, Gender.BOY, Country.JAPAN));
        list.add(new Human("Метин", "Акдюльгер", 30, Gender.BOY, Country.TURKEY));
        list.add(new Human("Эрнст", "Шульц", 55, Gender.BOY, Country.GERMANY));
        list.add(new Human("Омар", "Си", 40, Gender.BOY, Country.FRANCE));
        list.add(new Human("Бан", "Мин А", 25, Gender.GIRL, Country.SOUTH_KOREA));
        list.add(new Human("Иванна", "Рыбина", 14, Gender.GIRL, Country.UKRAINE));

        return list;
    }


    /**
     * 1) Метод, для получения всех людей выбраного пола
     */
    public static List<Human> getAllHumansOfChoosenSex(List<Human> humans, String sex){
        List<Human> list = new LinkedList<>();
        for (Human human : humans) {
            if(human.getGender().getGender().equals(sex)){
                list.add(human);
            }
        }
        return list;
    }


    /**
     * 2) Метод, для получения всех людей из стран, полученых из строки
     */
    public static List<Human> getAllHumansOfChosenCountries(List<Human> humans, String countries){
        List<String> countryList = getListFromString(countries);
        List<Human> list = new LinkedList<>();
        for (Human human : humans) {
            if(countryList.contains(human.getCountry().getCountry())){
                list.add(human);
            }
        }
        return list;
    }



    /**
     * 3) Метод, для сортировки людей по странам
     */
    public static void sortHumanByCountry(List<Human> humans){
        for (int i = 0; i < humans.size(); i++) {
            for (int j = i; j < humans.size(); j++) {
                if(firstLess(humans.get(j).getCountry().getCountry(), humans.get(i).getCountry().getCountry())){
                    Human temp = humans.get(i);
                    humans.set(i, humans.get(j));
                    humans.set(j, temp);
                }
            }
        }
    }

    /**
     * Метод, который проверяет меньше ли первое слово чем второе по алфавиту
     */
    private static boolean firstLess(String word1, String word2){
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        String biggerWord = getBiggerWord(word1, word2);
        for (int i = 0; i < biggerWord.length(); i++) {
            if(chars1[i] < chars2[i]){
                return true;
            }
            else if(chars1[i] > chars2[i]){
                return false;
            }
        }
        return false;
    }

    /**
     * Метод, который получает большее слово из двух
     */
    private static String getBiggerWord(String word1, String word2){
        if(word1.length() >= word2.length()){
            return word1;
        }
        else {
            return word2;
        }
    }



    /**
     * 4) Метод, для сортировки людей по странам и по возрасту
     */
    public static void sortHumanByCountryAndAge(List<Human> humans){
        for (int i = 0; i < humans.size(); i++) {
            for (int j = i; j < humans.size(); j++) {
                if(firstLess(humans.get(j).getCountry().getCountry(), humans.get(i).getCountry().getCountry())){
                    Human temp = humans.get(i);
                    humans.set(i, humans.get(j));
                    humans.set(j, temp);
                }
                if(humans.get(i).getCountry().getCountry().equals(humans.get(j).getCountry().getCountry())){
                    swapByAgeIfFirstIsLess(humans, i, j);
                }
            }
        }
    }

    /**
     * Метод, который меняет местами людей в списке если первый младше второго
     */
    public static void swapByAgeIfFirstIsLess(List<Human> list, int i, int j){
        if(list.get(i).getAge() < list.get(j).getAge()){
            Human temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }



    /**
     * Метод, для получения слов из строки(разделитель запятая)
     */
    public static List<String> getListFromString(String str){
        List<String> strings = new LinkedList<>();
        String word = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ','){
                strings.add(word);
                word = "";
            }
            else {
                word += chars[i];
            }
        }
        strings.add(word);
        return strings;
    }



    /**
     * Метод, для вывода списка людей
     */
    public static void outputHumanList(List<Human> humans){
        int counter = 1;
        for (Human human : humans) {
            System.out.println(counter++ + ")" + human);
        }
    }
}
