package _2_java_essential.homework05._2_inner_nested_classes.ex6;

import java.util.*;

class Personage {

    protected String name;
    protected String surname;
    protected Race race;
    protected Gender gender;
    protected String magicType;
    protected int age;

    Personage(String name, String surname, Race race, Gender gender, String magicType, int age) {
        this.name = name;
        this.surname = surname;
        this.race = race;
        this.gender = gender;
        this.magicType = magicType;
        this.age = age;
    }

    public Personage() {
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

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMagicType() {
        return magicType;
    }

    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return  " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", race=" + race.getRace() +
                ", gender=" + gender.getGender() +
                ", magicType='" + magicType + '\'' +
                ", age=" + age +
                '}';
    }



    public static List<Personage> getInitializedList() {
        List<Personage> list = new ArrayList<>();
        list.add(new Personage("Широ","Сильверсол", Race.SILFID, Gender.GIRL, "Магия Серебряных Сильфидов",16));
        list.add(new Personage("Найвина","Найтвиш", Race.NEPHELIM, Gender.GIRL, "Темная материя",16));
        list.add(new Personage("Лайсерг","Хрон", Race.ARCHONT, Gender.BOY, "Стихийная магия",25));
        list.add(new Personage("Иштар","Ксариль", Race.ELKAS, Gender.GIRL, "Руническая магия",56));
        list.add(new Personage("Винсент","Варбрингер", Race.ELDAR, Gender.BOY, "Стихийная магия",156));
        list.add(new Personage("Сальрих","Голдраш", Race.SILFID, Gender.BOY, "Магия Золотых Сильфидов",78));
        list.add(new Personage("Тенна","Бронзскин", Race.SILFID, Gender.GIRL, "Магия Бронзовых Сильфидов",35));
        return list;
    }

    /**
     * 1)Метод, возвращающий всех персонажей из списка с таким же
     * типом магии
     */
    public List<Personage> getPersonagesWithSameMagic(List<Personage> inputList) {
        List<Personage> personages = new ArrayList<>();
        for (Personage personage : inputList) {
            if(personage.magicType.equals(this.magicType)) {
                personages.add(personage);
            }
        }
        return personages;
    }


    /**
     * 2)Метод, возвращающий список списков всех персонажей разделенный
     * по расам
     */
    public static List<List<Personage>> getListsOfRaces(List<Personage> list) {
        List<List<Personage>> mainList = new ArrayList<>();
        for (Personage personage : list) {
            addPersonageToMainList(mainList, personage);
        }
        return mainList;
    }


    /**
     * Метод, добавляющий персонажа в список по расам
     */
    private static boolean addPersonageToMainList(List<List<Personage>> mainList, Personage personage) {
        if(mainList == null || personage == null) {
            return false;
        }
        for (List<Personage> list : mainList) {
            if(list.get(0).race.equals(personage.race)) {
                list.add(personage);
                return true;
            }
        }
        List<Personage> newList = new ArrayList<>();
        newList.add(personage);
        mainList.add(newList);
        return true;
    }


    /**
     * 3)Метод, получающий всех персонажей принадлежащих к высшим,средним или
     * низшим расам
     */
    public static List<Personage> getPersonagesByRaceStatus(List<Personage> list, RaceRang rang) {
        List<Personage> personages = new ArrayList<>();
        for (Personage personage : list) {
            if(personage.getRace().getRaceStatus().equals(rang)) {
                personages.add(personage);
            }
        }
        return personages;
    }


    /**
     * 4)Метод, получающий хешмапу с названием рассы как ключа и количеством
     * представителей этой расы в качестве значения
     */
    public static Map<String, Integer> getMapOfPersonagesByRaces(List<Personage> list) {
        Map<String, Integer> map = new HashMap<>();
        for (Personage personage : list) {
            increaseMapCounter(map, personage);
        }
        return map;
    }

    /**
     * Метод, для добавления персонажа в хешмапу по расам
     */
    private static boolean increaseMapCounter(Map<String, Integer> map, Personage personage) {
        if (map == null || personage == null) {
            return false;
        }
        String race = personage.race.getRace();
        if(map.containsKey(race)) {
            int newNumber = map.get(race) + 1;
            map.put(race, newNumber);
        } else {
            map.put(race, 1);
        }
        return true;
    }



    public static void output(List<Personage> list, String extraCount) {
        if(!extraCount.equals("")) {
            extraCount = "\t" + extraCount + ".";
        } else {
            extraCount += "\t";
        }
        int counter = 1;
        for (Personage personage : list) {
            System.out.println(extraCount + counter++ + ")" + personage);
        }
    }

    public static void output(List<List<Personage>> lists) {
        int mainCounter = 1;
        for (List<Personage> list : lists) {
            System.out.println(mainCounter + ")" + list.get(0).getRace().getRace());
            output(list, String.valueOf(mainCounter));
            mainCounter++;
        }
    }

    public static void output(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " представителей.");
        }
    }
}
