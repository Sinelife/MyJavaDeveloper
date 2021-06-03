package _3_java_proffessional.homework05.ex3;

public class Rectangle implements Shape {
    private int a;
    private int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        drawLine(a);
        drawTwoDots(b, a);
        drawLine(a);
    }

    private void drawLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(SYMBOL + " ");
        }
        System.out.println();
    }

    private void drawTwoDots(int n, int m) {
        for (int i = 0; i < n - 2; i++) {
            System.out.print(SYMBOL + " ");
            for (int j = 0; j < m - 2; j++) {
                System.out.print("  ");
            }
            System.out.println(SYMBOL + " ");
        }
    }
}
