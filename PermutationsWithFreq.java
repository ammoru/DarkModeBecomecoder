import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsWithFreq {
    static  void permu (int arr[] , int end , ArrayList<Integer> sub,int [ ] freq){
        if ( sub.size()== end){
            System.out.println( sub);
            return;
        }
        for ( int i=0;i<end;i++){
            if ( freq[i]==0){
                freq[i]=1;
                sub.add(arr[i]);
                permu(arr,end,sub, freq);
                sub.remove(sub.size()-1);
                freq[i]=0;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr= new int[]{1,2,3};
        int [] freq= new int[ arr.length];
        Arrays.fill(freq,0);
        permu( arr, arr.length, new ArrayList<>(),freq);
    }
}
