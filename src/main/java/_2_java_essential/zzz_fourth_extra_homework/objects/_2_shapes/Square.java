package _2_java_essential.zzz_fourth_extra_homework.objects._2_shapes;

import _2_java_essential.zzz_fourth_extra_homework.objects.Generator;

public class Square extends Shape {

    public Square(double a) {
        super(a);
        this.area = a * a;
    }

    public Square() {}

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Квадрат[" + a + ", площадь = " + area + "]\n";
    }

    @Override
    public Shape getGeneratedElem() {
        return new Square(Generator.random.nextInt(1000));
    }
}
