package _2_java_essential.homework08.generics.ex4;

import java.lang.reflect.Field;
import java.util.*;

class Methods {

    public static <E> String getClassName(E elem) {
        return elem.getClass().getSimpleName();
    }

    public static <E> List<String> getFieldNames(E elem) {
        List<String> list = new ArrayList<>();
        Field[] fields = elem.getClass().getDeclaredFields();
        for (Field field : fields) {
            list.add(field.getName());
        }
        return list;
    }

    public static <E> List<String> getFieldTypes(E elem) {
        List<String> list = new ArrayList<>();
        Field[] fields = elem.getClass().getDeclaredFields();
        for (Field field : fields) {
            list.add(field.getType().getSimpleName());
        }
        return list;
    }

}
