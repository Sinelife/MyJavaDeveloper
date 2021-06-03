package _2_java_essential.homework03.ex5.shapes;

public class Parallelogram extends Shape {

    private double b;
    private double alpha;

    public Parallelogram(double a, double b, double alpha) {
        super(a);
        this.b = b;
        this.alpha = alpha;
        this.area = a * b * Math.sin((alpha * Math.PI) / 180);
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Паралелограм[" + a + "," + b + ",угол = " + alpha + ", площадь = " + area + "]\n";
    }
}
