package _2_java_essential.homework08.generics.ex6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GenericSingleton<E> {
    private E object;

    public E getElement(Class<E> elemClass) {
        if (object != null) {
//            System.out.println("not null");
            return (E) object;
        }
        try {
//            System.out.println("null");
            Constructor<E> constructor = elemClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            object = constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return (E) object;
    }

    @Override
    public String toString() {
        return (String.valueOf(object));
    }
}

class MySomething<E> {
    protected E value;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + value + "} - " + super.toString();
    }
}

class MyInteger extends MySomething {
    private MyInteger(){
        this.value = Integer.MAX_VALUE;
    }
}

class MyString extends MySomething {
    private MyString(){
        this.value = "DEFAULT";
    }
}

class MyDouble extends MySomething {
    private MyDouble(){
        this.value = Double.MAX_VALUE;
    }
}
