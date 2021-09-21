package easy.JavaDequeue;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();// LinkedList не проходит по скорости в 10-ом тесткейсе!
        int n = in.nextInt();
        int m = in.nextInt();
        int maxCount = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Integer val = in.nextInt();
            deque.add(val);
            set.add(val);
            if(deque.size() == m){
                maxCount = Math.max(maxCount, set.size());
                Integer first = deque.removeFirst();
                if(!deque.contains(first)){
                    set.remove(first);
                }
            }
        }
        in.close();
        System.out.println(maxCount);
    }
}
