package _2_java_essential.homework02.ex6;

class Hydra extends Dragon{

    private int headNum;

    Hydra(String name, int age, int headNum) {
        super(name, age);
        this.headNum = headNum;
        this.hash = hashCode();
    }

    int getHeadNum() {
        return headNum;
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
}
