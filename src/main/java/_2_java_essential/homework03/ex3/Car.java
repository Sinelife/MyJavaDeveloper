package _2_java_essential.homework03.ex3;

class Car implements Moveable, Eatable {

    private String label;
    private String model;
    private double price;


    Car(String label, String model, double price) {
        this.label = label;
        this.model = model;
        this.price = price;
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public void move() {
        System.out.println("Машина " + model + " движеться в Киев.");
    }

    @Override
    public void move(String whereMove) {
        System.out.println("Машина " + model + " движеться в " + whereMove + ".");
    }

    @Override
    public void eat() {
        System.out.println("В машину " + model + " залили плохой бензин.");
    }

    @Override
    public void eat(String whatEat) {
        System.out.println("В машину " + model + " залили бензин " + whatEat + ".");
    }
}
