package easy.JavaBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger first = in.nextBigInteger();
        BigInteger second = in.nextBigInteger();
        System.out.println(first.add(second));
        System.out.println(first.multiply(second));
        in.close();
    }
}
