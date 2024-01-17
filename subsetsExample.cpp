#include<bits/stdc++.h>
using namespace std;
// vector<vector<int>> sub;
// void check (vector<int> v,int n){
//     if (n==0){
//         cout<<" ";
//         return ;
//     }
//     int temp=n;
//     int end=v.size()-1;
//     vector<int> z;
//     while(temp!=0) {
//         if (temp&1!=0){
//             cout<<v[end]<<" ";
//         }
//         sub.push_back(z);
//         temp>>=1;
//         end--;  
//     }
//      cout<<endl;
//     check(v,--n);
// }
vector<vector<int>> final;
void check2 (vector<int> sub, vector<int> v, int id){
    if (id ==v.size()){
        final.push_back(sub);
        // for (auto i: sub){
        //     cout<< i<<" ";
        // }
        // cout<<endl;
        return ;
    }
    check2(sub,v,id+1);  
    sub.push_back(v[id]);
    check2(sub,v,id+1);
}


int main(){
    vector<int> arr={1,2,3};
    vector<int> s;
    // int a= pow(2,arr.size())-1  ;
    //cout<<a<<endl;
    check2(s,arr,0);
    for (auto i: final){
        for (auto j : i){
            cout<<j<<" ";

        }
        cout<<endl;
    }
   
    
}