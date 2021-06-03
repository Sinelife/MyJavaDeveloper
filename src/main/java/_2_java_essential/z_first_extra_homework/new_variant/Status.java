package _2_java_essential.z_first_extra_homework.new_variant;

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
