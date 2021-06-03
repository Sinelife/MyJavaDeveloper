package _2_java_essential.homework03.ex5;

import _2_java_essential.homework03.ex5.shapes.*;

import java.util.Random;

class Generator {
    private static Random random = new Random();

    /**INTEGER GENERATOR*/

    /**Метод для генерации масива чисел*/
    public int[] getGeneratedIntegerArray(int size) {
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = random.nextInt(1000) - 500;
        }
        return ints;
    }




    /**STRING GENERATOR*/

    /**Метод для генерации масива строк*/
    public String[] getGeneratedStringArray(int size) {
        String [] strings = new String[size];
        for (int i = 0; i < size; i++) {
            strings[i] = getGeneratedString();
        }
        return strings;
    }

    /**Метод для генерации строки*/
    private String getGeneratedString() {
        int wordSize = random.nextInt(12) + 3;
        String res = "";
        for (int i = 0; i < wordSize; i++) {
            res += getGeneratedSymbol();
        }
        return res;
    }

    /**Метод для генерации символа*/
    private String getGeneratedSymbol() {
        return String.valueOf((char) (random.nextInt('z' - 'a') + 97));
    }



    /**SHAPE GENERATOR*/
    public Shape[] getGeneratedShapeArray(int size) {
        Shape [] shapes = new Shape[size];
        for (int i = 0; i < size; i++) {
            shapes[i] = getGeneratedShape();
        }
        return shapes;
    }

    private Shape getGeneratedShape() {
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0:
                return getGeneratedParallelogram();
            case 1:
                return getGeneratedRhombus();
            case 2:
                return getGeneratedSquare();
            case 3:
                return getGeneratedRectangle();
            case 4:
                return getGeneratedTriangle();
            case 5:
                return getGeneratedTrapeze();
        }
        return null;
    }

    private Shape getGeneratedTrapeze() {
        return new Trapeze(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));
    }

    private Shape getGeneratedTriangle() {
        return new Triangle(random.nextInt(1000), random.nextInt(1000));
    }

    private Shape getGeneratedRectangle() {
        return new Rectangle(random.nextInt(1000), random.nextInt(1000));
    }

    private Shape getGeneratedSquare() {
        return new Square(random.nextInt(1000));
    }

    private Shape getGeneratedRhombus() {
        return new Rhombus(random.nextInt(1000), random.nextDouble());
    }

    private Shape getGeneratedParallelogram() {
        return new Parallelogram(random.nextInt(1000), random.nextInt(1000), random.nextDouble());
    }

}
