import java.util.*;

public class Slidingwindow {
    public static void main(String[] args) {
        ArrayList<Integer> sub = new ArrayList<>();
        int arr[]= new int[]{1,2,3,4,5,6,7,8,9};

        int t=6,j=-1,i=0;
        int sum=0;
        while (j<arr.length){
            if(sum==t){
                System.out.println(sub);
            }
            if (t>sum){
                sum+=arr[++j];

            }else{
                sum-=arr[i++];
            }
        }

    }




































//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int arr[]= new int[]{1,2,3,4,4,6,8,9,10};
//        int k= sc.nextInt();
//        int i=0,j=k-1;
//
//        ArrayList<Integer> sub= new ArrayList<>();
//        for (int m=0;m<k;m++){
//            sub.add(arr[m]);
//        }
//        while (j<arr.length){
//            System.out.println( sub);
//            j++;
//            sub.add(arr[j]);
//            sub.remove(0);
//        }
//        // output
//        [1, 2, 3]
//        [2, 3, 4]
//        [3, 4, 4]
//        [4, 4, 6]
//        [4, 6, 8]
//        [6, 8, 9]
//        [8, 9, 10]
//    }
}
