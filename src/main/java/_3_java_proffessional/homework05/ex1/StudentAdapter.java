package _3_java_proffessional.homework05.ex1;

public class StudentAdapter extends Human {

    private Student student;

    StudentAdapter(Student student) {
        this.student = student;
    }

    public String getName() {
        return student.getName();
    }

    public void setName(String name) {
        student.setName(name);
    }

    public String getSurname() {
        return student.getSurname();
    }

    public void setSurname(String surname) {
        student.setSurname(surname);
    }

    public int getAge() {
        return student.getAge();
    }

    public void setAge(int age) {
        student.setAge(age);
    }

    public Gender getGender() {
        return student.getGender();
    }

    public void setGender(Gender gender) {
        student.setGender(gender);
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
