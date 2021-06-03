package _2_java_essential.zzz_fourth_extra_homework.objects._2_shapes;

public class Rhombus extends Shape {

    private double alpha;

    public Rhombus(double a, double alpha) {
        super(a);
        this.alpha = alpha;
        this.area = a * a * Math.sin((alpha * Math.PI) / 180);
    }

    public Rhombus() {}

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Ромб[" + a + ",угол = " + alpha + ", площадь = " + area + "]\n";
    }

    @Override
    public Shape getGeneratedElem() {
        return new Rhombus(random.nextInt(1000), random.nextDouble());
    }
}
