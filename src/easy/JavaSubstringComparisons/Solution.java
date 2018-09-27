package JavaSubstringComparisons;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String smallest = s.substring(0, k);
        String largest = smallest;
        String test;

        for(int i = 1; i <= s.length() - k; i++) {
            test = s.substring(i, i + k);
            if(largest.compareTo(test) < 0) {
                largest = test;
            }
            if(test.compareTo(smallest) < 0) {
                smallest = test;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}