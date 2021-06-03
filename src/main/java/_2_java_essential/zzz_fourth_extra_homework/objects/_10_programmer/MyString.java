package _2_java_essential.zzz_fourth_extra_homework.objects._10_programmer;
import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.STRING;

public class MyString extends AbstractEntity<MyString> {
    private static StringSortVariant sortVariant = StringSortVariant.ALPHABET;

    private String reversedValue;
    private String value;

    public MyString(String value) {
        this.value = value;
        this.reversedValue = new StringBuilder(value).reverse().toString().toLowerCase();
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
        switch (sortVariant) {
            case ALPHABET:
                return this.value.compareTo(o.value);
            case NON_ALPHABET:
                return o.value.compareTo(this.value);
        }
        return this.reversedValue.compareTo(o.reversedValue);
    }

    public static void setSortVariant(StringSortVariant sortVariant) {
        MyString.sortVariant = sortVariant;
    }

    enum StringSortVariant {
        ALPHABET,
        NON_ALPHABET,
        ALPHABET_FROM_END
    }
}
