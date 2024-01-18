#include<bits/stdc++.h>
using namespace std;
// void fib(int a, int b, int n){
//     if (n==0){
//         return ;   //n numbers of fibonic numbers
//     }else{
//        cout<<a<<" "; //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 
//         fib(b,a+b,--n);
//     }
// }
//--------------------------------------
vector<int> dp(50,-1);
int fib2(int n){
    if( n==0) return 0;
    if (n==1) return 1;   //to find the specific  postion of fibbonicc
    if (dp[n-1]==-1){
        dp[n-1]=fib2(n-1);
    }
    if (dp[n-2]==-1){
        dp[n-2]=fib2(n-2);
    }
    dp[n]=dp[n-1]+dp[n-2];
    return dp[n];
}
int main(){
    //fib(0,1,20)
    //vector<int> dp(50,-1);
    cout<<fib2(19);


//-----------------------------------------------------------------------
    // int f=0;
    // int s=1;
    // int n=20;
    // while (n--){
    //     int c=f+s;
    //     cout<<f<<" "; //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 
    //     f=s;
    //     s=c;
    // }

}