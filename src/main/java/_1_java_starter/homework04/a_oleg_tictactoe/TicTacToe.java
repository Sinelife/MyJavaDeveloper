package _1_java_starter.homework04.a_oleg_tictactoe;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    private static int size;

    //            36.Написать игру крестики-нолики(3x3).
    public static void run (){
        makeAMovie(createPlayingField());
    }
    /**      создание поля n x n */
    private static char[][] createPlayingField(){
        System.out.print("Введите размерность игрового поля: ");
        Scanner in = new Scanner (System.in);
        size = in.nextInt();

        char[][] playingField = new char[size][size];
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField[0].length; j++) {
                playingField[i][j] = '.';
            }
        }
        print2DArrChar(playingField);
        return playingField;
    }

    /**Ввод координат*/
    private static void makeAMovie(char[][] array) {
/**        стартовые значения*/
        int playersNum = 1;
        int countOfGameMovie = 0;
        char gameChip = 'X';
        int compNum = getCompPlayerNum();
        while (!ifGameIsEnd(array)) {
            boolean isComp = isComputer(compNum, playersNum);
            outputStartMessage(compNum, playersNum);
            int y = inputParameter(0, size, isComp);
            int x = inputParameter(0, size, isComp);
            if(cellIsNotFilled(array, x, y, isComp)) {
                outputCompStartMessage(isComp, playersNum);
                fillCell(array, x, y, gameChip);
                countOfGameMovie++;
                playersNum = countOfGameMovie % 2 + 1;
                gameChip = getNextPlayerGameChip(playersNum);
                print2DArrChar(array);
            }
            if (isWin(x, y, array, playersNum)){
                break;
            }
        }
    }

    private static int getCompPlayerNum(){
        Random rand = new Random();
        return rand.nextInt(3);
    }

    private static void outputCompStartMessage(boolean isComputer, int playerNum){
        if(isComputer){
            System.out.println("\n" + playerNum + "й игрок-компьютер ходит.");
        }
    }

    private static void outputStartMessage(int compNum, int playersNum){
        if(!isComputer(compNum, playersNum)) {
            System.out.print(playersNum + "й игрок. Введите координаты хода\nвначале по вертикали потом по горизонтали: \n");
        }
    }

    private static boolean isComputer(int compNum, int playersNum){
        return compNum == playersNum;
    }

    private static char getNextPlayerGameChip(int playersNum){
        if (playersNum == 1) {
            return 'X';
        }
        return 'O';
    }

    private static void fillCell(char[][] array, int x, int y, char gameChip){
        if ((array[y - 1][x - 1] == '.')) { // смещение индекса из-за начало отсчета от 1 а не 0
            array[y - 1][x - 1] = gameChip;
        }
    }

    private static boolean cellIsNotFilled(char[][] array, int x, int y, boolean isComputer){
        if ((array[y - 1][x - 1] == '.')) { // смещение индекса из-за начало отсчета от 1 а не 0
            return true;
        }
        if(!isComputer) {
            System.out.println("клетка ЗАНЯТА!");
        }
        return false;
    }


    private static boolean isWin(int x, int y, char[][] array, int playersNum){
        return isWinX(x, array, playersNum) ||
                isWinY(y, array, playersNum) ||
                diagonalFirst(array, playersNum) ||
                diagonalSecond(array, playersNum);
    }

    private static boolean lineHasOnlySimples(int countX, int countO, int playersNum){
        if ((countX == size)||(countO == size)) {
            System.out.println(3 - playersNum + "й игрок ПОБЕДИЛ!"); /** КОРЯВАЯ корректирока на № выигравшего игрока */
            return true;
        }
        return false;
    }

    /** проверки на победу*/
    private static boolean isWinX(int x, char[][] array, int playersNum) {
        int countX = countSimplesInLineX(array, 'X', x);
        int countO = countSimplesInLineX(array, 'O', x);
        return lineHasOnlySimples(countX, countO, playersNum);
    }

    private static int countSimplesInLineX(char[][] array, char c, int x){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i][x - 1] == c) {
                count++;
            }
        }
        return count;
    }

/**    ---------------- горизонтальные линии*/
    private static boolean isWinY(int y, char[][] array, int playersNum) {
        int countX = countSimplesInLineY(array, 'X', y);
        int countO = countSimplesInLineY(array, 'O', y);
        return lineHasOnlySimples(countX, countO, playersNum);
    }

    private static int countSimplesInLineY(char[][] array, char c, int y){
        int count = 0;
        for (int j = 0; j < size; j++) {
            if (array[y - 1][j] == c) {
                count++;
            }
        }
        return count;
    }


/**    ------------ диагональ 1.1 ... n.n */
    private static int countSimplesInFirstDiagonal(char[][] array, char c){
    int count = 0;
    for (int i = 0; i < size; i++) {
        if (array[i][i] == c) {
            count++;
        }
    }
    return count;
}

    private static boolean diagonalFirst(char[][] array, int playersNum) {
        int countX = countSimplesInFirstDiagonal(array, 'X');
        int countO = countSimplesInFirstDiagonal(array, 'O');
        return lineHasOnlySimples(countX, countO, playersNum);
    }
    /**    ------------ диагональ n.1 ... 1.n */
    private static int countSimplesInSecondDiagonal(char[][] array, char c){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[size - 1 - i][i] == c) {
                count++;
            }
        }
        return count;
    }


    private static boolean diagonalSecond(char[][] array, int playersNum) {
        int countX = countSimplesInSecondDiagonal(array, 'X');
        int countO = countSimplesInSecondDiagonal(array, 'O');
        return lineHasOnlySimples(countX, countO, playersNum);
    }


    /** условие оканчанеия игры */
    private static boolean ifGameIsEnd(char[][] array){
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] != '.') {
                    counter++;
                }
            }
        }
        if(counter == size * size){ /** окончание игры если осталось1 пустое поле*/
            System.out.println("НИЧЬЯ!!");
            return true;
        }
        return false;
    }

    /** вывод 2D массива CHAR*/
    private static void print2DArrChar(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print(i + 1);
            System.out.println();
        }
    }



    /**
     * Метод, проверяющий число на правильный ввод с клавиатуры
     */
    private static int inputParameter(int from, int to, boolean isComputer) {
        if(isComputer){
            return compInput(to);
        }
        return personInput(from, to);
    }

    private static int compInput(int to){
        Random rand = new Random();
        return rand.nextInt(to) + 1;
    }

    private static int personInput(int from, int to){
        Scanner sc = new Scanner(System.in);
        int i;
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число.Повторите ввод.");
                sc.next();
            }
            i = Integer.valueOf(sc.next());
            if (i > from && i <= to) {
                break;
            } else {
                System.out.println("Вы ввели число не входящее в диапазон. Повторите ввод.");
            }
        }
        return i;
    }

}
