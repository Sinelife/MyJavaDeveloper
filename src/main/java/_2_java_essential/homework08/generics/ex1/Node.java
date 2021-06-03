package _2_java_essential.homework08.generics.ex1;

class Node<E> {
    private E elem;


    Node(E elem) {
        this.elem = elem;
    }

    public E getElem() {
        return elem;
    }

    public void setElem(E elem) {
        this.elem = elem;
    }

    @Override
    public String toString() {
        return "Node{" +
                "elem = " + elem +
                '}';
    }
}
