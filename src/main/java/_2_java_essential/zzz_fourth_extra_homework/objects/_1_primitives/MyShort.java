package _2_java_essential.zzz_fourth_extra_homework.objects._1_primitives;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class MyShort extends AbstractEntity<MyShort> {
    private Short value;

    public MyShort(short value) {
        this.value = value;
    }

    public MyShort() {}

    public void setValue(short value) {
        this.value = value;
    }

    public short getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public MyShort getGeneratedElem() {
        return new MyShort((short) random.nextInt(300));
    }

    @Override
    public int compareTo(MyShort o) {
        return this.value.compareTo(o.value);
    }
}
