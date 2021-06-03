package _2_java_essential.zzz_fourth_extra_homework.objects._2_shapes;

import _2_java_essential.zzz_fourth_extra_homework.objects.Generator;

public class Triangle extends Shape {

    private double h;

    public Triangle(double a, double h) {
        super(a);
        this.h = h;
        this.area = (a * h) / 2;
    }

    public Triangle() {}

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Триугольник[" + a + ",высота = " + h + ", площадь = " + area + "]\n";
    }

    @Override
    public Shape getGeneratedElem() {
        return new Rectangle(Generator.random.nextInt(1000), Generator.random.nextInt(1000));
    }
}
