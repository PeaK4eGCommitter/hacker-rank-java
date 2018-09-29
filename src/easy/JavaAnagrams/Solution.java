package easy.JavaAnagrams;

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        char[] charsA = a.toLowerCase().toCharArray();
        char[] charsB = b.toLowerCase().toCharArray();
        int counter = 0;
        for(int i = 0; i < charsA.length; i++) {
            for(int j = 0; j < charsB.length; j++) {
                if (charsA[i] == charsB[j]) {
                    charsB[j] = 0;
                    counter ++;
                    break;
                }
            }
        }
        return counter == a.length() && counter == b.length();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}