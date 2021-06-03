package _2_java_essential.homework00.ex2;

class My_double {
    private double value;

    My_double(double value) {
        this.value = value;
    }

    public void plus(int digit){
        value += digit;
    }

    public void minus(int digit){
        value -= digit;
    }

    public void multiply(int digit){
        value *= digit;
    }

    public void devide(int digit){
        value /= digit;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
