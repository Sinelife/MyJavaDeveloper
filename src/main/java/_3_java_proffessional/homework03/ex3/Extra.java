package _3_java_proffessional.homework03.ex3;

import java.util.*;

public interface Extra<E> extends Set<E> {

    boolean removeRandom();

    boolean removeRandom(int num);

    boolean removeRandom(E... elems);

    Map<Integer, E> convertToHashMap();

    E[] convertToArray();
}
