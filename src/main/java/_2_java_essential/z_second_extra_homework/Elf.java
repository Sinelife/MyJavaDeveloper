package _2_java_essential.z_second_extra_homework;


/**
 * Абстрактный клас эльфов, от которого наследуються разные виды эльфов
 */

abstract class Elf extends Hero {

    Elf(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);

    }
}
