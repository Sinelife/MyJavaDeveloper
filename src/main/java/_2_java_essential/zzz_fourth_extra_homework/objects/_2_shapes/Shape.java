package _2_java_essential.zzz_fourth_extra_homework.objects._2_shapes;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class Shape extends AbstractEntity<Shape> {
    protected double a;
    protected Double area;

    public Shape(double a) {
        this.a = a;
    }

    public Shape() {}

    public double getArea() {
        return 0;
    }

    @Override
    public Shape getGeneratedElem() {
        Class[] classes = {Parallelogram.class, Square.class, Rectangle.class, Triangle.class, Rhombus.class, Trapeze.class};
        Class clazz = classes[random.nextInt(classes.length)];
        Shape shape = null;
        try {
            shape = (Shape) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return shape.getGeneratedElem();
    }

//    @Override
//    public Shape[] getGeneratedArray(int size, Class<Shape> elemClass) {
//        Shape[] shapes = new Shape[size];
//        Class[] classes = {Parallelogram.class, Square.class, Rectangle.class, Triangle.class, Rhombus.class, Trapeze.class};
//        for (int i = 0; i < shapes.length; i++) {
//            Class clazz = classes[random.nextInt(classes.length)];
//            Shape o = null;
//            try {
//                o = (Shape) clazz.newInstance();
//            } catch (InstantiationException | IllegalAccessException e) {
//                e.printStackTrace();
//            }
//            shapes[i] = o.getGeneratedElem();
//        }
//        return shapes;
//    }

    @Override
    public int compareTo(Shape shape) {
        return area.compareTo(shape.area);
    }
}
