package _3_java_proffessional.z_first_extrahomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Player {
    private static final int MAX_SHIP_SIZE = 6;
    private static int shipNum;
    private static int size;


    private Board board;
    private List<Ship> ships;
    private boolean isComputer;

    Player(boolean isComputer) {
        this.board = new Board(size, size);
        this.ships = new ArrayList<>();
        this.isComputer = isComputer;
    }

    Board getBoard() {
        return board;
    }

    boolean isComputer() {
        return isComputer;
    }

    List<Ship> getShips() {
        return ships;
    }

    int getAliveShipNum() {
        int num = 0;
        for (Ship ship : ships) {
            if (ship.isAlive()) {
                num++;
            }
        }
        return num;
    }

    /**
     * Метод, для ввода размера поля
     */
    private static void inputBoardSize() {
        System.out.println(Constants.INPUT_BOARD_SIZE);
        size = personInput(5, 10);
    }

    /**
     * Метод, для ввода количества кораблей
     */
    private static void inputShipNum() {
        System.out.println(Constants.INPUT_SHIP_NUMBER);
        shipNum = personInput(1, size);
    }

    /**
     * Метод, для ввода стартовых параметров
     */
    static void inputStartParameters() {
        inputBoardSize();
        inputShipNum();
    }



    /**----------------------------------------------------------------------------------------------------
     * ФАЗА РАССТАНОВКИ КОРАБЛЕЙ
     */


    /**
     * Метод, для вывода сообщения игроку-человеку
     */
    void outputMessage(String message) {
        if (!isComputer) {
            System.out.println(message);
        }
    }

    /**
     * Метод, проверяющий пуста ли ячейка
     */
    private boolean boardBoxIsEmpty(int x, int y) {
        BoardBox box = board.getBoxByCoordinates(x, y);
        return box.isEmpty();
    }


    /**
     * Метод, для разстановки флота
     */
    void placeFleet() {
        int counter = 1;
        while (counter <= shipNum) {
            outputBoard();
            int x = inputCoordinate(Constants.INPUT_VERTICAL);
            int y = inputCoordinate(Constants.INPUT_HORIZONTAL);
            if (boardBoxIsEmpty(x, y) && !isNearShip(x, y)) {
                placeShip(x, y);
                counter++;
            } else {
                outputMessage(Constants.REPEAT_PLACE_MESSAGE);
            }
        }
    }

    /**
     * Метод, для размещения корабля
     */
    private void placeShip(int startX, int startY) {
        Ship ship = new Ship();
        placeShipPart(ship, startX, startY);
        while (true) {
            outputMessage(Constants.SAME_SHIP_PLACE_CONTINUE_MESSAGE);
            if (isEndOfThisShip()) {
                break;
            }
            outputBoard();
            int x = inputCoordinate(Constants.INPUT_VERTICAL);
            int y = inputCoordinate(Constants.INPUT_HORIZONTAL);
            if (boardBoxIsEmpty(x, y) && isNearShip(x, y)) {
                placeShipPart(ship, x, y);
            } else {
                outputMessage(Constants.WRONG_SHIP_PART_PLACE_MESSAGE);
            }
        }
        ships.add(ship);
    }

    /**
     * Метод, для размещение одной части корабля(координата заноситься
     * в координаты частей корабля, а также на поле помечаеться ячейка
     * как занятая кораблем)
     */
    private void placeShipPart(Ship ship, int x, int y) {
        board.changeStatusOfBoxAfterPlace(x, y);
        ship.addCoordinate(x, y);
    }

    /**
     * Метод, для выбора будет ли человек продолжать размещать
     * данный корабль или перейдет к новому
     */
    private boolean isEndOfThisShip() {
        if (isComputer) {
            return rand.nextInt(2) == 0;
        }
        return personInput(0, 1) == 0;
    }


    /**----------------------------------------------------------------------------------------------------
     * ФАЗА БОЯ
     */



    /**
     * Метод, который производит выстрел игроком по полю противника
     */
    void shot(Player player) {
        while (true) {
            int x = inputCoordinate(Constants.INPUT_VERTICAL);
            int y = inputCoordinate(Constants.INPUT_HORIZONTAL);
            if (shootIsNotRepeatInSamePlace(x, y, player)) {
                changeStatusOfBoxAfterShot(player, x, y);
                break;
            } else {
                outputMessage(Constants.REPEAT_SHOT_MESSAGE);
            }
        }
    }

    /**
     * Метод, для внесения изменений в поле и список кораблей после
     * выстрела
     */
    private void changeStatusOfBoxAfterShot(Player player, int x, int y) {
        if (shotWasLuck(player, x, y)) {
            brokeShipPart(player, x, y);
        }
        player.board.changeStatusOfBoxAfterShot(x, y);
    }

    /**
     * Метод, который ломает часть корабля
     */
    private void brokeShipPart(Player player, int x, int y) {
        for (Ship ship : player.ships) {
            if (ship.containsCoordinate(x, y)) {
                ship.brokePart(x, y);
            }
        }
    }

    /**
     * Метод, для проверки попал ли выстрел по кораблю
     */
    private boolean shotWasLuck(Player player, int x, int y) {
        BoardBox box = player.board.getBoxByCoordinates(x, y);
        return box.getStatus().equals(Status.SHIP_PART);
    }


    /**
     * Метод, который проверяет не производиться ли выстрел в место куда
     * уже стреляли
     */
    private boolean shootIsNotRepeatInSamePlace(int x, int y, Player player) {
        BoardBox box = player.board.getBoxByCoordinates(x, y);
        return box != null && isAllowedToFire(box);
    }

    /**
     * Метод, который проверяет можно ли стрелять в данную ячейку поля
     */
    private boolean isAllowedToFire(BoardBox box) {
        return box.getStatus().equals(Status.EMPTY)
                || box.getStatus().equals(Status.SHIP_PART);
    }

    /**
     * Метод, для ввода значения игроком
     */
    private int inputCoordinate(String message) {
        if(isComputer) {
            return rand.nextInt(board.getWidth()) + 1;
        }
        System.out.println(message);
        return personInput(1, board.getWidth());
    }

    /**
     * Метод, для определения находиться ли данная ячейка рядом
     * с кораблем
     */
    private boolean isNearShip(int x, int y) {
        return isNear(x - 1, y - 1) ||
                isNear(x - 1, y) ||
                isNear(x - 1, y + 1) ||
                isNear(x, y - 1) ||
                isNear(x, y + 1) ||
                isNear(x + 1, y - 1) ||
                isNear(x + 1, y ) ||
                isNear(x + 1, y + 1);
    }

    /**
     * Метод, для определения находиться ли в данной ячейке корабль
     */
    private boolean isNear(int x, int y) {
        if(x > 0 && x <= size && y > 0 && y <= size) {
            BoardBox box = board.getBoxByCoordinates(x, y);
            return box.getStatus().equals(Status.SHIP_PART);
        }
        return false;
    }


    /**
     * Метод, для вывода игрового поля
     */
    void outputBoard(boolean shipsAreHidden) {
        for (int i = 1; i <= board.getWidth(); i++) {
            for (int j = 1; j <= board.getHeight(); j++) {
                Status status = board.getBoxByCoordinates(i, j).getStatus();
                if (status.equals(Status.SHIP_PART) && shipsAreHidden) {
                    System.out.print(Status.EMPTY.getStatusChar() + " ");
                } else if (statusWasShot(status) && isNearShip(i , j) && shipsAreHidden) {
                    System.out.print(Status.NEAR_SHIP.getStatusChar() + " ");
                } else {
                    System.out.print(status.getStatusChar() + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Метод, для проверки являеться ли статус одним из статусов
     * в уже стрелявшую ячейку
     */
    private boolean statusWasShot(Status status) {
        return status.equals(Status.ALREADY_SHOT);
    }


    /**
     * Метод, для вывода игрового поля если игрок не компьютер
     */
    private void outputBoard() {
        if(!isComputer) {
            outputBoard(false);
        }
    }

    /**
     * Метод, для вывода флота игрока
     */
    String outputFleetStatus() {
        String res = "Всего: " + getAliveShipNum() + " (";
        for (int i = 1, counter = 0; counter < getAliveShipNum(); i++) {
            int num = getAliveShipNumWithNParts(i);
            counter += num;
            if (num > 0) {
                res += i + "-палубных кораблей: " + num;
            }
            if (counter != getAliveShipNum()) {
                res += ", ";
            }
        }
        return res + ").";
    }

    /**
     * Метод, для получения количества живих кораблей с количеством
     * частей num
     */
    private int getAliveShipNumWithNParts(int num) {
        int counter = 0;
        for (Ship ship : ships) {
            if (ship.isAlive() && ship.getCoordinates().size() == num) {
                counter++;
            }
        }
        return counter;
    }


    /**
     * Метод, для ввода значения игроком-человеком
     */
    static int personInput(int from, int to){
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



    private Random rand = new Random();


}
