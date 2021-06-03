package _3_java_proffessional.z_first_extrahomework;

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
}
