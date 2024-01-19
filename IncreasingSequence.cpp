#include<bits/stdc++.h>
using namespace std;
 void fun(vector<int> arr, int t,vector<int> sub, int id,vector<vector<int>> &res,int sum){
        if (id ==arr.size()){
             for (auto i: sub){
                    cout<<i<<" ";
                }
                cout<<endl;
             return;
        }
        int flag=0;
       fun(arr,t,sub,id+1,res,sum);
       if (sub.size()== 0 || sub.back()<arr[id]){
        sub.push_back(arr[id]);
        fun(arr,t,sub,id+1,res,sum);
       }
        
    }
int main(){
    vector<int>candidates={10,1,2,7,6,1,5};
    vector<int> sub;
    vector<vector<int>> res;
    fun(candidates,8,sub,0,res,0);
    
   
}