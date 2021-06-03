package _2_java_essential.homework02.ex6;

class WaterDragon extends Dragon{

    private double bodyLength;

    WaterDragon(String name, int age, double bodyLength) {
        super(name, age);
        this.bodyLength = bodyLength;
        this.hash = hashCode();
    }

    double getBodyLength() {
        return bodyLength;
    }

    @Override
    public String toString() {
        return "WaterDragon{" +
                "name = " + name + ", " +
                "age = " + age + ", " +
                "bodyLength = " + bodyLength + ", " +
                "hashcode=" + hashCode() +
                "}\n";
    }

    @Override
    public int hashCode() {
        return (int) (super.hashCode() + bodyLength);
    }
}
