#include <bits/stdc++.h>
using namespace std;
const int MM = 2e5+5;
string s; int p[2][MM], Q;
int main(){
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> s >> Q;  int n = s.size();
    for(int i=1; i<=n; i++){
        p[0][i] = p[0][i-1] + (s[i-1] == '0');
        p[1][i] = p[1][i-1] + (s[i-1] == '1');
    }
    for(int i=0, x, y, z; i<Q; i++){
        cin >> x >> y >> z;
        int val = p[z][x-1] + y;
        int pos = lower_bound(p[z], p[z]+n+1, val) - p[z];
        cout << (pos > n? -1 : pos) << "\n";
    }
}