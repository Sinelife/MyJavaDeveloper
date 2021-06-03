package _2_java_essential.homework07.ex2;

import java.util.*;

class Tester {
    public static void main(String[] args) {
        Student student = new Student(new MainInfo("","",""),20,67.6);
        System.out.println(Methods.getClassName(student));
        System.out.println("\n\n");
        List<String> fieldNames = Methods.getFieldNames(student);
        for (String fieldName : fieldNames) {
            System.out.println(fieldName);
        }
        System.out.println("\n\n");
        List<String> fieldTypes = Methods.getFieldTypes(student);
        for (String fieldType : fieldTypes) {
            System.out.println(fieldType);
        }
    }
}
