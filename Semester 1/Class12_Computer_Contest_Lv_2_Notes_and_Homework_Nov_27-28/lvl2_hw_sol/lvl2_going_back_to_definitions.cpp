#include <bits/stdc++.h>
using namespace std;
int n;
int main(){
    cin >> n;  vector<string> a(n);
    for(int i=0; i<n; i++) cin >> a[i];
    sort(a.begin(), a.end(), [](string x, string y){ return x+y > y+x; });
    for(auto x : a) cout << x;
}