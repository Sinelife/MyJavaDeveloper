package _2_java_essential.zzz_fourth_extra_homework.objects._5_organism;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public final class Baobab extends Plant {
    private int height;
    private double trampRadius;

    public Baobab(String name, int age, int height, double trampRadius) {
        super(name, age);
        this.height = height;
        this.trampRadius = trampRadius;
    }

    public Baobab() {}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getTrampRadius() {
        return trampRadius;
    }

    public void setTrampRadius(double trampRadius) {
        this.trampRadius = trampRadius;
    }

    @Override
    public String toString() {
        return "Baobab{" +
                "name =" + name +
                ", age =" + age +
                ", height=" + height +
                ", trampRadius=" + trampRadius +
                '}';
    }

    @Override
    public Organism getGeneratedElem() {
        return new Baobab(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(1, 1_300),
                service.getGeneratedInteger(1, 100),
                service.getGeneratedDouble(0, 5)
        );
    }
}
