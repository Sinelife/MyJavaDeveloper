package _3_java_proffessional.homework06.ex4;

public class Tester {
    public static void main(String[] args) throws IllegalAccessException {
        int[] numbers = {1,2,37,8};
        int[] numbers2 = {10,20,30,40,50};
        Rune[] runes1 = {new Rune("Эйн"),new Rune("Элледин")};
        Rune[] runes2 = {new Rune("Вулканис"),new Rune("Астартес")};
        Rune[] runes3 = {new Rune("Гольд"),new Rune("Серентин")};
        Jewel jewel = new Jewel("кольцо", "защита",numbers);
        Jewel jewel2 = new Jewel("амулет", "регенерация",numbers2);
        Weapon[] weapons = {new Weapon("нож", 30, runes1), new Weapon("кинжал", 50, runes3), new Weapon("лук", 30, runes1)};
        Weapon[] weapons2 = {new Weapon("меч", 200, runes2), new Weapon("перчатка", 150, runes3)};
        String[] psevdonims1 = {"принцесса леса","владычица леса"};
        String[] psevdonims2 = {"кровавый монстр","смертоносный"};
        Character[] characters = {new Character("Элейн","ельф",1000, true, "Элрис", weapons, jewel, psevdonims1),
                new Character("Кахат", "демон", 600, false, "Крайтос", weapons2, jewel2, psevdonims2)};

        System.out.println(JsonConverter.toJson(characters));

    }
}
