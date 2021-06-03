package _2_java_essential.homework01.ex1;

import java.util.Arrays;

class Tester {

    private static Employee[] fillEmployeesArray(Employee[] employees) {
        employees[0] = new Employee(1, "Иван", "Иванов", 25, 4000, false, new Contact("123-45-56", "random@gmail.com"));
        employees[1] = new Employee(2, "Олександр", "Демьянчук", 22, 6000, false, new Contact("344-32-12", "qwerty@gmel.com"));
        employees[2] = new Employee(3, "Иван", "Петров", 35, 17000, true, new Contact("456-12-17", "ipetrov@yandex.ru"));
        employees[3] = new Employee(4, "Виктория", "Шишкина", 315, 24000, true, new Contact("956-99-18", "yyyyuiiu@yandex.ua"));
        employees[4] = new Employee(5, "Марк", "Громов", 25, 4000, false, new Contact("777-22-57", "gromovqwe@yandex.ru"));
        employees[5] = new Employee(6, "Юлия", "Михайленко", 27, 14000, false, new Contact("488-77-07", "yumih@yandex.ru"));
        employees[6] = new Employee(7, "Катерина", "Онофрийчук", 20, 5500, false, new Contact("566-18-37", "katonof@yandex.ua"));
        employees[7] = new Employee(8, "Николай", "Андриевич", 29, 21000, true, new Contact("336-13-39", "gggg@gmail.com"));
        employees[8] = new Employee(9, "Виктория", "Климова", 25, 13000, true, new Contact("556-52-57", "klimova@meta.ua"));
        employees[9] = new Employee(10, "Григорий", "Гордиенко", 45, 40000, false, new Contact("666-62-19", "gordienko@meta.ua"));
        return employees;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        fillEmployeesArray(employees);

        /**EX0*/
        System.out.println("EX0");
        System.out.println(EmployeeMethods.toString(employees));


        /**EX1*/
        System.out.println("\n\n\n\nEX1");
        Employee richEmployee = EmployeeMethods.getEmployeeWithMaxSalary(employees);
        System.out.println("Самый багатый работник: " + richEmployee);
        System.out.println("\n");


        /**EX2*/
        System.out.println("\n\n\n\nEX2");
        System.out.println("Сума зарплат всех работников: " + EmployeeMethods.sumSalaryOfAllEmployees(employees));
        System.out.println("\n");


        /**EX3*/
        System.out.println("\n\n\n\nEX3");
        int from = 10000;
        int to = 20000;
        Employee[] employeesInInterval = EmployeeMethods.getEmployeesInSalaryInterval(employees, from, to);
        System.out.println("Все работники, чья зарплата находиться в интервале от " + from + "грн до " + to + "грн");
        System.out.println(EmployeeMethods.toString(employeesInInterval));



        /**EX4*/
        System.out.println("\n\n\n\nEX4");
        String name = "Иван";
        System.out.println("Все работники, чье имя " + name);
        Employee[] employeesByName = EmployeeMethods.getEmployeesByName(employees, name);
        System.out.println(EmployeeMethods.toString(employeesByName));


        /**EX5*/
        System.out.println("\n\n\n\nEX5");
        System.out.print("Сумарная зарплата всех женатых сотрудников старше 25 лет: ");
        System.out.println(EmployeeMethods.getSumSalaryOfMarried25YearOldEmployee(employees));


        /**EX6*/
        System.out.println("\n\n\n\nEX6");
        System.out.print("Сумарная зарплата всех не женатых сотрудников с именем больше 4 букв: ");
        System.out.println(EmployeeMethods.getSumSalaryOfNotMarrieedEmployeeWithMoreThan4LettersInName(employees));


        /**EX7*/
        System.out.println("\n\n\n\nEX7");
        System.out.println("Before sort by name\n" + EmployeeMethods.toString(employees));
        EmployeeMethods.sortEmployeeByName(employees);
        System.out.println("After sort by name\n" + EmployeeMethods.toString(employees));


        /**EX8*/
        System.out.println("\n\n\n\nEX8");
        System.out.println("Before sort by salary\n" + EmployeeMethods.toString(employees));
        EmployeeMethods.sortEmployeeBySalary(employees);
        System.out.println("After sort by salary\n" + EmployeeMethods.toString(employees));


        /**EX10*/
        System.out.println("\n\n\n\nEX10");
        EmployeeMethods.changeEmployeeNameAndSalary(employees);
        System.out.println(EmployeeMethods.toString(employees));


        /**EX11*/
        System.out.println("\n\n\n\nEX11");
        System.out.println("Before sort by email\n" + EmployeeMethods.toString(employees));
        EmployeeMethods.sortEmployeeByEmail(employees);
        System.out.println("After sort by email\n" + EmployeeMethods.toString(employees));



        /**EX12*/
        System.out.println("\n\n\n\nEX12");
        System.out.println(EmployeeMethods.toString(EmployeeMethods.getEmployeeWithNumbers369InPhone(employees)));


        /**EX13*/
        System.out.println("\n\n\n\nEX13");
        EmployeeMethods.ex13(employees);
        System.out.println(EmployeeMethods.toString(employees));


        /**EX14*/
        System.out.println("\n\n\n\nEX14");
        System.out.println(EmployeeMethods.toString(EmployeeMethods.getRand2DArrayOfEmployees(employees)));


        /**EX15*/
        System.out.println("\n\n\n\nEX15");
        System.out.println(Arrays.toString(EmployeeMethods.ex15(employees)));

    }
}
