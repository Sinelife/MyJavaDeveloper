package _3_java_proffessional.z_first_extrahomework;

enum Status {

    EMPTY((char)183),
    SHIP_PART((char)149),
    ALREADY_SHOT((char) 215),
    DEAD_SHIP('X'),
    DEAD_SHIP_PART('x'),
    NEAR_SHIP('o');

    private char statusChar;

    Status(char statusChar) {
        this.statusChar = statusChar;
    }

    public char getStatusChar() {
        return statusChar;
    }
}
