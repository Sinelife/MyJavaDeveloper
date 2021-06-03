package _2_java_essential.homework08.generics.ex4;

import java.util.*;

class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(Methods.getClassName(employee));
        System.out.println("\n\n");
        List<String> fieldNames = Methods.getFieldNames(employee);
        for (String fieldName : fieldNames) {
            System.out.println(fieldName);
        }
        System.out.println("\n\n");
        List<String> fieldTypes = Methods.getFieldTypes(employee);
        for (String fieldType : fieldTypes) {
            System.out.println(fieldType);
        }
    }
}
