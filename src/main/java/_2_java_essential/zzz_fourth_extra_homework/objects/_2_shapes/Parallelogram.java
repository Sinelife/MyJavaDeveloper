package _2_java_essential.zzz_fourth_extra_homework.objects._2_shapes;

public class Parallelogram extends Shape {

    private double b;
    private double alpha;

    public Parallelogram(double a, double b, double alpha) {
        super(a);
        this.b = b;
        this.alpha = alpha;
        this.area = a * b * Math.sin((alpha * Math.PI) / 180);
    }

    public Parallelogram() {}

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Паралелограм[" + a + "," + b + ",угол = " + alpha + ", площадь = " + area + "]\n";
    }

    @Override
    public Shape getGeneratedElem() {
        return new Parallelogram(random.nextInt(1000), random.nextInt(1000), random.nextDouble());
    }
}
