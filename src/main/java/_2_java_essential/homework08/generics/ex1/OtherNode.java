package _2_java_essential.homework08.generics.ex1;

class OtherNode<E,T> {
    E key;
    T elem;

    OtherNode(E key, T elem) {
        this.key = key;
        this.elem = elem;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }


    @Override
    public String toString() {
        return "OtherNode{\n" +
                "  key = " + key + ",\n" +
                "  elem = " + elem + "\n" +
                '}';
    }
}
