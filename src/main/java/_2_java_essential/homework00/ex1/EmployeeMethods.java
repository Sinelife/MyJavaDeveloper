package _2_java_essential.homework00.ex1;

class EmployeeMethods {

    /**
     * Метод, который возвращает работника с найбольшей зарплатой
     */
    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee e = employees[0];
        for (Employee employee : employees) {
            if (employee.salary > e.salary) {
                e = employee;
            }
        }
        return e;
    }

    /**
     * Метод, который возвращает всех работников, зарплата которых находиться в заданом интервале
     */
    public static Employee[] getEmployeesInSalaryInterval(Employee[] employees, int from, int to) {
        Employee[] employeesInInterval = new Employee[employees.length];
        int counter = 0;
        for (Employee employee : employees) {
            if (employee.salary >= from && employee.salary <= to) {
                employeesInInterval[counter] = employee;
                counter++;
            }
        }
        return employeesInInterval;
    }

    /**
     * Метод, который возвращает суму зарплат всех работников
     */
    public static int sumSalaryOfAllEmployees(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.salary;
        }
        return sum;
    }

    /**
     * Метод, который возвращает всех работников по заданому имени
     */
    public static Employee[] getEmployeesByName(Employee[] employees, String name) {
        Employee[] employeesByName = new Employee[employees.length];
        int counter = 0;
        for (Employee employee : employees) {
            if (employee.firstName.equals(name)) {
                employeesByName[counter] = employee;
                counter++;
            }
        }
        return employeesByName;
    }




    /**
     * Метод, который выводит информацыю про всех работников заданого масива
     */
    public static String toStringArray(Employee[] employees) {
        String result = "";
        int counter = 1;
        for (Employee employee : employees) {
            if (employee != null) {
                result += counter + ")" + employee + "\n";
                counter++;
            }
        }
        return result;
    }
}
