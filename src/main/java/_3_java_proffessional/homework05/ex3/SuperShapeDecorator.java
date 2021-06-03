package _3_java_proffessional.homework05.ex3;

public class SuperShapeDecorator extends ShapeDecorator {

    SuperShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        drawLine(30);
        System.out.println("Тип Фигуры - " +shape.getClass().getSimpleName());
        shape.draw();
        drawLine(30);
    }

    private void drawLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("#");
        }
        System.out.println();
    }


}
