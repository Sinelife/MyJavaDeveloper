package _1_java_starter.homework03;

import java.util.Arrays;

class Ex9 {

    public static void main(String[] args) {
        System.out.println("\n\nExercise 9(Подсчитать одинаковые елементы в масиве)");
        int[] array = {-12, 1, 8, 1, 2, 8, 1, 3, 3, 4, 4, 4, -1, 17, 17, 23};
        System.out.println(Arrays.toString(array));
        /**Находим уникальные числа в масиве и записываем в масив уникальных
         * чисел*/
        int[] uniqueElements = new int[array.length];
        uniqueElements[0] = array[0];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= counter; j++) {
                if(array[i] == uniqueElements[j]){
                    break;
                }
                if(array[i] != uniqueElements[j] && j == counter){
                    counter++;
                    uniqueElements[counter] = array[i];
                }
            }
        }
        counter++;//counter увеличиваем чтоб counter отображал размер маисива
        //а не индекс последнего элемента

        /**Подсчитываем количество всех уникальных чисел найденых ранее*/
        int[] numbers = new int[counter];
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < array.length; j++) {
                if(uniqueElements[i] == array[j]){
                    numbers[i]++;
                }
            }
        }

        /**Выводим результат*/
        for (int i = 0; i < counter; i++) {
            System.out.println("Число " + uniqueElements[i] + " встречаеться " + numbers[i] + " раз");
        }
    }
}
