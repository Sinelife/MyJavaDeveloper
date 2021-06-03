package _2_java_essential.zzz_fourth_extra_homework.objects._5_organism;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public class Animal extends Organism {
    public Animal(String name, int age) {
        super(name, age);
    }

    public Animal() {}

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public Organism getGeneratedElem() {
        return new Animal(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(1, 350)
        );
    }
}
