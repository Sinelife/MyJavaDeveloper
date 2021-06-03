package _2_java_essential.homework03.ex1;

import java.util.Random;

abstract class Shark extends Animal {
    private double weight;
    private double length;
    private int teethHum;

    Shark(String name, int age, double weight, double length, int teethHum) {
        super(name, age);
        this.weight = weight;
        this.length = length;
        this.teethHum = teethHum;
    }


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

    public int getTeethHum() {
        return teethHum;
    }

    public void setTeethHum(int teethHum) {
        this.teethHum = teethHum;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "weight=" + weight +
                ", length=" + length +
                ", teethHum=" + teethHum +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    abstract int getEatenOrganismNumber();


    protected Random rand = new Random();
}
