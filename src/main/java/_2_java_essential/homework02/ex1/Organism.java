package _2_java_essential.homework02.ex1;

class Organism {
    protected String name;
    protected int age;

    Organism(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Organism{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
