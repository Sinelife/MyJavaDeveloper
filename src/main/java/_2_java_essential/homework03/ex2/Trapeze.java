package _2_java_essential.homework03.ex2;

class Trapeze extends Shape {

    private double b;
    private double h;

    Trapeze(double a, double b, double h) {
        super(a);
        this.b = b;
        this.h = h;
    }

    @Override
    protected double getArea() {
        return ((a + b) / 2) * h;
    }

    @Override
    public String toString() {
        return "Трапеция[" + a + "," + b + ",высота = " + h + "]";
    }
}
