import java.util.ArrayList;
import java.util.List;

class PermutationsExample {
//    static   void  swap(ArrayList<Integer> arr,int s, int l){
//        //System.out.println(arr[s]+" "+arr[l]);
//        int temp= arr.get(s);
//        arr.set(s,arr.get(l));
//        arr.set(l,temp);
//        //System.out.println(arr[s]+" "+arr[l]);
//     //   System.out.println("\n");
//    }
//    static int n=0;
//    static  void check (ArrayList<Integer> arr, int st,int l ){
//        n++;
//        if (st==l){
//           for (int k: arr){
//               System.out.print(k+" ");
//           }
//           System.out.println("\n");
//            return;
//        }
//        else{
//    for (int i=st;i<=l;i++){
//                swap(arr,st,i);
//                check(arr,st+1,l);
//                swap(arr,st,i);
//            }
//        }
//    }
 static List<List<Integer>> res= new ArrayList<>();
    static void swap(int  []arr ,int l,int r ){
        int temp= arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    static void permutations(int  [] arr,int  start,int  end){
        if (start==end){

            ArrayList demo=new ArrayList<Integer>() {{ for (int i :arr ) add(i); }};
            res.add(demo);
            System.out.println(demo);
            return;
        }
        else{
            for (int i=start;i<=end;i++){
                swap(arr, start, i);
                permutations(arr, start+1,end);
                swap(arr,start,i);
            }
        }
    }
    public static void main(String[] args){
        //ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1,2,3,4));
       // ArrayList<Integer> integers  = new ArrayList<>() ;
        int [] arr= new int[3];
        arr=  new int []{1,2,3,4};

        permutations(arr,0,arr.length-1);
        //check(arr,0,3);

       // System.out.println(n);
    }

}