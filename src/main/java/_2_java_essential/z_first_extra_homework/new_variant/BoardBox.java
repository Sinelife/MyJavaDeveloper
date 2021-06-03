package _2_java_essential.z_first_extra_homework.new_variant;

class BoardBox {
    private int x;
    private int y;
    private Status status;

    BoardBox(int x, int y) {
        this.x = x;
        this.y = y;
        this.status = Status.EMPTY;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isEmpty() {
        return status.equals(Status.EMPTY);
    }
}
