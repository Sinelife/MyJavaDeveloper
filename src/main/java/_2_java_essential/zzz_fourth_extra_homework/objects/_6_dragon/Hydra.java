package _2_java_essential.zzz_fourth_extra_homework.objects._6_dragon;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.NAME;

public class Hydra extends Dragon {
    private int headNum;

    public Hydra(String name, int age, int headNum) {
        super(name, age);
        this.headNum = headNum;
    }

    public Hydra() {}

    int getHeadNum() {
        return headNum;
    }

    public void setHeadNum(int headNum) {
        this.headNum = headNum;
    }


    @Override
    public String toString() {
        return "Hydra{" +
                "name = " + name  + ", " +
                "age = " + age  + ", " +
                "headNum = " + headNum + ", " +
                "hashcode=" + hashCode() +
                "}\n";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + headNum;
    }

    @Override
    public Dragon getGeneratedElem() {
        return new Hydra(
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(1, 10_000),
                service.getGeneratedInteger(1, 25)
        );
    }
}
