package easy.JavaExceptionHandlingTryCatch;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String p = in.next();
        in.close();
        try{
            int nn = Integer.parseInt(n);
            int pp = Integer.parseInt(p);
            System.out.println((long) (nn / pp));
        } catch (NumberFormatException nfe) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
