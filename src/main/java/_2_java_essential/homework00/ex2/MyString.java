package _2_java_essential.homework00.ex2;

class MyString {
    private String value;

    MyString(String value) {
        this.value = value;
    }

    public void concat(String str){
        value += str;
    }

    public void setValue(String str){
        value = str;
    }

    @Override
    public String toString() {
        return value;
    }
}

