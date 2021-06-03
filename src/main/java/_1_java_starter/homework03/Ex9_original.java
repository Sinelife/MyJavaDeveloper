package _1_java_starter.homework03;

class Ex9_original {
    public static void main(String[] args) {
        /** 9. Подсчитать одинаковые числа в одномерном массиве. */
        int[] arr = {-12, 1, 8, 1, 2, 8, 1, 3, 3, 4, 4, 4, -1, 17, 17, 23};
        System.out.println("\n\nExercise 9(Подсчитать одинаковые елементы в масиве)");
        int[][] elem_count = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            elem_count[i][0] = -1000;
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isNotRepeat = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == elem_count[j][0]) {
                    isNotRepeat = false;
                    break;
                }
            }
            if (isNotRepeat) {
                elem_count[counter][0] = arr[i];
                counter++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (elem_count[i][0] == arr[j]) {
                    elem_count[i][1]++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (elem_count[i][0] != -1000) {
                System.out.println("Число " + elem_count[i][0] + " встречається " + elem_count[i][1] + " раз");
            }
        }
    }
}
