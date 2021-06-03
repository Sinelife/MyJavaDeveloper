package _2_java_essential.homework03.ex1;

abstract class Human extends Animal {
    protected String surname;
    protected String sex;

    Human(String name, int age, String surname, String sex) {
        super(name, age);
        this.surname = surname;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
