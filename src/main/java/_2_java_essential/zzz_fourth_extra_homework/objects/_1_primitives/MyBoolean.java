package _2_java_essential.zzz_fourth_extra_homework.objects._1_primitives;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class MyBoolean extends AbstractEntity<MyBoolean> {
    private Boolean value;

    public MyBoolean(boolean value) {
        this.value = value;
    }

    public MyBoolean() {}

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public MyBoolean getGeneratedElem() {
        return new MyBoolean(service.getGeneratedBoolean());
    }

    @Override
    public int compareTo(MyBoolean o) {
        return this.value.compareTo(o.value);
    }
}
