package _2_java_essential.homework03.ex2;

class Square extends Shape {

    Square(double a) {
        super(a);
    }

    @Override
    protected double getArea() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Квадрат[" + a + "]";
    }
}
