package _3_java_proffessional.homework00.ex3;

import _3_java_proffessional.homework00.ex1.MyArrayList;

import java.util.List;

public class Tester {
    public static void main(String[] args) {

        StudentSorter sorter = new StudentSorter(StudentSorter.StudentComparators.SURNAME_REVERSE_COMPARATOR);
        List<Student> students = new MyArrayList<>();

        students.add(new Student("Yaroslav", "Serzhan", 22, 77.7));
        students.add(new Student("Alexander", "Yaroshepta", 21, 99.5));
        students.add(new Student("Nikolay", "Belov", 21, 83.0));
        students.add(new Student("Alexander", "Hristosov", 20, 89.2));

        sorter.sort(students);
//        Collections.sort(students);
        System.out.println(students.toString() + "\n\n\n\n");



        EmployeeSorter employeeSorter = new EmployeeSorter(EmployeeSorter.EmployeesComparators.NAME_REVERSE_COMPARATOR);
        List<Employee> employees = new MyArrayList<>();
        employees.add(new Employee("Alexander", "Yaroshepta", "Kirilovich", 81000));
        employees.add(new Employee("Yaroslav", "Serzhan", "Olegovich", 78000));
        employees.add(new Employee("Alexander", "Hristosov", "Fedorovich", 50000));
        employees.add(new Employee("Nikolay", "Belov", "Maximovich", 67000));

        employeeSorter.sort(employees);
//        Collections.sort(employees);
        System.out.println(employees.toString());
    }
}
