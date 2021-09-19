package easy.JavaList;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            int listSize = Integer.parseInt(bufferedReader.readLine().replaceAll("\\s+$", ""));
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> list = new ArrayList<>(listSize);
            for (String string: arrRowTempItems) {
                list.add(Integer.parseInt(string));
            }
            int qSize = Integer.parseInt(bufferedReader.readLine().replaceAll("\\s+$", ""));
            List<String> operation = new ArrayList<>(qSize);
            List<List<Integer>> variables = new ArrayList<>();
            for(int i = 0; i < qSize; i++){
                operation.add(bufferedReader.readLine());
                String[] vars = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                List<Integer> lineVar = new ArrayList<>(2);
                for(String string: vars){
                    lineVar.add(Integer.parseInt(string));
                }
                variables.add(lineVar);
            }

            for (int i = 0; i < operation.size(); i++) {
                String op = operation.get(i);
                List<Integer> vars = variables.get(i);
                switch (op){
                    case "Insert":
                        list.add(vars.get(0), vars.get(1));
                        break;
                    case "Delete":
                        list.remove(vars.get(0).intValue());
                        break;
                }
            }
            for (int i = 0; i < list.size(); i++){
                System.out.print(list.get(i));
                if(i + 1 != list.size()){
                    System.out.print(" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
