package _2_java_essential.homework03.ex3;

class Tornado implements Moveable{

    private int powerMark;
    private double speed;

    Tornado(int powerMark, double speed) {
        this.powerMark = powerMark;
        this.speed = speed;
    }

    public int getPowerMark() {
        return powerMark;
    }

    public void setPowerMark(int powerMark) {
        this.powerMark = powerMark;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }



    @Override
    public void move() {
        System.out.println("Ураган с силой " + powerMark + " балов и скоростью " + speed + "км/год движеться в Киев.");
    }

    @Override
    public void move(String whereMove) {
        System.out.println("Ураган с силой " + powerMark + " балов и скоростью " + speed + "км/год движеться в " + whereMove + ".");
    }
}
