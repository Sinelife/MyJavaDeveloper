package _2_java_essential.homework06._1_anonymous_classes.ex1;

import java.math.BigInteger;
import static java.math.BigInteger.*;

public class Tester {
    private static final String FACTORIAL = "Факториал: ";
    private static final String RECURSIVE_FACTORIAL = "Рекурсивный Факториал: ";
    private static final String INT_FACTORIAL = "Только int Факториал: ";
    private static final String BIG_INTEGER_FACTORIAL = "Только BigInteger Факториал: ";
    private static final String INTEGER = "(int)";
    private static final String BIG_INTEGER = "(BigInteger)) ";


    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(FACTORIAL + factorial.intFactorial(10) + INTEGER);
        System.out.println(FACTORIAL + factorial.bigIntegerFactorial(BigInteger.valueOf(10)) + BIG_INTEGER);

        System.out.println("\n\n\n");


        Factorial recursiveFactorial = new Factorial(){
            @Override
            int intFactorial(int n) {
                return factorial(n, 1);
            }

            int factorial(int n, int res) {
                if (n == 1 || n == 0) {
                    return res;
                }
                return factorial(n - 1, res * n);
            }

            @Override
            BigInteger bigIntegerFactorial(BigInteger n) {
                return factorial(n, ONE);
            }

            BigInteger factorial(BigInteger n, BigInteger res) {
                if (n.equals(ONE) || n.equals(ZERO)) {
                    return res;
                }
                return factorial(n.subtract(ONE), res.multiply(n));
            }
        };

        System.out.println(RECURSIVE_FACTORIAL + recursiveFactorial.intFactorial(10) + INTEGER);
        System.out.println(RECURSIVE_FACTORIAL + recursiveFactorial.bigIntegerFactorial(BigInteger.valueOf(10)) + BIG_INTEGER);
        System.out.println("\n\n\n");



        Factorial bigIntegerFactorial = new Factorial(){
            @Override
            int intFactorial(int n) {
                return 0;
            }
        };

        System.out.println(BIG_INTEGER_FACTORIAL + bigIntegerFactorial.intFactorial(10) + INTEGER);
        System.out.println(BIG_INTEGER_FACTORIAL + bigIntegerFactorial.bigIntegerFactorial(BigInteger.valueOf(10)) + BIG_INTEGER);
        System.out.println("\n\n\n");



        Factorial intFactorial = new Factorial(){
            @Override
            BigInteger bigIntegerFactorial(BigInteger n) {
                return ZERO;
            }
        };

        System.out.println(INT_FACTORIAL + intFactorial.intFactorial(10) + INTEGER);
        System.out.println(INT_FACTORIAL + intFactorial.bigIntegerFactorial(BigInteger.valueOf(10)) + BIG_INTEGER);
    }
}
