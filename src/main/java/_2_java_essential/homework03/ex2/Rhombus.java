package _2_java_essential.homework03.ex2;

class Rhombus extends Shape {

    private double alpha;

    Rhombus(double a, double alpha) {
        super(a);
        this.alpha = alpha;
    }

    @Override
    protected double getArea() {
        return a * a * Math.sin((alpha * Math.PI) / 180);
    }

    @Override
    public String toString() {
        return "Ромб[" + a + ",угол = " + alpha + "]";
    }
}
