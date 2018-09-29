package easy.JavaStringTokens;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] subArray = s.replaceAll("[^A-Za-z]"," ").replaceAll("\\s+", " ").trim().split(" ");
        if (subArray[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(subArray.length);
        }
        for(String str : subArray) {
            System.out.println(str);
        }
        scan.close();
    }
}