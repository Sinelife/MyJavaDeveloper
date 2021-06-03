package _3_java_proffessional.homework00.ex3;


public class Employee implements Comparable<Employee> {

    private String name;
    private String surname;
    private String secondName;
    private double salary;

    public Employee(String name, String surname, String secondName, double salary) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                "}\n";
    }

    @Override
    public int compareTo(Employee employee) {
        if (employee.salary > this.salary) {
            return 1;
        }
        return -1;
    }
}
