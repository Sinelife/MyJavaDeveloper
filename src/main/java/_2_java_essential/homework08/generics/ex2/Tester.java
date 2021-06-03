package _2_java_essential.homework08.generics.ex2;

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

        System.out.println("\n\n\n\n");
        System.out.println(EmployeeMethods.toString(EmployeeMethods.getRand2DArrayOfEmployees(employees)));
    }
}
