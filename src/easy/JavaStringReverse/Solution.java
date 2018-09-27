package JavaStringReverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int l = A.length();
        boolean result = true;
        for(int i = 0; i < l / 2; i++) {
            if(A.charAt(i) != A.charAt(l - i - 1)) {
                result = false;
                break;
            }
        }
        System.out.println( result == true ? "Yes" : "No");
        sc.close();
    }
}