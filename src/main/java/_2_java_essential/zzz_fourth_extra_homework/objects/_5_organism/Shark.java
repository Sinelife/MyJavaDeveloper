package _2_java_essential.zzz_fourth_extra_homework.objects._5_organism;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public final class Shark extends Animal {
    private double weight;
    private double length;
    private int teethNum;

    public Shark(String name, int age, double weight, double length, int teethHum) {
        super(name, age);
        this.weight = weight;
        this.length = length;
        this.teethNum = teethHum;
    }

    public Shark() {}

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getTeethNum() {
        return teethNum;
    }

    public void setTeethNum(int teethNum) {
        this.teethNum = teethNum;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "weight=" + weight +
                ", length=" + length +
                ", teethHum=" + teethNum +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public Organism getGeneratedElem() {
        return new Shark(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(0, 25),
                service.getGeneratedDouble(1_000, 4_000),
                service.getGeneratedDouble(1, 12),
                service.getGeneratedInteger(20, 130)
        );
    }
}
