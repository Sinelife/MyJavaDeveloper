package _3_java_proffessional.homework04.ex2;

import static _3_java_proffessional.homework04.ex2.TextReaderService.ReadVariants.*;

public class Tester {

    private static final String FILE_PATH = "C:\\Users\\Ярослав\\JavaDeveloper\\src\\main\\other\\java_proffessional\\homework04\\ex2\\text.txt";

    public static void main(String[] args) {
        TextReaderService service = new TextReaderService(FILE_PATH);

        System.out.println(service.read(ALL_TEXT));
        System.out.println("\n\n\n");

        System.out.println(service.read(HALF_OF_TEXT));
        System.out.println("\n\n\n");

        System.out.println(service.read(ALL_NUMBERS));
        System.out.println("\n\n\n");

        System.out.println(service.read(ALL_WORDS_ON_LETTERS_M_N));
        System.out.println("\n\n\n");

        System.out.println(service.read(ALL_WORDS_MORE_THAN_8_LETTERS));
        System.out.println("\n\n\n");

        System.out.println(service.read(ALL_SYMBOLS_NOT_NUM_OR_LETTER));
        System.out.println("\n\n\n");

        System.out.println(service.read(ALL_WORDS_SORTED_IN_ALPHABET));
        System.out.println("\n\n\n");

        System.out.println(service.read(ALL_WORDS_WITH_2_VOCAL_LETTERS_AND_SORTED_BY_LENGTH));
        System.out.println("\n\n\n");
    }
}
