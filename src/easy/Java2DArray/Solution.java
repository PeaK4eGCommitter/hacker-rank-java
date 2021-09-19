package easy.Java2DArray;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        int result = 0;
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                int subResult = 0;
                List<Integer> line1 = arr.get(i);
                subResult += line1.get(j) + line1.get(j + 1) + line1.get(j +2);
                List<Integer> line2 = arr.get(i + 1);
                subResult += line2.get(j + 1);
                List<Integer> line3 = arr.get(i + 2);
                subResult += line3.get(j) + line3.get(j + 1) + line3.get(j +2);
//                System.out.println(line1.get(j) + " | " + line1.get(j + 1) + " | " + line1.get(j +2));
//                System.out.println(line2.get(j) + " | " + line2.get(j + 1) + " | " + line2.get(j +2));
//                System.out.println(line3.get(j) + " | " + line3.get(j + 1) + " | " + line3.get(j +2));
//                System.out.println(subResult);
                if(subResult > result){
                    result = subResult;
                }
            }
        }
        System.out.println(result);
    }
}