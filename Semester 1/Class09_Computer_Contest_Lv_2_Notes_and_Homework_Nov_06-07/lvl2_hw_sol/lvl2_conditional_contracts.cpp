#include <bits/stdc++.h>
using namespace std;
int n, mx1, mx2; unordered_map<int, int> mp;
int main(){
    cin >> n;
    for(int i=1, x; i<=n; i++){
        cin >> x; mp[x]++;
    }
    for(auto e: mp){
        if(e.second > mx1){
            mx2 = mx1; mx1 = e.second;
        }else if(e.second > mx2){
            mx2 = e.second;
        }
    }
    cout << mx1 + mx2 << endl;
}