package _3_java_proffessional.homework06.ex1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RefflectionService<E> {

    private Class clazz;

    RefflectionService(E elem) {
        this.clazz = elem.getClass();
    }

    /**
     * 1) Метод для получения имени класа (без названия пакета).
     */
    String getClassName() {
        return clazz.getSimpleName();
    }

    /**
     * 2)Метод для получения по класу мапы, где ключ это названия
     * типа поля, а значение имя поля.
     */
    Map<String, String> getFieldMap() {
        Map<String, String> map = new HashMap<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            String fieldType = field.getType().getSimpleName();
            map.put(fieldName, fieldType);
        }
        return map;
    }

    /**
     * 3)Метод для получения списка всех имен всех методов класа.
     */
    List<String> getAllMethodNames() {
        List<String> methodNames = new ArrayList<>();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }
        return methodNames;
    }

    /**
     * 4)Метод для получения списка всех имен конструкторов класа.
     */
    List<String> getAllConstructorsNames() {
        List<String> constructorNames = new ArrayList<>();
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructorNames.add(constructor.getName());
        }
        return constructorNames;
    }


    /**
     * 5)Метод для получения списка всех имен интерфейсов класа
     * (без имени пакета)
     */
    List<String> getAllInterfacesNames() {
        List<String> interfacesNames = new ArrayList<>();
        Class[] interfaces = clazz.getInterfaces();
        for (Class aInterface : interfaces) {
            interfacesNames.add(aInterface.getSimpleName());
        }
        return interfacesNames;
    }


    /**
     * 6)Метод для получения имени суперкласа(без имени пакета).
     */
    String getSuperClassName() {
        return clazz.getSuperclass().getSimpleName();
    }

    /**
     * 7)Метод для получения имени пакета, в котором находиться класс.
     */
    String getPackageName() {
        return clazz.getPackage().getName();
    }


    /**
     * 8)Метод для получения списка всех имен всех аннотаций
     * класса(без имени пакета).
     */
    List<String> getAllAnnotationsNames() {
        List<String> annotationNames = new ArrayList<>();
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            annotationNames.add(annotation.toString());
        }
        return annotationNames;
    }


    /**
     * 9)Метод для получения всех констант перечеслений
     * переданного перечисления.
     */
    List<String> getAllEnumConstantsNames() {
        List<String> constantEnumNames = new ArrayList<>();
        Object[] enumConstants = clazz.getEnumConstants();
        for (Object constant : enumConstants) {
            constantEnumNames.add(constant.toString());
        }
        return constantEnumNames;
    }


    /**
     * 10)Метод для получения имен только тех полей, которые
     * являються прмитивами.
     */
    List<String> getAllPrimitiveFieldNames() {
        List<String> fieldNames = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().isPrimitive()) {
                fieldNames.add(field.getName());
            }
        }
        return fieldNames;
    }


    /**
     * 11)Метод для получения имен только тех полей, которые
     * являються масивами.
     */
    List<String> getAllArrayFieldNames() {
        List<String> fieldNames = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().isArray()) {
                fieldNames.add(field.getName());
            }
        }
        return fieldNames;
    }



}
