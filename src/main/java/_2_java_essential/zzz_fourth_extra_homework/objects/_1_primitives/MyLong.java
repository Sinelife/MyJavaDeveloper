package _2_java_essential.zzz_fourth_extra_homework.objects._1_primitives;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class MyLong extends AbstractEntity<MyLong> {
    private Long value;

    public MyLong(long value) {
        this.value = value;
    }

    public MyLong() {}

    public void setValue(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public MyLong getGeneratedElem() {
        return new MyLong(random.nextLong());
    }

    @Override
    public int compareTo(MyLong o) {
        return this.value.compareTo(o.value);
    }
}
