package _3_java_proffessional.homework06.ex3;

import _3_java_proffessional.homework06.ex3.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

class AccessAllInClassService<E> {

    private E elem;

    /**
     * Конструктор, который принмает клас и создает обьект этого
     * класа через пустой конструктор
     */
    AccessAllInClassService(Class<E> clazz) {
        this.elem = newInstance(clazz);
    }

    /**
     * Конструктор, который принмает обьект и присваивает полю
     * elem(поле обрабатываемого обьекта) переданый обьект
     */
    AccessAllInClassService(E elem) {
        this.elem = elem;
    }


    /**
     * Метод, для получения обраьатываемого обьекта
     */
    E getElem() {
        return elem;
    }

    /**
     * Метод, который проверяет не заблокирован ли клас и имеет
     * ли он анотацию
     */
    private boolean classIsValid(Class<E> clazz) {
        return clazz.isAnnotationPresent(MyClass.class) &&
                !clazz.isAnnotationPresent(BlockedClass.class);
    }


    /**
     * Метод, который проверяет ли поле аннотацию MyField
     */
    private boolean fieldIsValid(Field field) {
        return field.isAnnotationPresent(MyField.class);
    }

    /**
     * Метод, который проверяет есть ли в классе аннотация
     */
    private boolean classHasAnnotation(Class annotation) {
        return elem.getClass().isAnnotationPresent(annotation);
    }


    /**
     * Метод, который получает массив классов всех полей нашего
     * обьекта
     */
    private Class[] getFieldsClasses() {
        Field[] fields = elem.getClass().getDeclaredFields();
        Class[] classes = new Class[fields.length];
        for (int i = 0; i < fields.length; i++) {
            classes[i] = fields[i].getType();
        }
        return classes;
    }


    /**
     * Метод, который получает конструткор со всеми параметрами
     */
    private Constructor getConstructorWithAllArgs() {
        Constructor constructor = null;
        try {
            constructor = elem.getClass().getDeclaredConstructor(getFieldsClasses());
            constructor.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return constructor;
    }

    /**
     * Метод, который получает конструткор без параметров
     */
    private Constructor getEmptyConstructor(Class<E> clazz) {
        if (!classIsValid(clazz)) {
            throw new NoSuchElementException("Клас заблокирован или не имеет аннотации MyClass.");
        }
        Constructor constructor = null;
        try {
            constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return constructor;
    }

    /**
     * Метод, для создания обьекта через конструктор со всеми
     * аргументами
     */
    void newInstance(Object... args) {
        Constructor constructor = getConstructorWithAllArgs();
        E elem = null;
        try {
            elem = (E) constructor.newInstance(args);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        this.elem = elem;
    }


    /**
     * Метод, для создания обьекта через конструктор без аргументов
     */
    private E newInstance(Class<E> clazz) {
        classIsValid(clazz);
        Constructor constructor = getEmptyConstructor(clazz);
        E elem = null;
        try {
            elem = (E) constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        this.elem = elem;
        return elem;
    }


    /**
     * Метод, для получения значения поля обьекта
     */
    <T> T getFieldValue(String fieldName) {
        Field field;
        try {
            field = Student.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return (T) field.get(elem);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException();
    }


    /**
     * Метод, для изменения значения поля оюьекта
     */
    <T> void setFieldValue(String fieldName, T value) {
        Field field;
        try {
            field = elem.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(elem, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    /**
     * Метод, для получения названия класса по аннотации
     */
    private String getClassNameByAnnotation() {
        return elem.getClass().getAnnotation(MyClass.class).name();
    }

    /**
     * Метод, для получения названия поля класса по аннотации
     */
    private String getFieldNameByAnnotation(Field field) {
        return field.getAnnotation(MyField.class).name();
    }


    /**
     * Метод, для получения названия поля класса и значения этого
     * поля
     */
    private String getFieldNameAndValue(Field field) {
        String fieldName = getFieldNameByAnnotation(field);
        String value = getFieldValue(field);
        return fieldName + " = " + value;
    }

    /**
     * Метод, для получения значения поля обьекта(в том числе и enum)
     */
    private String getFieldValue(Field field) {
        field.setAccessible(true);
        if (field.getType().isEnum()) {
            return getEnumValue(field);
        } else {
            E elem = getFieldValue(field.getName());
            return String.valueOf(elem);
        }
    }

    /**
     * Метод, для получения enum поля
     */
    private String getEnumValue(Field field) {
        Method method;
        try {
            method = field.getType().getMethod("get");
            method.setAccessible(true);
            return (String) method.invoke(field.get(elem));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        throw new NoSuchElementException("В перечислении " + field.getName() + " нет метода get()");
    }


    /**
     * Метод, для вывода обрабатываемого обьекта
     */
    private String outputObject() {
        StringBuilder res = new StringBuilder(getClassNameByAnnotation()).append(" (");
        Field[] fields = elem.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            while (!fieldIsValid(fields[i])) {
                i++;
            }
            res.append(getFieldNameAndValue(fields[i]));
            if (i < fields.length - 1) {
                res.append(", ");
            } else {
                res.append(")");
            }
        }
        return res.toString();
    }


    /**
     * Метод, для вывода обрабатываемого обьекта если он не
     * заблокирован аннотациями
     */
    @Override
    public String toString() {
        if (!classHasAnnotation(BlockedToString.class)) {
            return outputObject();
        }
        throw new IllegalStateException("Метод toString() заблокирован.");
    }


    /**
     * Метод, для вызова приватного метода
     */
    <E> E invokeMethod(String methodName, Object... params) {
        try {
            Method method = getMethodByName(methodName);
            if (!methodIsValid(method)) {
                throw new IllegalArgumentException("Метод " + methodName + " не найден.");
            }
            method.setAccessible(true);
            return (E) method.invoke(elem, params);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new NoSuchElementException("Метода с именем " + methodName + " не найдено");
    }

    /**
     * Метод, для получения метода по имени
     */
    private Method getMethodByName(String name) {
        Method[] methods = elem.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals(name)) {
                return method;
            }
        }
        throw new NoSuchElementException("Метода с именем " + name + " нет.");
    }

    /**
     * Метод, который проверяет стоит ли над методом аннотация
     * MyMethod
     */
    private boolean methodIsValid(Method method) {
        return method.isAnnotationPresent(MyMethod.class);
    }
}
