package _2_java_essential.zzz_fourth_extra_homework.objects._1_primitives;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class MyDouble extends AbstractEntity<MyDouble> {
    private Double value;

    public MyDouble(double value) {
        this.value = value;
    }

    public MyDouble() {}

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public MyDouble getGeneratedElem() {
        return new MyDouble(random.nextDouble());
    }

    @Override
    public int compareTo(MyDouble o) {
        return this.value.compareTo(o.value);
    }
}
