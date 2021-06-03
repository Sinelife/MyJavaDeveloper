package _3_java_proffessional.homework03.ex2;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        WordCounter counter = new WordCounter("qw dew ddec   e qw ded ed wc rc erc final");
        counter.outputResult();
    }

}
