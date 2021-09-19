package easy.JavaArraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> array = readArray(bufferedReader);
        List<List<Integer>> queries = readArray(bufferedReader);
        bufferedReader.close();

        for (List<Integer> query: queries) {
            if(query.size() != 2){
                System.out.println("ERROR!");
            } else {
                int x = query.get(0);
                int y = query.get(1);
                if(x >= 0 && x < array.size()){
                    List<Integer> line = array.get(x - 1);
                    if(y >= 0 && y < line.size()){
                        System.out.println(line.get(y));
                    } else {
                        System.out.println("ERROR!");
                    }
                } else {
                    System.out.println("ERROR!");
                }
            }
        }
    }

    private static List<List<Integer>> readArray(BufferedReader bufferedReader) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (String arrRowTempItem : arrRowTempItems) {
                int arrItem = Integer.parseInt(arrRowTempItem);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        return arr;
    }
}
