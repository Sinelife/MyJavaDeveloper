package _2_java_essential.zzz_fourth_extra_homework.objects._5_organism;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public class Plant extends Organism {
    public Plant(String name, int age) {
        super(name, age);
    }

    public Plant() {}

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    @Override
    public Organism getGeneratedElem() {
        return new Plant(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(1, 1300)
        );
    }
}
