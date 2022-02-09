#include <bits/stdc++.h>
using namespace std;
int n, mx; map<string, int> cnt; string clr;
int main(){
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> clr;
        cnt[clr]++;
        mx = max(mx, cnt[clr]);
    }
    int rest = n - mx;
    if(rest < mx) cout << 2*rest + 1 << endl;
    else cout << n << endl;
}