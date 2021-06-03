package _2_java_essential.zzz_fourth_extra_homework.objects._2_shapes;

public class Rectangle extends Shape {

    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
        this.area = a * b;
    }

    public Rectangle() {}

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Прямоугольник[" + a + "," + b + ", площадь = " + area + "]\n";
    }

    @Override
    public Shape getGeneratedElem() {
        return new Rectangle(random.nextInt(1000), random.nextInt(1000));
    }
}
