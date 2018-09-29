package easy.JavaPrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    private static boolean checkIt(BigInteger bi) {
        BigInteger testBI = bi.subtract(BigInteger.ONE);
        return testBI.nextProbablePrime().equals(bi);
    }

    public static void main(String[] args) {
        BigInteger bi = scanner.nextBigInteger();
        System.out.println(checkIt(bi) ? "prime" : "not prime");
        scanner.close();
    }
}