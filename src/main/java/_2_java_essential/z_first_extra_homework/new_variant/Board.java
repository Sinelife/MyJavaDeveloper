package _2_java_essential.z_first_extra_homework.new_variant;

class Board {
    private static int height;
    private static int width;
    private BoardBox[] boardBoxes;


    Board(int height, int width) {
        Board.height = height;
        Board.width = width;
        this.boardBoxes = initializeBoard();
    }

    private BoardBox[] initializeBoard() {
        int counter = 0;
        BoardBox[] boardBoxes = new BoardBox[height * width];
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                boardBoxes[counter] = new BoardBox(i, j);
                counter++;
            }
        }
        return boardBoxes;
    }

    public int getHeight() {
        return height;
    }

    int getWidth() {
        return width;
    }


    public BoardBox[] getBoardBoxes() {
        return boardBoxes;
    }


    BoardBox getBoxByCoordinates(int x, int y) {
        for (BoardBox box : boardBoxes) {
            if (box.getX() == x && box.getY() == y) {
                return box;
            }
        }
        return null;
    }

    void changeStatusOfBoxAfterShot(int x, int y) {
        for (BoardBox box : boardBoxes) {
            if (box.getX() == x && box.getY() == y) {
                if (box.getStatus().equals(Status.EMPTY)) {
                    box.setStatus(Status.ALREADY_SHOT);
                } else if (box.getStatus().equals(Status.SHIP_PART)) {
                    box.setStatus(Status.DEAD_SHIP);
                }
            }
        }
    }

    void changeStatusOfBoxAfterPlace(int x, int y) {
        for (BoardBox box : boardBoxes) {
            if (box.getX() == x && box.getY() == y) {
                box.setStatus(Status.SHIP_PART);
            }
        }
    }
}
