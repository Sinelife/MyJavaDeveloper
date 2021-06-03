package _2_java_essential.homework03.ex5.shapes;

public class Trapeze extends Shape {

    private double b;
    private double h;

    public Trapeze(double a, double b, double h) {
        super(a);
        this.b = b;
        this.h = h;
        this.area = ((a + b) / 2) * h;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Трапеция[" + a + "," + b + ",высота = " + h + ", площадь = " + area + "]\n";
    }
}
