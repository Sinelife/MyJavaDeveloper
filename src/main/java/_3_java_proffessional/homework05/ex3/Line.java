package _3_java_proffessional.homework05.ex3;

public class Line implements Shape {

    private int a;

    Line(int a) {
        this.a = a;
    }

    @Override
    public void draw() {
        drawLine(a);
    }

    private void drawLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(SYMBOL + " ");
        }
        System.out.println();
    }
}
