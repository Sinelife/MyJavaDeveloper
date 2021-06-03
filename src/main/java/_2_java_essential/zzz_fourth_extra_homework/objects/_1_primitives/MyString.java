package _2_java_essential.zzz_fourth_extra_homework.objects._1_primitives;
import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.STRING;

public class MyString extends AbstractEntity<MyString> {
    private String value;

    public MyString(String value) {
        this.value = value;
    }

    public MyString() {}

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public MyString getGeneratedElem() {
        return new MyString(service.getGeneratedString(STRING));
    }

    @Override
    public int compareTo(MyString o) {
        return this.value.compareTo(o.value);
    }
}
