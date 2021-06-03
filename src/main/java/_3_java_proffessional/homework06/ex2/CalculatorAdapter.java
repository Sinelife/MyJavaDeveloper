package _3_java_proffessional.homework06.ex2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.NoSuchElementException;

class CalculatorAdapter implements CalcMethods {

    private Calculator calculator;

    CalculatorAdapter() {
        calculator = new Calculator();
    }


    public int plus(int a, int b) {
        return (int) invokeMethod("plus", a, b);
    }

    public int minus(int a, int b) {
        return (int) invokeMethod("minus", a, b);
    }

    public int multiply(int a, int b) {
        return (int) invokeMethod("multiply", a, b);
    }

    public int arraySum(int... array) {
        return (int) invokeMethod("arraySum", (Object) array);
    }

    public int factorial(int num) {
        return (int) invokeMethod("factorial", num);
    }

    @Override
    public double getPI() {
        return invokeMethod("getPI");
    }

    public int listSum(List<Integer> list) {
        return (int) invokeMethod("listSum", list);
    }




    private <E> E invokeMethod(String methodName, Object... params) {
        try {
            Method method = getMethodByName(methodName);
            method.setAccessible(true);
            return (E) method.invoke(calculator, params);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new NoSuchElementException("Метода с именем " + methodName + " не найдено");
    }


    private Method getMethodByName(String name) {
        Method[] methods = calculator.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals(name)) {
                return method;
            }
        }
        throw new NoSuchElementException("Метода с именем " + name + " нет.");
    }
}
