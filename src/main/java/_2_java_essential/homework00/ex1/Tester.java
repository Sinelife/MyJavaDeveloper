package _2_java_essential.homework00.ex1;
import static _2_java_essential.homework00.ex1.EmployeeMethods.*;

class Tester {

    private static Employee[] fillEmployeesArray(Employee[] employees) {
        employees[0] = new Employee(1, "Иван", "Иванов", 25, 4000, false);
        employees[1] = new Employee(2, "Олександр", "Демьянчук", 22, 6000, false);
        employees[2] = new Employee(3, "Иван", "Петров", 35, 17000, true);
        employees[3] = new Employee(4, "Виктория", "Шишкина", 315, 24000, true);
        employees[4] = new Employee(5, "Марк", "Громов", 25, 4000, false);
        employees[5] = new Employee(6, "Юлия", "Михайленко", 27, 14000, false);
        employees[6] = new Employee(7, "Катерина", "Онофрийчук", 20, 5500, false);
        employees[7] = new Employee(8, "Николай", "Андриевич", 29, 21000, true);
        employees[8] = new Employee(9, "Виктория", "Климова", 26, 13000, true);
        employees[9] = new Employee(10, "Григорий", "Гордиенко", 45, 40000, false);
        return employees;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        fillEmployeesArray(employees);

        /**EX1*/
        System.out.println("EX1");
        System.out.println(toStringArray(employees));


        /**EX2*/
        System.out.println("\n\n\n\nEX2");
        Employee richEmployee = getEmployeeWithMaxSalary(employees);
        System.out.println("Самый багатый работник: " + richEmployee);
        System.out.println("\n");


        /**EX3*/
        System.out.println("\n\n\n\nEX3");
        System.out.println("Сума зарплат всех работников: " + sumSalaryOfAllEmployees(employees));
        System.out.println("\n");


        /**EX4*/
        System.out.println("\n\n\n\nEX4");
        int from = 10000;
        int to = 20000;
        Employee[] employeesInInterval = getEmployeesInSalaryInterval(employees, from, to);
        System.out.println("Все работники, чья зарплата находиться в интервале от " + from + "грн до " + to + "грн");
        System.out.println(toStringArray(employeesInInterval));



        /**EX5*/
        System.out.println("\n\n\n\nEX5");
        String name = "Иван";
        System.out.println("Все работники, чье имя " + name);
        Employee[] employeesByName = getEmployeesByName(employees, name);
        System.out.println(toStringArray(employeesByName));
    }
}
