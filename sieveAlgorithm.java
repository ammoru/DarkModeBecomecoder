import java.util.Scanner;

public class sieveAlgorithm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        boolean arr[]= new boolean[n+1];
        for(int i=2;i<n;i++){
            arr[i]=true;
        }

        for (int i=2 ;i*i <=n;i++){
           // System.out.println("1:"+arr[i]+" " +i);
            //System.out.println("\n");
            if (arr[i]==true){
                for (int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                   // System.out.println("2:"+arr[j]+" "+j);
                }
             //   System.out.println("\n");
            }
        }

        for (int k=0;k<=n;k++){
            if(arr[k]==true){
                System.out.print(k+" ");
            }
        }
    }
}
