package easy.JavaBitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        String[] operation = new String[m];
        int[] set = new int[m];
        int[] setIndex = new int[m];

        for (int i = 0; i < m; i++) {
            operation[i] = scan.next();
            set[i] = scan.nextInt();
            setIndex[i] = scan.nextInt();
        }
        scan.close();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for (int i = 0; i < m; i++) {
            if (set[i] == 1) {
                doIt(operation[i], b1, b2, setIndex[i]);
            } else {
                doIt(operation[i], b2, b1, setIndex[i]);
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }

    private static void doIt(String s, BitSet bFirst, BitSet bSecond, int setIndex) {
        switch (s){
            case "AND":
                bFirst.and(bSecond);
                break;
            case "OR":
                bFirst.or(bSecond);
                break;
            case "XOR":
                bFirst.xor(bSecond);
                break;
            case "FLIP":
                bFirst.flip(setIndex);
                break;
            default:// SET
                bFirst.set(setIndex);
                break;
        }
    }
}
