package _2_java_essential.homework07.ex2;

import java.lang.reflect.Field;
import java.util.*;

class Methods {

    public static String getClassName(Object o) {
        return o.getClass().getSimpleName();
    }

    public static List<String> getFieldNames(Object o) {
        List<String> list = new ArrayList<>();
        Field[] fields = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            list.add(field.getName());
        }
        return list;
    }

    public static List<String> getFieldTypes(Object o) {
        List<String> list = new ArrayList<>();
        Field[] fields = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            list.add(field.getType().getSimpleName());
        }
        return list;
    }



}
