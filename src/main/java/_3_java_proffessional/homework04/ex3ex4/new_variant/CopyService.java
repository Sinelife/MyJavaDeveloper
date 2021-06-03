package _3_java_proffessional.homework04.ex3ex4.new_variant;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static _3_java_proffessional.homework04.ex3ex4.new_variant.Status.SHIP_PART;

class CopyService {
    private static Random rand = new Random();
    private static final String HISTORY_FILE_PATH = "C:\\Users\\Ярослав\\JavaDeveloper\\src\\main\\other\\java_proffessional\\homework04\\ex3ex4\\new_variant\\history.txt";
    private static String FIELD_FILE_PATH = "C:\\Users\\Ярослав\\JavaDeveloper\\src\\main\\other\\java_proffessional\\homework04\\ex3ex4\\new_variant\\fields\\field";

    private static File file = new File(HISTORY_FILE_PATH);
    private static Writer writer;

    private static final String PLAYER_SHOT_MISS = "Игрок промахнулся. ";
    private static final String SHIP_WAS_HURT = "-палубный корабль получил повреждение. ";
    private static final String SHIP_WAS_DESTROYED = "-палубный корабль затонул. ";
    private static final String BATTLE_START = "\nНАЧАЛО БОЯ!";

    static {
        try {
            writer = new FileWriter(file, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Метод для записи текста в файл
     */
    private static void addTextToFile(String text) {
        addTextToFile(text, file);
    }

    private static void addTextToFile(String text, File file) {
        try {
            writer = new FileWriter(file, true);
            char[] chars = text.toCharArray();
            for (char aChar : chars) {
                writer.append(aChar);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для записи информации про раунд в файл
     */
    static void addRoundInfoToFile(int roundNum) {
        if (roundNum % 2 == 0) {
            addTextToFile("\n\n" + (roundNum / 2) + "-ый РАУНД");
        }
    }

    /**
     * Метод для записи информации про координаты корабля в файл
     */
    static void addShipCoordinatesToFile(Ship ship) {
        addTextToFile(getCoordinatesInText(ship));
    }

    /**
     * Метод для записи символа перехода на другую строку в файл
     */
    static void addSpaceBetweenRows() {
        addTextToFile("\n");
    }

    /**
     * Метод для записи сообщения про начало розстановки кораблей в файл
     */
    static void addFleetPlacingMessageToFile(Player player) {
        addTextToFile(getPlacingPlayerInfo(player));
    }

    /**
     * Метод для записи сообщения про начало боя в файл
     */
    static void addStartBattleMessageToFile() {
        addTextToFile(BATTLE_START);
    }

    /**
     * Метод для записи победного сообщения в файл
     */
    static void addWinningMessageToFile(String message) {
        addTextToFile(message);
    }

    /**
     * Метод для записи сообщения о выстреле в файл
     */
    static void addShotMessageToFile(Player player, int x, int y) {
        addTextToFile(getShotMessageInfo(player, x, y));
    }

    /**
     * Метод для записи сообщения о промахе при выстреле в файл
     */
    static void addShotMissMessageToFile() {
        addTextToFile(PLAYER_SHOT_MISS);
    }

    /**
     * Метод для записи сообщения о попадении в корабль в файл
     */
    static void addHurtingShipMessageToFile(Ship ship) {
        addTextToFile(ship.getCoordinates().size() + SHIP_WAS_HURT);
    }

    /**
     * Метод для записи сообщения об уничтожении корабля в файл
     */
    static void addDyingShipMessageToFile(Ship ship) {
        addTextToFile(ship.getCoordinates().size() + SHIP_WAS_DESTROYED);
    }


    /**----------------------------------------------------------------------------*/

    /**
     * Метод, для записи поля в файл
     */
    static void writeFieldToFile(Player player) {
        String path = FIELD_FILE_PATH + player.getBoard().getWidth() + "_" + rand.nextInt(1000) + "_" + rand.nextInt(1000) + ".txt";
        addTextToFile(getBoardInText(player), new File(path));
    }

    /**
     * Метод, для получения поля игрока с кораблями в качестве строки
     */
    private static String getBoardInText(Player player) {
        String res = "";
        int counter = 0;
        for (Ship ship : player.getShips()) {
            int num = 0;
            for (Coordinate coordinate : ship.getCoordinates()) {
                res += "(" +  coordinate.getX() + "," + coordinate.getY() + ")";
                if (num != ship.getCoordinates().size() - 1) {
                    res += " ";
                }
                num++;
            }
            if (counter != player.getShips().size() - 1) {
                res += "\n";
            }
        }
        return res;
    }


    /**
     * Метод, для задавания поля и флота переданого игрока из
     * переданого файла
     */
    static void setBoard(Player player, File file) {
        setShips(player, file);
        setBoardBoxes(player, file);
    }

    /**
     * Метод, для заполнения игрового поля переданого игрока данными
     * про размещение кораблей
     */
    private static void setBoardBoxes(Player player, File file) {
        int size = getSizeOfBoardFromFile(file);
        BoardBox[] boxes = getInitializeBoardBoxes(size);
        for (BoardBox box : boxes) {
            if(fleetHasCoordinate(player, box.getX(), box.getY())) {
                box.setStatus(SHIP_PART);
            }
        }
        Board board = new Board(size, size);
        setFieldValue(board, boxes, "boardBoxes");
        setFieldValue(player, board, "board");
    }

    /**
     * Метод, для заполнения поля переданного обьекта определенным
     * значением(имя поля получено из строки fieldName)
     */
    private static <E, V> void setFieldValue(E elem, V value, String fieldName) {
        try {
            Field field = elem.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(elem, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    /**
     * Метод, проверяющий занята ли данная точка поля кораблем флота
     * данного игрока
     */
    private static boolean fleetHasCoordinate(Player player, int x, int y) {
        for (Ship ship : player.getShips()) {
            for (Coordinate coordinate : ship.getCoordinates()) {
                if (coordinate.getX() == x && coordinate.getY() == y) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Метод, для получения инициализированого масива ячеек поля
     */
    private static BoardBox[] getInitializeBoardBoxes(int size) {
        int counter = 0;
        BoardBox[] boardBoxes = new BoardBox[size * size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                boardBoxes[counter] = new BoardBox(i, j);
                counter++;
            }
        }
        return boardBoxes;
    }


    /**
     * Метод, для получения размера поля из имени файла
     */
    private static int getSizeOfBoardFromFile(File file) {
        char[] chars = file.getName().toCharArray();
        String res = "";
        for (char aChar : chars) {
            if (isDigit(aChar)) {
                res += aChar;
            }
            if (aChar == '_') {
                break;
            }
        }
        return Integer.valueOf(res);
    }

    /**
     * Метод, проверяющий являеться ли символ цыфрой
     */
    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }


    /**
     * Метод, для формирования флота игроку из файла
     */
    private static void setShips(Player player, File file) {
        setFieldValue(player, getFleetFromText(file),"ships");
    }

    /**
     * Метод, для получения списка кораблей(флота) по файлу, из
     * которого будет взят текст, из которого после сформируеться флот
     */
    private static List<Ship> getFleetFromText(File file) {
        String text = getTextFromFile(file);
        List<Ship> ships = new ArrayList<>();
        String[] lines = text.split("\n");
        for (String line : lines) {
            ships.add(getShipFromLine(line));
        }
        return ships;
    }


    /**
     * Метод, для получения обьекта Корабль из строки текста с
     * его координатами
     */
    private static Ship getShipFromLine(String line) {
        Ship ship = new Ship();
        String[] coordinates = line.split(" ");
        for (String coordinate : coordinates) {
            ship.addCoordinate(getCoordinatesFromToken(coordinate));
        }
        return ship;
    }

    /**
     * Метод, для получения обьекта Координата из строки текста с
     * значениями координаты по х и у
     */
    private static Coordinate getCoordinatesFromToken(String token) {
        int[] results = getAllNumbersFromString(token);
        return new Coordinate(results[0], results[1]);
    }

    /**
     * Метод, для получения масива чисел из строки
     */
    private static int[] getAllNumbersFromString(String str) {
        String[] numbersInText = str.replaceAll("\\D*", " ").trim().split("  ");
        int[] numbers = new int[numbersInText.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersInText[i]);
        }
        return numbers;
    }


    /**
     * Метод, для получения текста из файла в виде строки
     */
    private static String getTextFromFile(File file) {
        Reader reader;
        String text = "";
        try {
            reader = new FileReader(file);
            int c;
            while ((c = reader.read()) != -1) {
                text += (char) c;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }



    /**----------------------------------------------------------------------------*/

    /**
     * Метод для получения всех координат корабля в строке
     */
    private static String getCoordinatesInText(Ship ship) {
        List<Coordinate> coordinates = ship.getCoordinates();
        String res = "Корабль(" + coordinates.size() + "-палубный) с координатами: ";
        int counter = 0;
        for (Coordinate coordinate : coordinates) {
            res += "(" + coordinate.getX() + ", " + coordinate.getY() + ")";
            if (counter != coordinates.size() - 1) {
                res += ", ";
            }
            counter++;
        }
        return res + "}.\n";
    }

    /**
     * Метод для получения сообщения об начале размещения кораблей
     */
    private static String getPlacingPlayerInfo(Player player) {
        String res = "Корабли " + player.getTurnNumber() +"-го игрока-";
        if (player.isComputer()) {
            res += "компьютера\n";
        } else {
            res += "человека\n";
        }
        return res;
    }

    /**
     * Метод для получения сообщения об выстреле
     */
    private static String getShotMessageInfo(Player player, int x, int y) {
        String res = "\n" + player.getTurnNumber() + "-ый игрок-";
        if (player.isComputer()) {
            res += "компьютер";
        } else {
            res += "человек";
        }
        res += " стреляет в клетку (" + x + ", " + y + "). ";
        return res;
    }


}
