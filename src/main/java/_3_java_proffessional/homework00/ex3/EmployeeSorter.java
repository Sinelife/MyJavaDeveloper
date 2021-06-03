package _3_java_proffessional.homework00.ex3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static _3_java_proffessional.homework00.ex3.StringUtils.firstWordIsLess;

public class EmployeeSorter {

    private EmployeesComparators comparatorName;

    EmployeeSorter(EmployeesComparators comparatorName) {
        this.comparatorName = comparatorName;
    }

    private Comparator getComparator() {
        if (comparatorName.equals(EmployeesComparators.NAME_COMPARATOR)) {
            return new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if (!firstWordIsLess(o1.getName(), o2.getName())) {
                        return 1;
                    }
                    return -1;
                }
            };
        } else if (comparatorName.equals(EmployeesComparators.NAME_REVERSE_COMPARATOR)) {
            return new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if (firstWordIsLess(o1.getName(), o2.getName())) {
                        return 1;
                    }
                    return -1;
                }
            };
        } else if (comparatorName.equals(EmployeesComparators.SALARY_COMPARATOR)) {
            return new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return (int)(o1.getSalary() - o2.getSalary());
                }
            };
        } else if (comparatorName.equals(EmployeesComparators.SALARY_REVERSE_COMPARATOR)) {
            return new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return (int)(o2.getSalary() - o1.getSalary());
                }
            };
        }
        throw new IllegalArgumentException("No such Comparator");
    }

    public void sort(List<Employee> employees) {
        Collections.sort(employees, getComparator());
    }

    public enum EmployeesComparators {
        NAME_COMPARATOR,
        NAME_REVERSE_COMPARATOR,
        SALARY_COMPARATOR,
        SALARY_REVERSE_COMPARATOR,
    }
}
