import java.sql.SQLOutput;
import java.util.*;
public class Kill_n {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();

        for(int i=1;i<=n;i++)	q.add(i);
        int k1=k;
        while(k>0 && q.size()!=1) {
            if(k==1){
                 q.poll();
//                System.out.println(poll);
            }
            else {
                q.add(q.poll());
            }

            k--;
            if(k==0) k=k1;
//            System.out.println(q);
        }
        System.out.println(q.peek());

    }

}
