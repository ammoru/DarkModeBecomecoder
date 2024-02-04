import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombinationsWithKValue {
    static int n=0;
    static  void permutations(ArrayList<Integer> arr,int id, int k, ArrayList<Integer> sub,int su){
        if ( sub.size()==k){
            n++;
              System.out.print(n+" :  ");
             System.out.println(sub+" "+ su + "\n");
             return;
         }else {
            for (int i = id; i < arr.size(); i++) {
                sub.add(arr.get(id));
                su+=arr.get(id);
                permutations(arr, id + 1, k, sub,su);
                su-=arr.get(sub.size()-1);
                sub.remove(sub.size() -1);
                id++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int k= sc.nextInt();
       permutations(arr,0, k,new ArrayList<>(),0);
    }
}
