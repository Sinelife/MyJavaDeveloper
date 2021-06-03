package _2_java_essential.zzz_fourth_extra_homework.objects._6_dragon;
import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public class WaterDragon extends Dragon {
    private double bodyLength;

    public WaterDragon(String name, int age, double bodyLength) {
        super(name, age);
        this.bodyLength = bodyLength;
    }

    public WaterDragon() {}

    double getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
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

    @Override
    public Dragon getGeneratedElem() {
        return new WaterDragon(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(1, 10_000),
                service.getGeneratedDouble(10, 100)
        );
    }
}
