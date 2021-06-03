package _2_java_essential.homework00.ex1;

class Employee {
    int id;
    String firstName;
    String lastName;
    int age;
    int salary;
    boolean isMarried;

    /**
     * Конструтор по умолчанию
     */
    Employee() {}

    /**
     * Конструктор, в котором задаються все поля класа
     */
    Employee(int id, String firstName, String lastName, int age, int salary, boolean isMarried) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
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
            result += ", не женат/не замужем.";
        }
        return result;
    }
}
