package _2_java_essential.homework08.generics.ex3;

class Hydra extends Dragon {

    private int headNum;

    Hydra(String name, int age, int headNum) {
        super(name, age);
        this.headNum = headNum;
        this.hash = hashCode();
    }

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
}
