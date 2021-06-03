package _2_java_essential.homework03.ex5.shapes;

public class Square extends Shape {

    public Square(double a) {
        super(a);
        this.area = a * a;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Квадрат[" + a + ", площадь = " + area + "]\n";
    }
}
