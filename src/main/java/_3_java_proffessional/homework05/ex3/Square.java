package _3_java_proffessional.homework05.ex3;

public class Square implements Shape {
    private int a;

    Square(int a) {
        this.a = a;
    }


    @Override
    public void draw() {
        drawLine(a);
        drawTwoDots(a);
        drawLine(a);
    }

    private void drawLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(SYMBOL + " ");
        }
        System.out.println();
    }

    private void drawTwoDots(int n) {
        for (int i = 0; i < n - 2; i++) {
            System.out.print(SYMBOL + " ");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("  ");
            }
            System.out.println(SYMBOL + " ");
        }
    }
}
