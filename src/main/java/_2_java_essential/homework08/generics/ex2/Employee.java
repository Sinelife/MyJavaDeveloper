package _2_java_essential.homework08.generics.ex2;

class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private boolean isMarried;
    private Contact contact;

    /**
     * Конструтор по умолчанию
     */
    Employee() {
    }

    /**
     * Конструктор, в котором задаються все поля класа
     */
    Employee(int id, String firstName, String lastName, int age, int salary, boolean isMarried, Contact contact) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        this.contact = contact;
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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * Метод, который выводит информацыю про заданого работника
     */
    @Override
    public String toString() {
        String result = firstName + " " + lastName + ", зарплата = " + salary
                + ", возраст = " + age;
        if (isMarried) {
            result += ", женат/замужем.";
        } else {
            result += ", не женат/не замужем, ";
        }
        result += contact;
        return result;
    }
}

