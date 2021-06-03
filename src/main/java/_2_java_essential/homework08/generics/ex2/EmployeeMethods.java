package _2_java_essential.homework08.generics.ex2;

import java.lang.reflect.Array;
import java.util.Random;

class EmployeeMethods {

    /**
     * Метод, который принимает масив Employee и разбивает их на 3 групы рандомно и возвращает двухмерный масив груп работников.
     */
    public static <E> E[][] getRand2DArrayOfEmployees(E[] array){
        Random rand = new Random();
        E[][] arrayOfGroups = (E[][]) Array.newInstance(array[0].getClass(), 3, array.length);
        for (E elem : array) {
            int groupNum = rand.nextInt(3);
            int counter = 0;
            while (arrayOfGroups[groupNum][counter] != null) {
                counter++;
            }
            arrayOfGroups[groupNum][counter] = elem;
        }
        return arrayOfGroups;
    }

    public static <E> String toString(E[][] array){
        String res = "";
        int groupCounter = 1;
        for (E[] group : array) {
            res += "GROUP " + groupCounter + "\n" + toString(group) + "\n";
            groupCounter++;
        }
        return res;
    }

    public static <E> String toString(E[] array) {
        String result = "";
        int counter = 1;
        for (E elem : array) {
            if (elem != null) {
                result += counter + ")" + elem + "\n";
                counter++;
            }
        }
        return result;
    }

}
