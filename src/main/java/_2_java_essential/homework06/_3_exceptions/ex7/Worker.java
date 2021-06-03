package _2_java_essential.homework06._3_exceptions.ex7;

class Worker {

    private String name;
    private String surname;
    private String secondName;
    private int age;
    private int salary;

    Worker(String name, String surname, String secondName, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
