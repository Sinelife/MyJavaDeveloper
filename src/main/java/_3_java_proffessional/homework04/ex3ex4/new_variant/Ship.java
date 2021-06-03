package _3_java_proffessional.homework04.ex3ex4.new_variant;

import java.util.ArrayList;
import java.util.List;

class Ship {

    private List<Coordinate> coordinates;
    private boolean isAlive;

    Ship() {
        this.coordinates = new ArrayList<>();
        this.isAlive = true;
    }

    void addCoordinate(int x, int y) {
        coordinates.add(new Coordinate(x, y));
    }


    boolean isAlive() {
        return isAlive;
    }

    List<Coordinate> getCoordinates() {
        return coordinates;
    }


    /**
     * Метод, проверяющий не находиться корабль или его часть по
     * заданой координате
     */
    boolean containsCoordinate(int x, int y) {
        for (Coordinate coordinate : coordinates) {
            if(coordinate.getX() == x && coordinate.getY() == y) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод, который ломает часть корабля и отмечает его как мертвый
     * если сломаны все его части
     */
    void brokePart(int x, int y) {
        for (Coordinate coordinate : coordinates) {
            if(coordinate.getX() == x && coordinate.getY() == y) {
                coordinate.setBroken();
                CopyService.addHurtingShipMessageToFile(this);
            }
        }
        if (allPartsAreBroken()) {
            CopyService.addDyingShipMessageToFile(this);
            isAlive = false;
        }
    }

    /**
     * Метод, который проверяет не поломаны ли все части корабля
     */
    private boolean allPartsAreBroken() {
        for (Coordinate coordinate : coordinates) {
            if (!coordinate.isBroken()) {
                return false;
            }
        }
        return true;
    }


    public String getShipInfo() {
        return coordinates.size() + "-палубный корабль";
    }

    void addCoordinate(Coordinate coordinate) {
        coordinates.add(coordinate);
    }
}
