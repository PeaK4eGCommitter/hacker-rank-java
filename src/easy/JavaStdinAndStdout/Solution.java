package JavaStdinAndStdout;

import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}