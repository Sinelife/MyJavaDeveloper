package _3_java_proffessional.homework01.ex2;

import java.util.*;

public interface GroupOperation<E> {

    void addAll(Collection<E> c);

    void addAll(Map<?, E> map);

    void removeAll(int number);
}
