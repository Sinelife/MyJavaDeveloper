package _2_java_essential.homework05._2_inner_nested_classes.ex6;

import java.util.*;

class Tester {
    public static void main(String[] args) {
        List<CompletePersonage> list = new ArrayList<>(Arrays.asList(shiro, silvi, sandro, midnight, vincent, laiserg, mitsune, kahat));

        System.out.println("Персонажи с силой проклятия как у " + gaarh.name + " " + gaarh.surname + " : ");
        System.out.println(gaarh.getPersonagesWithSameAnathemaAbility(list) + "\n\n\n\n");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Персонажи с типом оружия как у " + gaarh.name + " " + gaarh.surname + " : ");
        System.out.println(gaarh.getPersonagesWithSameWeaponType(list) +"\n\n\n\n");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Персонажи с типом руны у оружия как у " + gaarh.name + " " + gaarh.surname + " : ");
        System.out.println(gaarh.getPersonagesWithSameWeaponRuneAbility(list) + "\n\n\n\n");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");

        List<String> powerTypes = new ArrayList<>(Arrays.asList("Поглощающий магию", "Усиливающий магию сильфидов"));
        System.out.println("Персонажи с оружием с силой " + powerTypes + ": ");
        System.out.println(CompletePersonage.getPersonagesWithChosenWeaponPowerType(list, powerTypes));

    }



    private static CompletePersonage shiro = new CompletePersonage(
            "Широ",
            "Сильверсол",
            Race.SILFID,
            Gender.GIRL,
            "Магия Серебряных Сильфидов",
            16,
            new CompletePersonage.Weapon("Клинок Ксантель", "Короткий меч", "Усиливающий заклинания", new CompletePersonage.Weapon().new Rune("Руна пламени", "Урон огнем")),
            new CompletePersonage().new Anathema("Сила Мортал", "Усиление скрытой силы")
    );

    private static CompletePersonage silvi = new CompletePersonage(
            "Сильви",
            "Сильверсол",
            Race.SILFID,
            Gender.GIRL,
            "Магия Серебряных Сильфидов",
            40,
            new CompletePersonage.Weapon("Клинок Дзантель", "Дворучный меч", "Усиливающий магию сильфидов", new CompletePersonage.Weapon().new Rune("Королевская руна сильфидов", "Размножение клинка")),
            null
    );

    private static CompletePersonage sandro = new CompletePersonage(
            "Сандро",
            "Сильверсол",
            Race.SILFID,
            Gender.BOY,
            "Магия Серебряных Сильфидов",
            89,
            new CompletePersonage.Weapon("Сильфийский клинок Долант", "Копье", "Блокирующий магию", new CompletePersonage.Weapon().new Rune("Королевская руна сильфидов", "Размножение клинка")),
            new CompletePersonage().new Anathema("Проклятая метка мглы", "Сокрытие присутствия")
    );

    private static CompletePersonage midnight = new CompletePersonage(
            "Миднайт",
            "Найтвиш",
            Race.NEPHELIM,
            Gender.BOY,
            "Магия темной материи",
            89,
            new CompletePersonage.Weapon("Телпурран", "Меч", "Поглощающий магию", new CompletePersonage.Weapon().new Rune("Руна Найт", "Укрепление меча")),
            new CompletePersonage().new Anathema("Проклятие падшего нефелима", "Призыв сил павшего нефелима")
    );

    private static CompletePersonage vincent = new CompletePersonage(
            "Винсент",
            "Варбрингер",
            Race.ELDAR,
            Gender.BOY,
            "Стихийная магия молнии",
            158,
            new CompletePersonage.Weapon("Клинок Грома", "Меч", "Поглощающий магию", new CompletePersonage.Weapon().new Rune("Руна Каминари", "Урон молнией")),
            null
    );

    private static CompletePersonage laiserg = new CompletePersonage(
            "Лайсерг",
            "Хрон",
            Race.ARCHONT,
            Gender.BOY,
            "Стихийная магия света",
            24,
            new CompletePersonage.Weapon("Родовой клинок клана Хрон Лайтингер", "Меч", "Поглощающий магию", new CompletePersonage.Weapon().new Rune("Руна алого света", "Урон светом")),
            new CompletePersonage().new Anathema("Древняя сила алого проклятого света", "Абсолютная скорость и мощь алого света")
    );


    private static CompletePersonage mitsune = new CompletePersonage(
            "Мицуне",
            "Хрон",
            Race.ARCHONT,
            Gender.GIRL,
            "Стихийная магия света",
            21,
            new CompletePersonage.Weapon("Сарпентос", "Короткий меч", "Концентрирующий магию", new CompletePersonage.Weapon().new Rune("Руна света судьбы", "Мутирующая сила")),
            new CompletePersonage().new Anathema("Проклятие гиблости", "Усиление скрытой силы")
    );


    private static CompletePersonage kahat = new CompletePersonage(
            "Кахат",
            "Валкхар",
            Race.ELDAR,
            Gender.BOY,
            "Стихийная магия огня",
            27,
            new CompletePersonage.Weapon("Феникзоур", "Меч", "Поглощающий магию", new CompletePersonage.Weapon().new Rune("Руна огненого владыки", "Урон огнем")),
            new CompletePersonage().new Anathema("Сила Мортал", "Усиление скрытой силы")
    );

    private static CompletePersonage gaarh = new CompletePersonage(
            "Гаарх",
            "Накхар",
            Race.ELDAR,
            Gender.BOY,
            "Стихийная магия земли",
            28,
            new CompletePersonage.Weapon("Стоунклоуст", "Дворучный меч", "Концентрирующий магию", new CompletePersonage.Weapon().new Rune("Руна земли судьбы", "Мутирующая сила")),
            new CompletePersonage().new Anathema("Сила Мортал", "Усиление скрытой силы")
    );
}
