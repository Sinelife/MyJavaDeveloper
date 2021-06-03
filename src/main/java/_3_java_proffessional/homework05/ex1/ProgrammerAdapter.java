package _3_java_proffessional.homework05.ex1;

public class ProgrammerAdapter {
    private Programmer programmer;

    ProgrammerAdapter(Programmer programmer) {
        this.programmer = programmer;
    }

    public String getName() {
        return programmer.getName();
    }

    public void setName(String name) {
        programmer.setName(name);
    }

    public String getSurname() {
        return programmer.getSurname();
    }

    public void setSurname(String surname) {
        programmer.setSurname(surname);
    }

    public int getAge() {
        return programmer.getAge();
    }

    public void setAge(int age) {
        programmer.setAge(age);
    }

    public Gender getGender() {
        return programmer.getGender();
    }

    public void setGender(Gender gender) {
        programmer.setGender(gender);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}
