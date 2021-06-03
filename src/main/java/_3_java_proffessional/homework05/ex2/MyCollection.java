package _3_java_proffessional.homework05.ex2;

public interface MyCollection<E> extends Iterable<E> {

    boolean add(E elem);

    void remove();

    E getTop();

    int size();

    boolean isEmpty();

    boolean isFull();
}
