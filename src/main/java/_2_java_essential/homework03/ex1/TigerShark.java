package _2_java_essential.homework03.ex1;

final class TigerShark extends Shark {
    TigerShark(String name, int age, double weight, double length, int teethHum) {
        super(name, age, weight, length, teethHum);
    }

    @Override
    int getEatenOrganismNumber() {
        return rand.nextInt(60);
    }

    @Override
    protected void sayHello() {}

    @Override
    int getLegsNum() {
        return 0;
    }
}
