package _2_java_essential.homework03.ex5.shapes;

public class Triangle extends Shape {

    private double h;

    public Triangle(double a, double h) {
        super(a);
        this.h = h;
        this.area = (a * h) / 2;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Триугольник[" + a + ",высота = " + h + ", площадь = " + area + "]\n";
    }
}
