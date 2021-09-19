package days31.Day25;

import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    private static void CheckByFor(int val, int start){
        int last = val / 13;
        for(int i = start; i < last; i++){
            if(CheckValDiv(val, i)){
                return;
            }
        }
        System.out.println("Prime");
    }

    private static boolean CheckValDiv(int val, int div){
        if(val >= div * 2){
            int tmp = val / div;
            if(tmp * div == val){
                System.out.println("Not prime");
                return true;
            }
        } else {
            System.out.println("Prime");
            return true;
        }
        return false;
    }

    private static void CheckVal(int val){
        if(val == 1){
            System.out.println("Not prime");
        } else if (!CheckValDiv(val, 2)){
            if (!CheckValDiv(val, 3)){
                if (!CheckValDiv(val, 5)){
                    if (!CheckValDiv(val, 7)){
                        if (!CheckValDiv(val, 11)){
                            if (!CheckValDiv(val, 13)){
                                CheckByFor(val, 17);
                            }
                        }
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            CheckVal(a[i]);
        }
        scanner.close();
    }
}