package _3_java_proffessional.homework01.ex1;

import java.util.*;

public class HashMapsMethods {

    public static List<Student> getStudentsWithSameNames(Map<Integer, Student> map) {
        List<Student> students = new ArrayList<>();
        Collection<Student> values = map.values();
        for (Student student : values) {
            if(nameHasMoreThanOneStudent(student.getName(), map.values())) {
                students.add(student);
            }
        }
        return students;
    }

    public static List<Student> getStudentsWithSameNamesEntrySet(Map<Integer, Student> map) {
        List<Student> students = new ArrayList<>();
        Set<Map.Entry<Integer, Student>> entries = map.entrySet();
        for (Map.Entry<Integer, Student> entry : entries) {
            if(nameHasMoreThanOneStudent(entry.getValue().getName(), map.values())) {
                students.add(entry.getValue());
            }
        }
        return students;
    }

    public static List<Student> getStudentsWithSameNamesValues(Map<Integer, Student> map) {
        List<Student> students = new ArrayList<>();
        for (Student value : map.values()) {
            if(nameHasMoreThanOneStudent(value.getName(), map.values())) {
                students.add(value);
            }
        }
        return students;
    }


    public static boolean nameHasMoreThanOneStudent(String name, Collection<Student> c) {
        int counter = 0;
        for (Student student : c) {
            if(student.getName().equals(name)) {
                counter++;
            }
        }
        return counter > 1;
    }
    
    
    public static void deleteSomeStudents(Map<String, Student> map) {
        Set<String> keys = map.keySet();
        int size = keys.size();
        Iterator<String> i = keys.iterator();
        while (i.hasNext()) {
            if(size % i.next().length() == 0) {
                i.remove();
            }
        }
    }

    public static void deleteSomeStudentsEntrySet(Map<String, Student> map) {
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        int size = entries.size();
        Iterator<Map.Entry<String, Student>> i = entries.iterator();
        while (i.hasNext()) {
            if(size % i.next().getKey().length() == 0) {
                i.remove();
            }
        }
    }

    public static void deleteSomeStudentsKeys(Map<String, Student> map) {
        Set<String> keys = map.keySet();
        int size = keys.size();
        Iterator<String> i = keys.iterator();
        while (i.hasNext()) {
            if(size % i.next().length() == 0) {
                i.remove();
            }
        }
    }


    public static <K, V> void output(Map<K,V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();
    }
}
