package _2_java_essential.zzz_fourth_extra_homework.objects._1_primitives;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class MyCharacter extends AbstractEntity<MyCharacter> {
    private Character value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public MyCharacter() {}

    public void setValue(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public MyCharacter getGeneratedElem() {
        return new MyCharacter((char) random.nextInt(130));
    }

    @Override
    public int compareTo(MyCharacter o) {
        return this.value.compareTo(o.value);
    }
}
