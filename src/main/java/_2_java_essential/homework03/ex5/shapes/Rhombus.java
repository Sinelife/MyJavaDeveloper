package _2_java_essential.homework03.ex5.shapes;

public class Rhombus extends Shape {

    private double alpha;

    public Rhombus(double a, double alpha) {
        super(a);
        this.alpha = alpha;
        this.area = a * a * Math.sin((alpha * Math.PI) / 180);
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Ромб[" + a + ",угол = " + alpha + ", площадь = " + area + "]\n";
    }
}
