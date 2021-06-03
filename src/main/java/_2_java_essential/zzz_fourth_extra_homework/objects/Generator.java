package _2_java_essential.zzz_fourth_extra_homework.objects;

import _2_java_essential.zzz_fourth_extra_homework.GeneratorService;

import java.util.Random;

public interface Generator<E> {
    Random random = new Random();
    GeneratorService service = new GeneratorService();

    E getGeneratedElem();

    E[] getGeneratedArray(int size, Class<E> elemClass);
}
