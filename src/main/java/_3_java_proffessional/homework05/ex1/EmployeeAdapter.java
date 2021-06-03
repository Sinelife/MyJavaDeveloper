package _3_java_proffessional.homework05.ex1;

public class EmployeeAdapter extends Human {

    private Employee employee;

    EmployeeAdapter(Employee employee) {
        this.employee = employee;
    }

    public String getName() {
        return employee.getName();
    }

    public void setName(String name) {
        employee.setName(name);
    }

    public String getSurname() {
        return employee.getSurname();
    }

    public void setSurname(String surname) {
        employee.setSurname(surname);
    }

    public int getAge() {
        return employee.getAge();
    }

    public void setAge(int age) {
        employee.setAge(age);
    }

    public Gender getGender() {
        return employee.getGender();
    }

    public void setGender(Gender gender) {
        employee.setGender(gender);
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
