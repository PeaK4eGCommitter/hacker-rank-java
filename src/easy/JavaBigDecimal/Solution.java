package easy.JavaBigDecimal;

import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Arrays.sort(s, 0,n, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1 * new BigDecimal(o1).compareTo(new BigDecimal(o2));
            }
        });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
