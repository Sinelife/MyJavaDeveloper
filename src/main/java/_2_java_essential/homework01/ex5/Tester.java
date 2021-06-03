package _2_java_essential.homework01.ex5;

class Tester {
    public static void main(String[] args) {

        Human h1 = new Human("Лия", "Блейн", 25, "девушка", 100000);
        Human h2 = new Human("Пол", "Андерсон", 35, "парень", 120000);
        Human h3 = new Human("Алена", "Петрова", 21, "девушка", 90000);


        /**EX1*/
        System.out.println("EX1(Сума денег двух людей)");
        System.out.println("static: " + h1.twoHumonSum(h2));
        System.out.println("nonstatic: " + HumanMethods.twoHumonSum(h1, h2));


        /**EX2*/
        System.out.println("\n\n\nEX2(Смена фамилии первого человека на второго)");
        System.out.println("static:");
        System.out.println("До изменения: " + h1);
        System.out.println("На кого меняем: " + h2);
        h1.changeSurnameToOther(h2);
        System.out.println("После изменения: " + h1 + "\n");

        System.out.println("nonstatic: ");
        System.out.println("До изменения: " + h1);
        System.out.println("На кого меняем: " + h3);
        HumanMethods.changeSurnameToOther(h1, h3);
        System.out.println("После изменения: " + h1);



        /**EX3*/
        System.out.println("\n\n\nEX3(Смена имени человека на рандомное)");
        System.out.println("static: ");
        System.out.println("До изменения: " + h1);
        System.out.println("На кого меняем: " + h2);
        h1.changeNameToRandom();
        System.out.println("После изменения: " + h1 + "\n");

        System.out.println("nonstatic: ");
        System.out.println("До изменения: " + h1);
        System.out.println("На кого меняем: " + h3);
        HumanMethods.changeNameToRandom(h1);
        System.out.println("После изменения: " + h1);



        /**EX4*/
        System.out.println("\n\n\nEX4(Вывод информации про человека)");
        System.out.println("static: ");
        System.out.println(h3);

        System.out.println("nonstatic: ");
        System.out.println(HumanMethods.toString(h3));



        /**EX5*/
        System.out.println("\n\n\nEX5(Смена планеты(статическая переменная))");
        System.out.println("static: ");
        System.out.println("До изменения ");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        h1.changePlanet("Венера");
        System.out.println("После изменения ");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        System.out.println("\nnonstatic: ");
        System.out.println("До изменения ");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        HumanMethods.changePlanet(h1, "Марс");
        System.out.println("После изменения ");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

    }
}
