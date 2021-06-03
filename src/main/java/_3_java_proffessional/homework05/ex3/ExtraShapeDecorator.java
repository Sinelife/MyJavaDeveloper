package _3_java_proffessional.homework05.ex3;

public class ExtraShapeDecorator extends ShapeDecorator {

    private int number;

    ExtraShapeDecorator(Shape shape, int number) {
        super(shape);
        this.number = number;
    }

    @Override
    public void draw() {
        for (int i = 0; i < number; i++) {
            shape.draw();
            System.out.println();
        }
    }
}
