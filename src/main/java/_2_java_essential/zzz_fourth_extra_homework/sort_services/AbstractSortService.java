package _2_java_essential.zzz_fourth_extra_homework.sort_services;

public abstract class AbstractSortService {

    protected static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    protected static <E> Class<?> getElemClass(E e) {
        Class<?> clas = e.getClass();
        //System.out.println(clas);
        while (!clas.getSuperclass().getSimpleName().equals("AbstractEntity")) {
            clas = clas.getSuperclass();
            //System.out.println(clas);
        }
        return clas;
    }
}
