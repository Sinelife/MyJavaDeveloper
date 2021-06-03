package _2_java_essential.homework01.ex1;

import java.util.Random;

class EmployeeMethods {


    /**
     * 1) Метод, который возвращает работника с найбольшей зарплатой
     */
    static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee e = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > e.getSalary()) {
                return employee;
            }
        }
        return null;
    }

    /**
     * 2) Метод, который возвращает всех работников, зарплата которых находиться в заданом интервале
     */
    public static Employee[] getEmployeesInSalaryInterval(Employee[] employees, int from, int to) {
        Employee[] employeesInInterval = new Employee[employees.length];
        int counter = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() >= from && employee.getSalary() <= to) {
                employeesInInterval[counter] = employee;
                counter++;
            }
        }
        return employeesInInterval;
    }

    /**
     * 3) Метод, который возвращает суму зарплат всех работников
     */
    public static int sumSalaryOfAllEmployees(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    /**
     * 4) Метод, который возвращает всех работников по заданому имени
     */
    public static Employee[] getEmployeesByName(Employee[] employees, String name) {
        Employee[] employeesByName = new Employee[employees.length];
        int counter = 0;
        for (Employee employee : employees) {
            if (employee.getFirstName().equals(name)) {
                employeesByName[counter] = employee;
                counter++;
            }
        }
        return employeesByName;
    }


    /**
     * 5) Метод, который находит зарплату всех женатых сотрудников, которым больше 25 лет
     */
    public static int getSumSalaryOfMarried25YearOldEmployee(Employee[] employees){
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getAge() > 25 && employee.isMarried()) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }


    /**
     * 6) Метод, который находит сумарную зарплату всех неженатых сотрудников, имя которых длинее 4 букв
     */
    public static int getSumSalaryOfNotMarrieedEmployeeWithMoreThan4LettersInName(Employee[] employees){
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getFirstName().length() > 4 && !employee.isMarried()) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }


    /**
     * 7) Метод, который сортирует сотрудников в алфавитном порядке по имени
     */
    private static String getBiggerWord(String word1, String word2){
        if(word1.length() >= word2.length()){
            return word1;
        }
        else {
            return word2;
        }
    }

    private static boolean firstLess(String word1, String word2){
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        String biggerWord = getBiggerWord(word1, word2);
        for (int i = 0; i < biggerWord.length(); i++) {
            if(chars1[i] < chars2[i]){
                return true;
            }
            else if(chars1[i] > chars2[i]){
                return false;
            }
        }
        return false;
    }

    public static void sortEmployeeByName(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            for (int j = i; j < employees.length; j++) {
                if(firstLess(employees[j].getFirstName(), employees[i].getFirstName())){
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }



    /**
     * 8) Метод, который сортирует сотрудников по размеру зарплаты(от большего к меньшему)
     */
    public static void sortEmployeeBySalary(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            for (int j = i; j < employees.length; j++) {
                if(employees[i].getSalary() < employees[j].getSalary()){
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }


    /**
     * 9) Метод, который выводит информацыю про всех работников из заданого масива
     */
    public static String toString(Employee[] employees) {
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


    /**
     * 10) Метод, который переименовывает всех сотрудников на их имя написаное наоборот а также умножает зарплату на возраст
     *     сотрудника перед ним(если это первый то зарплата умножаеться на возраст последенего)
     */
    private static String getNameTurned(String word){
        word = word.toLowerCase();
        char[] chars = word.toCharArray();
        String res = "";
        String start = "";
        for (int i = 0; i < chars.length; i++) {
            if(i == chars.length - 1){
                start += chars[i];
                start = start.toUpperCase();
                res = start + res;
            }
            else {
                res = chars[i] + res;
            }
        }
        return res;
    }

    public static void changeEmployeeNameAndSalary(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            if(i != employees.length - 1) {
                employees[i].setSalary(employees[i].getSalary() * employees[i + 1].getAge());
            } else{
                employees[i].setSalary(employees[i].getSalary() * employees[0].getAge());
            }
            employees[i].setFirstName(getNameTurned(employees[i].getFirstName()));
        }
    }


    /**
     * 11) Метод, для сортировки всех сотрудников по емейлу в алфавитном порядке
     */
    public static void sortEmployeeByEmail(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            for (int j = i; j < employees.length; j++) {
                if(firstLess(employees[j].getContact().getEmail(), employees[i].getContact().getEmail())){
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }



    /**
     * 12) Метод, который находит найти всех сотрудников, у которых в номере телефона есть цыфры 3,6 и 9
     */
    public static Employee[] getEmployeeWithNumbers369InPhone(Employee[] employees){
        Employee[] newEmployees = new Employee[employees.length];
        int counter = 0;
        for (Employee employee : employees) {
            if (employee.getContact().getPhone().contains("3")
                    && employee.getContact().getPhone().contains("6")
                    && employee.getContact().getPhone().contains("9")) {
                newEmployees[counter] = employee;
                counter++;
            }
        }
        return newEmployees;
    }


    /**
     * 13) Метод, который заменит в емейле всех сотрудников слово "qwe"-> "asd", а в номере всех женатых уберет первую и последнюю цыфру
     */
    public static void ex13(Employee[] employees){
        for (Employee employee : employees) {
            String newEmail = employee.getContact().getEmail().replaceAll("qwe", "asd");
            employee.getContact().setEmail(newEmail);
            String newPhone = employee.getContact().getPhone();
            newPhone = newPhone.substring(1, newPhone.length() - 1);
            if (employee.isMarried()) {
                employee.getContact().setPhone(newPhone);
            }
        }
    }


    /**
     * 14) Метод, который принимает масив Employee и разбивает их на 3 групы рандомно и возвращает двухмерный масив груп работников.
     */
    public static Employee[][] getRand2DArrayOfEmployees(Employee[] employees){
        Random rand = new Random();
        Employee[][] array = new Employee[3][employees.length];
        for (Employee employee : employees) {
            int groupNum = rand.nextInt(3);
            int counter = 0;
            while (array[groupNum][counter] != null) {
                counter++;
            }
            array[groupNum][counter] = employee;
        }
        return array;
    }

    public static String toString(Employee[][] array){
        String res = "";
        int groupCounter = 1;
        for (Employee[] group : array) {
            res += "GROUP " + groupCounter + "\n" + toString(group) + "\n";
            groupCounter++;
        }
        return res;
    }


    /**
     * 15) Метод, который подсчитывает для каждого сотрудника количество схожих уникальных букв в его имени и в имени его двух соседей в масиве.
     */
    public static int getSimpleSymbolNum(String word1, String word2){
        int counter = 0;
        char[] chars = word1.toCharArray();
        for (char symbol : chars) {
            if (word2.contains(String.valueOf(symbol))) {
                counter++;
                word2 = word2.replaceAll(String.valueOf(symbol), "");
            }
        }
        return counter;
    }

    public static int[] ex15(Employee[] employees){
        int[] counts = new int[employees.length];
        for (int i = 0; i < employees.length; i++) {
            if(i == 0){
                counts[i] += getSimpleSymbolNum(employees[i].getFirstName(), employees[i + 1].getFirstName());
            } else if (i == employees.length - 1){
                counts[i] += getSimpleSymbolNum(employees[i].getFirstName(), employees[i - 1].getFirstName());
            } else {
                counts[i] += getSimpleSymbolNum(employees[i].getFirstName(), employees[i + 1].getFirstName());
                counts[i] += getSimpleSymbolNum(employees[i].getFirstName(), employees[i - 1].getFirstName());
            }
        }
        return counts;
    }
}
