package easy.PatternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases-->0){
            boolean valid = true;
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
            } catch (Exception e) {
                valid = false;
            }
            System.out.println(valid ? "Valid" : "Invalid");
        }
    }
}