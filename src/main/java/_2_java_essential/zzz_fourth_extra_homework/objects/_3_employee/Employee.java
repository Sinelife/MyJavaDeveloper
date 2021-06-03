package _2_java_essential.zzz_fourth_extra_homework.objects._3_employee;
import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.*;

public class Employee extends AbstractEntity<Employee> {
    private MyString firstName;
    private String lastName;
    private int age;
    private int salary;
    private boolean isMarried;
    private Contact contact;

    public Employee() {
    }

    public Employee(MyString firstName, String lastName, int age, int salary, boolean isMarried, Contact contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        this.contact = contact;
    }

    public MyString getFirstName() {
        return firstName;
    }

    public void setFirstName(MyString firstName) {
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


    @Override
    public int compareTo(Employee o) {
        return this.firstName.compareTo(o.firstName);
    }

    @Override
    public Employee getGeneratedElem() {
        return new Employee(
                new MyString(service.getGeneratedString(NAME)),
                service.getGeneratedString(NAME),
                service.getGeneratedInteger(12, 110),
                service.getGeneratedInteger(4_200, 10_000_000),
                service.getGeneratedBoolean(),
                new Contact().getGeneratedElem());
    }


    public class Contact extends AbstractEntity<Contact> {
        private String phone;
        private String email;

        Contact() {}

        Contact(String phone, String email) {
            this.phone = phone;
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        @Override
        public String toString() {
            return "contacts(" + phone + ", " + email + ")";
        }

        @Override
        public int compareTo(Contact o) {
            return phone.compareTo(o.phone);
        }

        @Override
        public Contact getGeneratedElem() {
            return new Contact(service.getGeneratedString(PHONE), service.getGeneratedString(ADDRESS));
        }
    }
}

