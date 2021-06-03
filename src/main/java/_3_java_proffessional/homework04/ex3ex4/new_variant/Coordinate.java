package _3_java_proffessional.homework04.ex3ex4.new_variant;

class Coordinate {

    private int x;
    private int y;
    private boolean isBroken;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
        this.isBroken = false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void setBroken() {
        isBroken = true;
    }

    boolean isBroken() {
        return isBroken;
    }

    boolean isNear(Coordinate coordinate) {
        return !isSame(coordinate)
                && x == coordinate.x + 1 || x == coordinate.x - 1 || x == coordinate.x
                && y == coordinate.y + 1 || y == coordinate.y - 1 || y == coordinate.y;
    }

    private boolean isSame(Coordinate coordinate) {
        return x == coordinate.x && y == coordinate.y;
    }
}
