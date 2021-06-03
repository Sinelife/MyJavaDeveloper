package _2_java_essential.homework03.ex2;

abstract class Shape {
    protected double a;

    Shape(double a) {
        this.a = a;
    }

    protected abstract double getArea();

    public abstract String toString();
}
