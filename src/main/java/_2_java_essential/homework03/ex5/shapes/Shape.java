package _2_java_essential.homework03.ex5.shapes;

public abstract class Shape {
    protected double a;

    protected Shape(double a) {
        this.a = a;
    }

    public abstract double getArea();

    public abstract String toString();

    protected double area;
}
