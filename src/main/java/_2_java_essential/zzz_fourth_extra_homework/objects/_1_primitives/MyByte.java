package _2_java_essential.zzz_fourth_extra_homework.objects._1_primitives;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class MyByte extends AbstractEntity<MyByte> {
    private Byte value;

    public MyByte(byte value) {
        this.value = value;
    }

    public MyByte() {}

    public void setValue(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public MyByte getGeneratedElem() {
        return new MyByte((byte) random.nextInt(120));
    }

    @Override
    public int compareTo(MyByte o) {
        return this.value.compareTo(o.value);
    }
}
