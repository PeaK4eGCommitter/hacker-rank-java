package JavaDatatypes;

import java.util.*;
import java.io.*;

class Solution{
    private static long BYTE_MIN = -128;
    private static long BYTE_MAX = +127;
    private static long SHORT_MIN = -32_768;
    private static long SHORT_MAX = +32_767;
    private static long INT_MIN = -2_147_483_648;
    private static long INT_MAX = +2_147_483_647;
    private static long LONG_MIN = -9_223_372_036_854_775_808L;
    private static long LONG_MAX = +9_223_372_036_854_775_807L;
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x >= LONG_MIN && x <= LONG_MAX){
                    if(x >= INT_MIN && x <= INT_MAX){
                        if(x >= SHORT_MIN && x <= SHORT_MAX){
                            if(x >= BYTE_MIN && x <= BYTE_MAX){
                                System.out.println("* byte");
                            }
                            System.out.println("* short");
                        }
                        System.out.println("* int");
                    }
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}