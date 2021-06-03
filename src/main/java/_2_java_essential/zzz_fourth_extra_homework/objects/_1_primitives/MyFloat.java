package _2_java_essential.zzz_fourth_extra_homework.objects._1_primitives;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class MyFloat extends AbstractEntity<MyFloat> {
    private Float value;

    public MyFloat(float value) {
        this.value = value;
    }

    public MyFloat() {}

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public MyFloat getGeneratedElem() {
        return new MyFloat(random.nextFloat());
    }

    @Override
    public int compareTo(MyFloat o) {
        return this.value.compareTo(o.value);
    }
}
