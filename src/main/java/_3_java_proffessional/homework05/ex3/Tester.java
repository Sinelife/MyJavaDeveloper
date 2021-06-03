package _3_java_proffessional.homework05.ex3;

class Tester {
    public static void main(String[] args) {
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10, 5);

        square.draw();
        System.out.println("\n\n");

        rectangle.draw();
        System.out.println("\n\n");

        ShapeDecorator decorator = new ShapeDecorator(rectangle);
        decorator.draw();
        System.out.println("\n\n");


        SuperShapeDecorator superDecorator = new SuperShapeDecorator(square);
        superDecorator.draw();
        System.out.println("\n\n");
        superDecorator = new SuperShapeDecorator(rectangle);
        superDecorator.draw();
        System.out.println("\n\n");
        ExtraShapeDecorator extraDecorator = new ExtraShapeDecorator(square, 3);
        extraDecorator.draw();
        extraDecorator = new ExtraShapeDecorator(new Dot(), 6);
        extraDecorator.draw();
        extraDecorator = new ExtraShapeDecorator(new Line(19), 3);
        extraDecorator.draw();

    }
}
