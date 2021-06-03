package _3_java_proffessional.homework05.ex4;

import java.util.Arrays;

class Tester {
    public static void main(String[] args) {
        String text = "After akoko a 1000 akoko akoko akoko akoko akoko zoo! mission akoko akoko 10 has been 2 completed, points are tallied up, the participants are allowed to leave and do as they see fit until their next mission, with the exception of talking about Gantz which would lead to their heads exploding. During Kurono and Kato's third mission, all the participants including Kato are killed, however Kato kills the last boss giving Kurono a chance to survive. Kurono survives the third mission bleeding on the floor with his limbs cut apart. After the third mission Kurono starts to change inside adopting a hero, leader complex similar to Kato. As the series continues, Kurono participates with the objective of reviving his deceased friends with the 100 point reward option. A new team of Gantz players is assembled, which Kurono leads, as the most experienced veteran and one of the best fighters. In the Oni mission it is shown that with Kurono's \"will to live\" he becomes the most ferocious Gantz hunter in the team. Through his interactions with the other members of the team and his life or death battles, Kurono gradually grows into a responsible leader. After the Oni mission Kato is revived by Kurono, and soon after Kurono meets his demise against the vampires. As the series goes on, the rules of the missions change; they can now be seen by regular people, the aliens they encounter are increasingly more powerful and dangerous, and they participate in a mission with another Gantz team from Osaka. Kato becomes the center of attention in the manga and his quest to revive Kurono. In a desperate attempt to revive his best friend, Kato fights the one hundred point alien Nurarihyon which obliterates both Osaka and Kurono's team. At the end of the mission, similar to the first time Kato died, he defeats arguably the strongest alien in the series and is laid bleeding on the floor. The series depicts both the missions and Kurono's regular life, as well as the daily lives of other 12:46 Gantz players (to a lesser extent). 2018-05-22  2018-02-01,";

        System.out.println("EX1");
        System.out.println(RegExMethods.getOnlyLetOrNumFromStr(text, "letter"));
        System.out.println(RegExMethods.getOnlyLetOrNumFromStr(text, "number"));
        System.out.println(RegExMethods.getOnlyLetOrNumFromStr(text, ""));

        System.out.println("\n\nEX2");
        System.out.println(RegExMethods.getOnlyWordsWithOccurNM(text, 5, 10));

        System.out.println("\n\nEX3");
        System.out.println(RegExMethods.getOnlyWords3And7Interval(text));

        System.out.println("\n\nEX4");
        System.out.println(RegExMethods.getWordsWhichStartOnLetter(text, 'a'));

        System.out.println("\n\nEX5");
        System.out.println(RegExMethods.getWordsWhichEndsOnLetter(text, 'o'));

        System.out.println("\n\nEX6");
        System.out.println(RegExMethods.getWordsWhichHasLetter(text, 'z'));

        System.out.println("\n\nEX7");
        char[] symbols = {'a', 'o', 'u'};
        System.out.println(RegExMethods.getWordsWhichHasLetters(text, symbols));

        System.out.println("\n\nEX8");
        System.out.println(RegExMethods.getWordsWhichIsNotInList(text, Arrays.asList("akoko", "Gantz", "leader")));

        System.out.println("\n\nEX9");
        System.out.println(RegExMethods.getOnlyDates(text));

        System.out.println("\n\nEX10");
        System.out.println(RegExMethods.getDatesAndTime(text));
    }
}
