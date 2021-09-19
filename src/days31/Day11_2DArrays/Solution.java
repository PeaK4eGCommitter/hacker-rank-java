package days31.Day11_2DArrays;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    private static int[][] arr = new int[6][6];

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int maxI = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = getSumOf(i, j);
                if (maxI < sum) {
                    maxI = sum;
                }
            }
        }
        System.out.println(maxI);
        scanner.close();
    }

    private static int getSumOf(int row, int col){
        return
                arr[row + 0][col + 0] + arr[row + 0][col + 1] + arr[row + 0][col + 2]
                        + arr[row + 1][col + 1] +
                        arr[row + 2][col + 0] + arr[row + 2][col + 1] + arr[row + 2][col + 2]
                ;
    }
}
