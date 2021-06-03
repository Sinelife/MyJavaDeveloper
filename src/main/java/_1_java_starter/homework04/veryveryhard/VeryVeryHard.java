package _1_java_starter.homework04.veryveryhard;

import java.util.Random;
import java.util.Scanner;

class VeryVeryHard {
    public static int size;

    static void run() {
        chooseSize();
        char[][] field = new char[size][size];
        initializeStartField(field);
        battle(field);
    }


    private static void chooseSize(){
        System.out.println("Введите размер поля игры");
        size = inputParameter(2, 10000);
    }


    private static boolean chooseRole(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кто будет вторым игроком(0 - компьютер, 1 - человек).");
        int role = sc.nextInt();
        return role == 0;
    }


    private static void battle(char[][] field){
        boolean isComputer = chooseRole();
        while(true){
            outputField(field);
            playerOneShot(field, 'X', true);
            if(isWon(field,'X')){
                outputField(field);
                System.out.println("Первый игрок победил");
                break;
            }
            outputField(field);
            playerTwoShot(field, isComputer);
            if(isWon(field,'0')){
                if(!isComputer){
                    outputField(field);
                    System.out.println("Второй игрок победил");
                    break;
                }
                outputField(field);
                System.out.println("Компьютер победил");
                break;
            }
        }
    }

    private static void initializeStartField(char[][] field){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = '-';
            }
        }
    }

    private static void playerOneShot(char[][] field, char c, boolean isFirst){
        if(isFirst) {
            System.out.println("\n\nХОД ПЕРВОГО ИГРОКА");
        }
        while(true) {
            System.out.println("Введите координату по х: ");
            int x = inputParameter(1, size) - 1;
            System.out.println("Введите координату по у: ");
            int y = inputParameter(1, size) - 1;
            if(checkIfNotRepeat(field, x, y)) {
                field[y][x] = c;
                break;
            }
            else{
                System.out.println("Эта ячейка уже занята. Выберите другую.");
            }
        }
    }

    private static void playerTwoShot(char[][] field, boolean isComputer){
        if(isComputer){
            System.out.println("\n\nХОД КОМПЬЮТЕРА");
            computerShot(field);
        }
        else {
            System.out.println("\n\nХОД ВТОРОГО ИГРОКА");
            playerOneShot(field, '0', false);
        }
    }


    private static boolean isWon(char[][] field, char c){
        return isHorizantalWon(field, c) || isVerticalWon(field, c) || isDiagonalWon(field, c);
    }

    private static boolean isHorizantalWon(char[][] field, char c) {
        for (int i = 0; i < size; i++) {
            int counter = 0;
            for (int j = 0; j < size; j++) {
                if(field[i][j] == c){
                    counter++;
                }
            }
            if(counter == size){
                System.out.println("Horizantal Won");
                return true;
            }
        }
        return false;
    }

    private static boolean isVerticalWon(char[][] field, char c) {
        for (int i = 0; i < size; i++) {
            int counter = 0;
            for (int j = 0; j < size; j++) {
                if(field[j][i] == c){
                    counter++;
                }
            }
            if(counter == size){
                System.out.println("Vertical Won");
                return true;
            }
        }
        return false;
    }

    private static boolean isDiagonalWon(char[][] field, char c) {
        int counterMainDiagonal = 0;
        int counterSecondDiagonal = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(field[j][i] == c && i == j){
                    counterMainDiagonal++;
                }
                if(field[j][i] == c && j == size - 1 - i){
                    counterSecondDiagonal++;
                }
            }
        }
        if(counterMainDiagonal == size || counterSecondDiagonal == size){
            System.out.println("Diagonal won");
            return true;
        }
        return false;
    }

    private static void computerShot(char[][] field){
        while(true) {
            Random rand = new Random();
            int x = rand.nextInt(size);
            int y = rand.nextInt(size);
            if(checkIfNotRepeat(field, x, y)) {
                field[y][x] = '0';
                break;
            }
        }
    }


    private static void outputField(char[][] field){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static boolean checkIfNotRepeat(char[][] field, int x, int y){
        return field[y][x] == '-';
    }

    private static int inputParameter(int from, int to) {
        Scanner sc = new Scanner(System.in);
        int i;
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число.Повторите ввод.");
                sc.next();
            }
            i = Integer.valueOf(sc.next());
            if (i >= from && i <= to) {
                break;
            } else {
                System.out.println("Вы ввели число не входящее в диапазон. Повторите ввод.");
            }
        }
        return i;
    }
}

