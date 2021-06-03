package _3_java_proffessional.z_first_extrahomework;

import static _3_java_proffessional.z_first_extrahomework.Constants.*;

class ShipBattle {

    private Player[] players = new Player[2];


    /**
     * Метод, запускающий игру
     */
    public void run() {
        Player.inputStartParameters();
        initializePlayerList();
        placeAllFleets();
        battle();
    }

    /**
     * Метод, заполняющий массив игроков игроками в определяемом
     * этим методом порядке
     */
    private void initializePlayerList() {
        System.out.println(INPUT_COMP_PLAYER_NUM);
        int compPlayerNum = Player.personInput(0, 2);
        if (compPlayerNum == 1) {
            players[0] = new Player(true);
            players[1] = new Player(false);
        } else if (compPlayerNum == 2) {
            players[0] = new Player(false);
            players[1] = new Player(true);
        } else {
            players[0] = new Player(false);
            players[1] = new Player(false);
        }
    }

    /**
     * Метод, для расстановки кораблей всеми игроками
     */
    private void placeAllFleets() {
        System.out.println(SHIP_PLACEMENT_MESSAGE);
        for (Player player : players) {
            player.placeFleet();
        }
    }

    /**
     * Метод, самого сражения
     */
    private void battle() {
        System.out.println(BATTLE_MESSAGE);
        Player player = players[0];
        while (true) {
            Player nextPlayer = getNextPlayerNum(player);
            outputBothFields(player);
            player.shot(nextPlayer);
            if (isEndOfGame(nextPlayer)) {
                outputBothFields(player);
                outputWinningMessage(player);
                break;
            }
            player = nextPlayer;
        }
    }

    /**
     * Метод, проверяющий победил ли поточный игрок и будет ли
     * закончена игра
     */
    private boolean isEndOfGame(Player player) {
        return player.getAliveShipNum() == 0;
    }

    /**
     * Метод, выводящий сообщение о статусе всех флотов
     */
    private void outputFleetsStatusMessage(Player player) {
        if (!player.isComputer()) {
            System.out.println("Количество ваших кораблей: " + player.outputFleetStatus());
            Player nextPlayer = getNextPlayerNum(player);
            System.out.println("Количество кораблей противника: " + nextPlayer.outputFleetStatus());
        }
    }


    /**
     * Метод, выводящий победное сообщение
     */
    private void outputWinningMessage(Player player) {
        String result = "Победил ";
        if (player.equals(players[0])) {
            result += "первый игрок";
        } else {
            result += "второй игрок";
        }
        if (player.isComputer()) {
            result += "-компьютер";
        }
        result += "!!!";
        System.out.println(result);
    }


    /**
     * Метод, для получение следующего игрока
     */
    private Player getNextPlayerNum(Player player) {
        return player.equals(players[0]) ? players[1] : players[0];
    }

    /**
     * Метод, для вывода полей обоих игроков
     */
    private void outputBothFields(Player player) {
        if (!player.isComputer()) {
            outputFleetsStatusMessage(player);
            Player nextPlayer = getNextPlayerNum(player);
            outputBoardInfo(player, false);
            player.outputBoard(false);
            outputBoardInfo(nextPlayer, true);
            nextPlayer.outputBoard(true);
        }
    }

    /**
     * Метод, для вывода информации перед выводом поля
     */
    private void outputBoardInfo(Player player, boolean isEnemy) {
        String res = "";
        if(player.equals(players[0])) {
            res += "Поле первого игрока";
        } else {
            res += "Поле второго игрока";
        }
        if(player.isComputer()) {
            res += " -компьютера";
        }
        if(isEnemy) {
            res += "(соперник)";
        } else {
            res += "(вы)";
        }
        System.out.println(res);
    }

}
