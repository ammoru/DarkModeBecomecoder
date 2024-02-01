import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParanthasis {
    static  ArrayList< ArrayList<Character>> res= new ArrayList<>();
    static void fun(int n, int cl, int op, String sub){
        if (cl>op) return;
        if ( cl+op == 2*n) System.out.println(sub);
        if ( op==n){
           fun(n,cl+1,op,sub+')');
        }else{
            fun(n,cl,op+1,sub+'(');
            fun(n,cl+1,op,sub+')');
        }

    }
    public static void main(String[] args) {
        ArrayList<Character> sub= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sub.add('(');
       fun (n,0,0,"");

    }
}
