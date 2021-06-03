package _2_java_essential.homework02.ex1;

final class Baobab extends Plant {
    private int height;
    private double trampRadius;

    Baobab(String name, int age, int height, double trampRadius) {
        super(name, age);
        this.height = height;
        this.trampRadius = trampRadius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getTrampRadius() {
        return trampRadius;
    }

    public void setTrampRadius(double trampRadius) {
        this.trampRadius = trampRadius;
    }

    @Override
    public String toString() {
        return "Baobab{" +
                "name =" + name +
                ", age =" + age +
                ", height=" + height +
                ", trampRadius=" + trampRadius +
                '}';
    }
}
