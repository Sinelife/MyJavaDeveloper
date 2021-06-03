package _1_java_starter.zfinal_homework;

import java.util.Random;
import java.util.Scanner;

class SeaBattle {

    private static int size;
    private static int shipNum;
    private static int compNum;
    private static int[][][] fields;

    public static void run() {
        createFields();
        battle();
    }

    private static void createFields() {
        System.out.println("Введите размер поля: ");
        size = personInput(0, 100);
        System.out.println("Введите количество кораблей: ");
        shipNum = personInput(0, size * size / 2);
        System.out.println("Введите 1 - если компьютер первый игрок, 2 - если второй: ");
        compNum = personInput(0, 2) - 1;

        fields = new int[2][size][size];
        placePersonShips(0, fields[0]);
        placePersonShips(1, fields[1]);
    }

    private static void  placePersonShips(int playerNum, int[][] field){
        int counter = shipNum;
        outputMessage(playerNum, "Расстановка вашего флота.");
        do {
            boolean isComputer = isComputer(playerNum);
            outputMessage(playerNum, "Введите номер строки: ");
            int x = inputParameter(0, size, isComputer) - 1;
            outputMessage(playerNum, "Введи номер столбца: ");
            int y = inputParameter(0, size, isComputer) - 1;
            if (playerPlaceCorrect(playerNum, x, y)) {
                fields[playerNum][x][y] = 1;
                counter--;
                if (!isComputer) {
                    outputField(field, false);
                }
            } else {
                outputMessage(playerNum, "Ячейка уже занята. Повторите ввод.");
            }
        } while (counter != 0);
    }


    private static void outputField(int[][] field, boolean isComputer) {
       for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((field[i][j] == 0) || ((field[i][j] == 1 && isComputer))) {
                    System.out.print("- ");
                } else if (field[i][j] == 1 && !isComputer) {
                    System.out.print("0 ");
                } else if (field[i][j] == 2) {
                    System.out.print("X ");
                } else if (field[i][j] == 3) {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }

    private static boolean playerPlaceCorrect(int playerNum, int x, int y) {
        return fields[playerNum][x][y] == 0;
    }

    private static void outputMessage(int currentPlayerNum, String message) {
        if(!isComputer(currentPlayerNum)) {
            System.out.println(message);
        }
    }

    private static boolean isComputer(int currentPlayerNum) {
        return compNum == currentPlayerNum;
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



    private static void battle() {
        System.out.println("\n\n\n\t\t\tНАЧАЛО БОЯ!!");
        int playerNum = 0;
        while (true) {
            boolean isComputer = isComputer(playerNum);
            outputMessage(playerNum, "\n\t\t\tХодит Человек");
            outputShipStatus(playerNum);
            outputBothFields(isComputer, playerNum);
            outputMessage(playerNum, "Введите номер строки: ");
            int x = inputParameter(0, size, isComputer) - 1;
            outputMessage(playerNum, "Введи номер столбца: ");
            int y = inputParameter(0, size, isComputer) - 1;
            if(shotWasNotInSamePlace(playerNum, x, y)) {
                shot(playerNum, x, y);
                playerNum = getNextPlayerNum(playerNum);
            } else {
                outputMessage(playerNum, "В это место уже стреляли.Повтрите выстрел: ");
            }
            if (isWin(playerNum)){
                outputWonMessage(getNextPlayerNum(playerNum));
                break;
            }
        }
    }

    private static boolean isWin(int playerNum) {
        return getShipNum(playerNum) == 0;
    }

    private static int getShipNum(int playerNum) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (fields[playerNum][i][j] == 1) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static void outputWonMessage(int playerNum) {
        System.out.println("\n\n\n");
        if (isComputer(playerNum)) {
            System.out.println("ПОБЕДИЛ КОМПЬЮТЕР!!!!!");
        } else {
            System.out.println("ПОБЕДИЛ ЧЕЛОВЕК!!!!!");
        }
    }
    
    private static int getNextPlayerNum(int playerNum) {
        if(playerNum == 0) {
            return 1;
        } else {
            return 0;
        }
        //return playerNum == 0 ? 1 : 0;
    }

    private static boolean shotWasNotInSamePlace(int playerNum, int x, int y) {
        int nextPlayerNum = getNextPlayerNum(playerNum);
        return fields[nextPlayerNum][x][y] != 2 && fields[nextPlayerNum][x][y] != 3;
    }

    private static boolean shotWasLuck(int playerNum, int x, int y) {
        int nextPlayerNum = getNextPlayerNum(playerNum);
        return fields[nextPlayerNum][x][y] == 1;
    }




    private static boolean shotWasNear(int playerNum, int x, int y) {
        int nextPlayerNum = getNextPlayerNum(playerNum);
        return ((x < size - 1 && y < size - 1 && fields[nextPlayerNum][x + 1][y + 1] == 1)
                || (y < size - 1 && fields[nextPlayerNum][x][y + 1] == 1)
                || (x > 0 && y < size - 1 && fields[nextPlayerNum][x - 1][y + 1] == 1)
                || (x < size - 1 && fields[nextPlayerNum][x + 1][y] == 1)
                || (x > 0 && fields[nextPlayerNum][x - 1][y] == 1)
                || (x < size - 1 && y > 0 && fields[nextPlayerNum][x + 1][y - 1] == 1)
                || (y > 0 && fields[nextPlayerNum][x][y - 1] == 1)
                || (x > 0 && y > 0 && fields[nextPlayerNum][x - 1][y - 1] == 1));
    }

    private static void shot(int playerNum, int x, int y) {
        int nextPlayerNum = getNextPlayerNum(playerNum);
        if (shotWasLuck(playerNum, x, y)) {
            fields[nextPlayerNum][x][y] = 2;
            outputMessageOfLuckShot(playerNum);
        } else if (shotWasNear(playerNum, x, y)) {
            fields[nextPlayerNum][x][y] = 3;
            outputMessageOfNearShot(playerNum);
        } else {
            fields[nextPlayerNum][x][y] = 3;
            outputMessageOfBadShot(playerNum);
        }
    }


    private static void outputMessageOfNearShot(int playerNum) {
        if(!isComputer(playerNum)) {
            System.out.println("Вы были близко.");
        } else {
            outputMessageOfBadShot(playerNum);
        }
    }

    private static void outputMessageOfLuckShot(int playerNum) {
        if(isComputer(playerNum)) {
            System.out.println("Компьютер уничтожил ваш корабль.");
        } else {
            System.out.println("Вы уничтожили корабль компьютера.");
        }
    }

    private static void outputMessageOfBadShot(int playerNum) {
        if(isComputer(playerNum)) {
            System.out.println("Компьютер промахнулся.");
        } else {
            System.out.println("Вы промахнулись.");
        }
    }


    private static void outputShipStatus(int playerNum) {
        if(!isComputer(playerNum)) {
            int yourShipNum = getShipNum(playerNum);
            int compShipNum = getShipNum(getNextPlayerNum(playerNum));
            System.out.println("Количество кораблей врага - " + compShipNum);
            System.out.println("Количество ваших кораблей - " + yourShipNum);

        }
    }

    private static void outputBothFields(boolean isComputer, int playerNum) {
        if(!isComputer) {
            System.out.println("Поле Человека");
            outputField(fields[playerNum], false);
            System.out.println("Поле Компьютера");
            outputField(fields[getNextPlayerNum(playerNum)], true);
        }
    }
}
