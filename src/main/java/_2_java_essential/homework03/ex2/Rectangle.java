package _2_java_essential.homework03.ex2;

class Rectangle extends Shape {

    private double b;

    Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    protected double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Прямоугольник[" + a + "," + b + "]";
    }
}
