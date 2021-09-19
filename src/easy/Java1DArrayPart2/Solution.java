package easy.Java1DArrayPart2;

import java.util.*;

/*
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0

 */

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        game[0] = 0;
        return canWin(0, leap, game);
    }

    private static boolean canWin(int currentIndex, int leap, int[] game) {
        if(currentIndex < 0 || game[currentIndex] == 1){
            return false;
        }
        game[currentIndex] = 1;
        if(currentIndex + leap >= game.length || currentIndex == game.length - 1){
            return true;
        }
        return canWin(currentIndex - 1, leap, game) || canWin(currentIndex + leap, leap, game) || canWin(currentIndex + 1, leap, game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}