package easy.JavaSubArray;

import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        int result = 0;
        for (int i = 0; i < count; i++){
            for (int j = i; j < count; j++){
                if(isNegative(array, i, j)){
                    result ++;
                }
            }
        }
        System.out.println(result);
    }
/*
5
1 -2 4 -5 1
*/
    private static boolean isNegative(int[] array, int i, int j) {
        int result = 0;
        for(int k = i; k <= j; k++){
            result+= array[k];
//            System.out.print(array[k] + " | ");
        }
//        System.out.println(" = " + result);
        return result < 0;
    }
}