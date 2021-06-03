package _2_java_essential.homework08.generics.ex4;


class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private boolean isMarried;


    Employee() {

    }

    Employee(int id, String firstName, String lastName, int age, int salary, boolean isMarried) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }



    @Override
    public String toString() {
        String result = firstName + " " + lastName + ", зарплата = " + salary
                + ", возраст = " + age;
        if (isMarried) {
            result += ", женат/замужем.";
        } else {
            result += ", не женат/не замужем, ";
        }
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getId() != employee.getId()) return false;
        if (getAge() != employee.getAge()) return false;
        if (getSalary() != employee.getSalary()) return false;
        if (isMarried() != employee.isMarried()) return false;
        if (getFirstName() != null ? !getFirstName().equals(employee.getFirstName()) : employee.getFirstName() != null)
            return false;
        return getLastName() != null ? getLastName().equals(employee.getLastName()) : employee.getLastName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + getAge();
        result = 31 * result + getSalary();
        result = 31 * result + (isMarried() ? 1 : 0);
        return result;
    }
}

