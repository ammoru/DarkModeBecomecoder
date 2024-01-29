import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PATTERN {
    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static  void pattern3(int n){

        for (int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5 */
    }
    static  void pattern4(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        /*
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5*/
    }
    static  void pattern5(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
         }
    static void pattern6(int n){
        for(int i=1;i<=n+1;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1     */
    }
    static void pattern7(int n){
        for(int i=0;i<=n;i++){
            char star='*';
            //space
            for(int j=0;j<n-i;j++){
                System.out.print(" "+" ");
            }

            //stars
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print(star+" ");
            }

            //space
            for(int j=0;j<n-i;j++){
                System.out.print(" "+" ");
            }

            System.out.println();
        }
             /*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
        */

    }
    static void pattern8(int n){
        char star='*';
        for (int i=0;i<=n;i++){
            //space
            for (int j=0;j<=i;j++){
                System.out.print(" "+" ");
            }
            //stars
            for (int j=0;j<((2*n)-1)-2*i;j++){
                System.out.print(star+" ");
            }
            //space
            for(int j=0;j<=i;j++){
                System.out.print(" "+" ");
            }
            System.out.println();
        }/*
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *

          */
    }
    static  void pattern9(int n){
         //1st half
        for(int j=1;j<=n;j++) {
            //space
            for (int i = 0; i < n-j; i++) {
                System.out.print(" " + " ");
            }
            //stars
                for (int i=0;i<=2*j-2;i++){
                System.out.print("*"+" ");
            }
            //space
            for (int i = 0; i < n-j; i++) {
                System.out.print(" " + " ");
            }
            System.out.println();
        }
        //2nd half
        for(int j=0;j<n;j++) {
            //space
            for (int i = 1; i <= j; i++) {
                System.out.print(" " + " ");
            }
            //stars
            for (int i=0;i<(2*n -1)- 2*j;i++){
                System.out.print("*"+" ");
            }
            //space
            for (int i = 1; i <= j; i++) {
                System.out.print(" " + " ");
            }
            System.out.println();
        }/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
        */

    }
    static  void pattern10(int n){
        //int star=0;
        int stars=0;

        for (int i=0;i<2*n-1;i++){
            // breakdown condition
            if (i>=n) stars--;
            else stars++;
            //loop
            for (int j=0;j<stars;j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
/*
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
        */
    }
    static  void pattern11(int n){
        int start= 1;
            for (int i=0;i<n;i++){
                if (i%2==0) start=1;
                else start=0;
                for(int j=0;j<=i;j++){
                    System.out.print(start+" ");
                    start=1-start;
                }
                System.out.println();
            }
            /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
            */
    }
    static  void pattern12(int n){
        int step=2*n-2;
            for(int i=1;i<=n;i++){
                //nums
                for (int j=1;j<i+1;j++){
                    System.out.print(j+" ");
                }
                //space
                for(int j=0;j<step ;j++){
                    System.out.print(" "+" ");
                }
                //nums
                for (int j=i;j>0;j--){
                    System.out.print(j+" ");
                }
                step-=2;
                System.out.println();
            }/*
        1                 1
        1 2             2 1
        1 2 3         3 2 1
        1 2 3 4     4 3 2 1
        1 2 3 4 5 5 4 3 2 1
        */
    }
    static void  pattern13(int n){
        int num=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }/*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */
    }
    static  void pattern14(int  n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }/*
        A
        A B
        A B C
        A B C D
        A B C D E
                */
    }
    static  void pattern15(int n){
        for (int i=0;i<n;i++){
             for(char ch='A';ch<'A'+n-i;ch++){
                 System.out.print(ch+" ");
             }
            System.out.println();
        }/*
        A B C D E
        A B C D
        A B C
        A B
        A
                */
    }
    static  void pattern16(int n){
        for (int i=0;i<n;i++){
            char ch= (char) ('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }/*
        A
        B B
        C C C
        D D D D
        E E E E E
        */
    }
    static void pattern17(int n){
        int ch =1;
        for (int i=0;i<n;i++){

            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" "+" ");
            }

            //char
            int cut = (i*2 +1)/2;
            for (int j=1;j<=(2*i)+1;j++){
                System.out.print(ch+" ");
                if (j<=cut) ch++;
                else ch--;
            }

            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" "+" ");
            }
            ch++;
            System.out.println();
            ch++;
        }/*
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A     */




    }
    static void pattern18(int n){
        for (int i=0;i<n;i++){
            char ch= (char)('A'+  n - 1-i);
            for (int j=0;j<=i;j++){
                System.out.print((char)(ch +j) +" ");
            }
            System.out.println();
        }/*
        E
        D E
        C D E
        B C D E
        A B C D E

                */

    }
    static void pattern19(int n){
        //1st half
        for(int i=0;i<n;i++){

            // stars
            for (int j=0;j<n-i;j++){
                System.out.print("*"+" ");
            }
            //space
            for(int j=0;j<i*2;j++){
                System.out.print(" "+" ");
            }

            //stars
            for (int j=0;j<n-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        //2nd half
        int step=8;
        for (int i=0;i<n;i++){
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            //space
            for(int j=0;j<step;j++){
                System.out.print(" "+" ");
            }

            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            step-=2;
        }
        /*
         * * * * * * * * * *
         * * * *     * * * *
         * * *         * * *
         * *             * *
         *                 *
         *                 *
         * *             * *
         * * *         * * *
         * * * *     * * * *
         * * * * * * * * * *

         */
    }
    static void pattern20(int n){
        int space=2*n-2;
        for (int i=1;i<=2*n-1;i++){
            int stars=i;
            ///stars comdition
            if (i>n) stars =2*n-i;

            // stars
            for (int j=1;j<=stars;j++){
                System.out.print("*"+" ");
            }
            //space
             for(int j=1;j<=space;j++){
                 System.out.print(" "+" ");
             }
            //stars
            for (int j=1;j<=stars;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            if (i<n) space-=2;
            else space+=2;
        }
    }
    static  void pattern21(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==0||j==0|| j==n-1||i==n-1){
                    System.out.print("*"+" ");
                }
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
        /*
         * * * * *
         *       *
         *       *
         *       *
         * * * * *
         */
    }
    static void pattern22(int n){
        for (int i=0;i<2*n-1;i++){
            for (int j=0;j<2*n-1;j++){
                int left=i;
                int up=j;
                int right=2*n-i-2;
                int down= 2*n-j-2;
                System.out.print(Math.min(Math.min(left,right),Math.min(up,down))+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<2*n-1;i++){
            for (int j=0;j<2*n-1;j++){
                int left=i;
                int up=j;
                int right=2*n-i-2;
                int down= 2*n-j-2;
                System.out.print(n-Math.min(Math.min(left,right),Math.min(up,down))+" ");
            }
            System.out.println();
        }
    /*
0 0 0 0 0 0 0 0 0
0 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 3 4 3 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 2 2 2 2 1 0
0 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0

5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
     */

    }
    public static void main(String[] args
    ) {
        Scanner sc= new Scanner(System.in);
        //int n=sc.nextInt();
        int n=5;
        pattern17(n);
    }
}






