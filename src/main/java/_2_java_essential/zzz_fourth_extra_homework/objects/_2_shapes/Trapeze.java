package _2_java_essential.zzz_fourth_extra_homework.objects._2_shapes;

import _2_java_essential.zzz_fourth_extra_homework.objects.Generator;

public class Trapeze extends Shape {

    private double b;
    private double h;

    public Trapeze(double a, double b, double h) {
        super(a);
        this.b = b;
        this.h = h;
        this.area = ((a + b) / 2) * h;
    }

    public Trapeze() {}

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Трапеция[" + a + "," + b + ",высота = " + h + ", площадь = " + area + "]\n";
    }

    @Override
    public Shape getGeneratedElem() {
        return new Trapeze(Generator.random.nextInt(1000), Generator.random.nextInt(1000), Generator.random.nextInt(1000));
    }
}
