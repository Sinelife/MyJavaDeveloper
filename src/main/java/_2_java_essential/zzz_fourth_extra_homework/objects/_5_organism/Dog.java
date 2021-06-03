package _2_java_essential.zzz_fourth_extra_homework.objects._5_organism;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public final class Dog extends Animal {
    private String dogBreed;
    private boolean canUnderstandCommands;

    public Dog(String name, int age, String dogBreed, boolean canUnderstandCommands) {
        super(name, age);
        this.dogBreed = dogBreed;
        this.canUnderstandCommands = canUnderstandCommands;
    }

    public Dog() {}

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public boolean isCanUnderstandCommands() {
        return canUnderstandCommands;
    }

    public void setCanUnderstandCommands(boolean canUnderstandCommands) {
        this.canUnderstandCommands = canUnderstandCommands;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogBreed='" + dogBreed + '\'' +
                ", canUnderstandCommands=" + canUnderstandCommands +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Organism getGeneratedElem() {
        return new Dog(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(0, 15),
                service.getGeneratedString(NAME),
                service.getGeneratedBoolean()
        );
    }
}
