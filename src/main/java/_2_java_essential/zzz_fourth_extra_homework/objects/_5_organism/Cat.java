package _2_java_essential.zzz_fourth_extra_homework.objects._5_organism;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public final class Cat extends Animal {
    private String catBreed;
    private boolean isGentle;

    public Cat(String name, int age, String catBreed, boolean isGentle) {
        super(name, age);
        this.catBreed = catBreed;
        this.isGentle = isGentle;
    }

    public Cat() {}

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public boolean isGentle() {
        return isGentle;
    }

    public void setGentle(boolean gentle) {
        isGentle = gentle;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catBreed='" + catBreed + '\'' +
                ", isGentle=" + isGentle +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Organism getGeneratedElem() {
        return new Cat(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(0, 25),
                service.getGeneratedString(NAME),
                true//service.getGeneratedBoolean()
        );
    }
}
