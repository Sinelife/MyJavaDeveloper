package _2_java_essential.homework03.ex5.shapes;

public class Rectangle extends Shape {

    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
        this.area = a * b;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Прямоугольник[" + a + "," + b + ", площадь = " + area + "]\n";
    }
}
