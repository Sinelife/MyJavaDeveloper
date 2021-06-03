package _2_java_essential.z_first_extra_homework.old_variant;


/**
 * Клас необходимый для создания обьктов типа Ship(корабль)
 * Каждый корабль имеет кординаты по оси х, у и булевое поле,
 * которая показывает жив ли корабль
 * (Сетеры для координат отсутвуют так как нет необходимости
 * менять расположение кораблей)
 */

class Ship {
    private int x;
    private int y;
    private boolean isAlive;


    Ship(int x, int y) {
        this.x = x;
        this.y = y;
        this.isAlive = true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

}
