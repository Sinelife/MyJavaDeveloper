package _2_java_essential.zzz_fourth_extra_homework;

import _2_java_essential.zzz_fourth_extra_homework.objects._10_programmer.MyString;
import _2_java_essential.zzz_fourth_extra_homework.objects._10_programmer.Programmer;
import _2_java_essential.zzz_fourth_extra_homework.objects._1_primitives.*;
import _2_java_essential.zzz_fourth_extra_homework.objects._2_shapes.Shape;
import _2_java_essential.zzz_fourth_extra_homework.objects._3_employee.*;
import _2_java_essential.zzz_fourth_extra_homework.objects._4_races.Personage;
import _2_java_essential.zzz_fourth_extra_homework.objects._5_organism.Organism;
import _2_java_essential.zzz_fourth_extra_homework.objects._6_dragon.Dragon;
import _2_java_essential.zzz_fourth_extra_homework.objects._7_spaceship.*;
import _2_java_essential.zzz_fourth_extra_homework.objects._8_formula.*;
import _2_java_essential.zzz_fourth_extra_homework.objects._9_creatures.*;
import static _2_java_essential.zzz_fourth_extra_homework.objects._10_programmer.Programmer.*;

class Tester {

    public static void main(String[] args) {
        int size = 3_000;

        TimeCounter timeCounter = new TimeCounter();
        timeCounter.outputAll(size,
                MyInteger.class, MyDouble.class, MyBoolean.class, MyShort.class, MyLong.class, MyByte.class, MyFloat.class, MyString.class,
                Shape.class,
                Employee.class, Student.class,
                Personage.class, //CompletePersonage.class,
                Organism.class,
                Dragon.class,
                SpaceShip.class, BattleSpaceShip.class, TransportSpaceShip.class, MerchantSpaceShip.class,
                Formula.class,
                Creature.class
        );

        for (int index = 0; index < ProgrammerSortVariant.values().length;) {
            Programmer.setSortVariant(Programmer.ProgrammerSortVariant.values()[index++]);
            System.out.println("-----------------------" + Programmer.getSortVariant().name() + "----------------------------");
            timeCounter.outputAll(size, Programmer.class);
        }

    }

}
