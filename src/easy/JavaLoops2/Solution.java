package JavaLoops2;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // (a + b * 2^0), (a + b * 2^0 + 2^1) ...
            // it looks like:
            // (a + b * (2^0)), (a + b * (2^0 + 2^1)) ... (a + b * (2^0 + ... + 2^(n-1)))            
            int twoInN = 1;
            int sumInBraces = 0; // keep value from (2^0) to (2^0 + ... + 2^(n-1))
            for(int j = 0; j < n; j++) {
                sumInBraces = sumInBraces + twoInN;
                System.out.print(a + b * sumInBraces + " ");
                twoInN = twoInN * 2;
            }
            System.out.println();
        }
        in.close();
    }
}