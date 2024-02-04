import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class ArrayGCD
{
    static int gcd1(int a,int b){
        if( a==0)
            return b;
        return gcd1(b%a,a);
    }
     static  public int gcd(int N , int arr[])
    {
        //code here.
        int res=arr[0];
        for(int i=1;i<N;i++){
            res= gcd1(res,arr[i]);
        }
        return res;
    }
static HashMap<Integer, ArrayList<Integer> > map= new HashMap<>();
    public static void main(String[] args) {
        int arr[]={12,16,18,24,32};
//        int res=gcd(5,arr);
//        System.out.println(res);

        ArrayList<Integer> sub= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> sub2= new ArrayList<>(Arrays.asList(5,4,3));
        map.put(0, sub);
        map.put(0, sub2);
        System.out.println(map.get(0));
    }
}

