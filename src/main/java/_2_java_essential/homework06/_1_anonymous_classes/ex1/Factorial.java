package _2_java_essential.homework06._1_anonymous_classes.ex1;

import java.math.BigInteger;

class Factorial {


    int intFactorial(int n) {
        int res = 1;
        for (int i = 1; i < n; i++) {
            res *= i;
        }
        return res;
    }

    BigInteger bigIntegerFactorial(BigInteger n) {
        BigInteger res = BigInteger.valueOf(1);
        for (BigInteger i = BigInteger.valueOf(1); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            res = res.multiply(i);
        }
        return res;
    }
}