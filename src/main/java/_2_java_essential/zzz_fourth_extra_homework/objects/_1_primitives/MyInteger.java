package _2_java_essential.zzz_fourth_extra_homework.objects._1_primitives;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class MyInteger extends AbstractEntity<MyInteger> {
    private Integer value;

    public MyInteger(int value) {
        this.value = value;
    }

    public MyInteger() {}

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public MyInteger getGeneratedElem() {
        return new MyInteger(service.getGeneratedInteger(-1_000_000, 1_000_000));
    }

    @Override
    public int compareTo(MyInteger o) {
        return this.value.compareTo(o.value);
    }
}
