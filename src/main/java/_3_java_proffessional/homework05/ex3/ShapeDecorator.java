package _3_java_proffessional.homework05.ex3;

public class ShapeDecorator implements Shape{
    protected Shape shape;

    ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
