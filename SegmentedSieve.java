import java.util.Arrays;
import java.util.Scanner;

public class SegmentedSieve {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int start= sc.nextInt();
        int  end= sc.nextInt();
        boolean arr[]= new boolean[end+1];
        Arrays.fill(arr,true);
        for (int i=2;i<(int) Math.sqrt(end);i++){
             if (start %i==0){
                 for (int j=start;j<=end;j+=i) {
                     arr[j] = false;
                 }
             }
             else{
                 int z=((int )start/i  +1)*i;
                 for(int j=z;j<=end;j+=i){
                     arr[j]=false;
                 }
             }
        }
        for (int i=start ;i<=end;i++){
            if (arr[i]==true)
            System.out.print(i+" ");
        }

    }
}
